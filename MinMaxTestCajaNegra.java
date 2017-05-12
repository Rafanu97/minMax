package minMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaNegra {

	@Test
	public void introducirNumerosPositivos() {
		int[] me = new int [3];
		me [0]=3;
		me [1]=2;
		me [2]=5;
		int [] sol = new int [2];
		sol[0]=2;
		sol[1]=5;
		assertArrayEquals(  sol , minMax.minMax(me) ) ;
		;
		
	}
	
	@Test
	public void compararVectorNulo()  {
		int [] vacio = new int [0];
		assertEquals (null , minMax.minMax(vacio));
		
	}
	@Test
	public void compararVectorValoresNegativos (){
		int [] me = new int [3];
		me [0]=-3;
		me [1]=-2;
		me [2]=-5;
		int [] sol =new int [2];
		sol [0]= -5;
		sol [1]= -2;	
		assertArrayEquals (sol, minMax.minMax(me));
	}
	
	@Test
	public void ArrayValorUnico()  {
		int [] num = new int [1];
		num [0]=1;
		int [] sol = new int [2];
		sol [0]= 1;
		sol [1]=1;
		assertArrayEquals (sol, minMax.minMax(num));
		
	}
	
	@Test
	public void introducirNumeroPositivoYNegativo (){
		int [] me = new int [3];
		me [0]=-3;
		me [1]=-2;
		me [2]= 5;
		int [] sol =new int [2];
		sol [0]= -3;
		sol [1]= 5;	
		assertArrayEquals (sol, minMax.minMax(me));
	}
	

}
