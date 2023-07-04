package src.Runner_Script;

import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import src.Generic_Script.Base_Test;
import src.Pom_Srcipt.Genric_Pom1;

public class Test_Srcipt extends Base_Test {
	@Test (DataProvider="testdata")
	public void test1(String d1,String d2)
	{
 Genric_Pom1 p = new Genric_Pom1()
		p.passUn(d2);
		p.passPw(d2);
		p.btn();
		assert.fail(d2);
	}
	@DataProvider(name="testData")
	public object[][]createData(  )
		
		
		
	}
	
}
