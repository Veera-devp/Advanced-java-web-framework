package com.Syndicate.Calculator;
public class App 

{
  public int add()
    {
      int x=10;
      int y=20;
      System.out.println("Subtraction of x and y is :"+(x+y));
      return x+y;
    }
  public int sub()
    {
      int x=10;
      int y=20;
      System.out.println("Subtraction of x and y is :"+(x-y));
      return x-y;
    }
  
  
    public static void main( String[] args )
    {
       App a=new App();
       a.add();
       a.sub();
    }
}
