package com.ibexsys.codewars.other.test;

import com.ibexsys.codewars.other.Xbonacci;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class XbonacciTest {
  private Xbonacci variabonacci;
  
  @Before
  public void setUp() throws Exception {
    variabonacci = new Xbonacci();
  }

  @After
  public void tearDown() throws Exception {
    variabonacci = null;
  }
  
  private double precision = 1e-10;
  
  @Test
  public void basicTestsMine() {

  	  assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
      assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
      assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);
      assertArrayEquals(new double[] {7,13,16}, variabonacci.tribonacci(new double []{7,13,16},3), precision);
       
  }
  
}

