package TestScripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.Random_Num;
import com.crm.Pom.pric;
@Listeners(com.crm.Listeners.Edge_case_and_Error_Handling.class)

public class Edge_case_$_Error_Handling extends BaseClass{

	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		
     	pric p=new pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		p.Home.click();
      
}}
