package com.Syndicate.Calculator;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Testing extends TestCase {

  App a=new App();
  
  @Test
  public void testAdd() { 
  
  int expectedResult = 35;  //Act 
  long result = a.add();
  }
}