package minMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCiclomatica {

	@Test
	public void FallaPrimeraCondicionArrayNulo() { //PRIMER CAMIN0
		int []xs = null;
		int [] res=null;
		assertArrayEquals(xs, minMax.minMax(res));
		
	}

	@Test
	public void FallaPrimeraCondicionArrayVacio() {       //PRIMER CAMINO  
		int []xs = new int [0];
		int []res= null;
		assertArrayEquals(null, minMax.minMax(res));
		
	}
	
	@Test
	public void FallaSegundaCondicion (){  //SEGUNDOCAMINO
		int []xs = new int [2];
		xs[0]= 1;
		xs[1]= 1;	
		int []res ={1,1};
		assertArrayEquals(xs, minMax.minMax(res));
	}	
	
	@Test
	public void SeCumpleSegundaCondicion (){ //TERCERCAMINO
		int []xs={1,2};
		int []res ={1,2};
		assertArrayEquals(xs, minMax.minMax(res));
	}
	
	@Test
	public void SeCumpleTerceraCondicion()  {   //CUARTOCAMINO (SI NO SE CUMPLE ESTE PASA AL CAMINO 3)
		int []xs={1,3};
		int []res ={3,1};
		assertArrayEquals(xs, minMax.minMax(res));
	}
	
}
