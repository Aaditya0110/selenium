package day09;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class e01 {
  int a,b,c;
  @Test(dataProvider = "dp",priority=1)
  public void add(Integer a	,Integer b) {
	c=a+b;
	System.out.println("Sum "+c);
	Assert.assertEquals(c, 1);
  }
  
  @Test(dataProvider = "dp",priority=2)
  public void sub(Integer a	,Integer b) {
		c=a-b;
		System.out.println("Diff "+c);
		Assert.assertEquals(c, -1);
  }
  
  @Test(dataProvider = "dp",priority=3)
  public void mlt(Integer a	,Integer b) {
		c=a*b;
		System.out.println("Product "+c);
		Assert.assertEquals(c, 0);
  }
  
  @Test(dataProvider = "dp",priority=4)
  public void div(Integer a	,Integer b) {
		c=a/b;
		System.out.println("Div "+c);
		Assert.assertEquals(c, 0);
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 0, 1 },
      new Object[] { 4, 2 },
    };
  }
}
