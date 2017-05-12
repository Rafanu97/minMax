package minMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaBlanca {

	@Test
	public void statementCoverage() {
		minMax minMax = new minMax();
		int [] pos = new int [5];
		pos [0]=3;
		pos [1]=1;	 
		pos [2]=1;
		pos [3]=5;
		pos [4]=6;
		int [] sol = {1,6};
		int [] nulo = null; 
		int [] solnul= null;
		int [] tamcero= null;
		int [] soltamcero = new int [0];
		
		
		assertArrayEquals (sol, minMax.minMax(pos));
		assertArrayEquals (nulo, minMax.minMax(solnul));
		assertArrayEquals (tamcero, minMax.minMax(soltamcero));
	}
	
	@Test
	public void deciisionCoverage() {   // (xs!=null! && tamaño!=0) n>ma & n<mi
		minMax minMax = new minMax();
		int [] pos = new int [5];
		pos [0]=3;
		pos [1]=1;	 
		pos [2]=1;
		pos [3]=5;
		pos [4]=6;
		int [] sol = {1,6};
		int [] nulo = null; 
		int [] solnul= null;
		int [] tamcero= null;
		int [] soltamcero = new int [0];
		
		
		assertArrayEquals (sol, minMax.minMax(pos));
		assertArrayEquals (nulo, minMax.minMax(solnul));
		assertArrayEquals (tamcero, minMax.minMax(soltamcero));
		
		
	}
	
	@Test
	public void conditionCoverage() {
		minMax minMax = new minMax();
		int[] pos = new int [4];
		pos [0]=2;
		pos [1]=5;	 
		pos [2]=2;
		pos [3]=0;
        int[] sol = {0,5};
      
 
		int [] nulo = null; 
		int [] solnul= null;
		int [] tamcero= null;
		int [] soltamcero = new int [0];
		
        assertArrayEquals(pos,minMax.minMax(sol));
        assertArrayEquals(nulo,minMax.minMax(solnul));
        assertArrayEquals(tamcero,minMax.minMax(soltamcero));
		
	}
	
	@Test
	public void decisionConditionCoverage() {
		
		
	}

}
