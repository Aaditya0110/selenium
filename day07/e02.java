package day07;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class e02 {
  int a,b,c;
  @BeforeSuite
  public void getValue() {
	  a=6;
	  b=4;
  }
  
  @Test(priority=1)
  public void add(){
	  c=a+b;
	  Assert.assertEquals(c, 10);
  }
  @Test(priority=3)
  public void subract() {
	  c=a-b;
	  Assert.assertEquals(c, 2);
  }
  @Test(priority=2)
  public void multiply() {
	  c=a*b;
	  Assert.assertEquals(c, 24);
  }
  @Test(priority=4)
  public void division() {
	  c=a/b;
	  Assert.assertEquals(c, 1);
  }
}
