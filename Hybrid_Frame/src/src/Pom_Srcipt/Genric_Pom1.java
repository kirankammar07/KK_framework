package src.Pom_Srcipt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Genric_Pom1 
{
	@FindBy(id="email")
	private WebElement unField;
	
	@FindBy(id="pass")
	private WebElement pwField;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public void Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void passUn(String un)
	{
		unField.sendKeys(un);
		
	}
	public void passPw(String pw)
	{
		pwField.sendKeys(pw);
	}
	public void btn()
	{
		loginbtn.click();
	}
	
	
}

