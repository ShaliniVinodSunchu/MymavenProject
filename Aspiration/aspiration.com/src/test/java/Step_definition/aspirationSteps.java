package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.hamcrest.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;


public class aspirationSteps extends LoginPage{
	
	aspirationSteps(WebDriver rdriver) {
		super(rdriver);
		// TODO Auto-generated constructor stub
	}



	WebDriver driver;
	



	
	@Given("^I want launch chrome browser$")
	public void i_want_launch_chrome_browser() throws Throwable {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("^I open aspiration home page$")
	public void i_open_aspiration_home_page() throws Throwable {
	   
		driver.get(" https://aspiration.com/");
	}

	@Then("^I check products under Spend and Save$")
	public void i_check_products_under_Spend_and_Save() throws Throwable {
	   WebElement spend_save = driver.findElement(By.xpath("//li//a[@href='https://www.aspiration.com/spendandsave']"));
	   spend_save.click();
	   WebElement product1= driver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.ikKWSi:nth-child(2) div.Flex-sc-1kj10zc-0.lmvHyn:nth-child(2) ul.Flex-sc-1kj10zc-0.List-sc-2nbxm-0.iBzqkW.hprkYV:nth-child(3) li.Flex-sc-1kj10zc-0.hfJlfw:nth-child(1) div.Flex-sc-1kj10zc-0.dsDCvk div.Flex-sc-1kj10zc-0.eNnhGn:nth-child(1) > p.Text-sc-1yqq6iv-0.kWKtuu.atom-text"));
	   String prod_name=product1.getText();
	  Assert.assertEquals(prod_name,prod_name);
	  
	}
	@Then("^I check two card products$")
	public void i_check_two_card_products() throws Throwable {
		 WebElement cardProd1= driver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.iEjEkW:nth-child(1) div.Flex-sc-1kj10zc-0.hXOOzb:nth-child(1) div.Flex-sc-1kj10zc-0.bcdqJ:nth-child(2) div.Flex-sc-1kj10zc-0.kZcPmK:nth-child(1) > span.Text-sc-1yqq6iv-0.czObYy.atom-text"));
		 
		   String cardProdName1=cardProd1.getText();
		  Assert.assertEquals(cardProdName1, "ASPIRATION");
		  WebElement cardProd2= driver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.iEjEkW:nth-child(1) div.Flex-sc-1kj10zc-0.hXOOzb:nth-child(1) div.Flex-sc-1kj10zc-0.jiowtC:nth-child(3) div.Flex-sc-1kj10zc-0.jfVoNJ:nth-child(1) > span.Text-sc-1yqq6iv-0.czObYy.atom-text"));
		  //("/html[1]/body[1]/div[1]/div[1]/section[7]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]"));
		   String cardProdName2=cardProd2.getText();
		  Assert.assertEquals(cardProdName2, "ASPIRATION PLUS");
		  
	}

	@Then("^I check email sign up$")
	public void i_check_email_sign_up() throws Throwable {
	    
		
		WebElement getAspiration = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/ul[2]/li[2]/button[1]"));
				//("div.css-184k64j-SkeletonTheme header.Box-sc-1jvxza8-0.Grid-sc-dxp4a4-0.Header__StyledGrid-sc-gbj1se-0.lcKdJE.bjHakC.leMJNB.header:nth-child(2) ul.Flex-sc-1kj10zc-0.List-sc-2nbxm-0.eCvQNv.hprkYV:nth-child(3) li.Flex-sc-1kj10zc-0.hrimAA:nth-child(2) > button.Element-sc-1dc3ws0-0.Button-sc-19upfmc-0.eciJRb.hVmzDW.button.null"));

		getAspiration.click();
		
		String modal= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")).getText();
		//)("body.ReactModal__Body--open:nth-child(2) div.ReactModalPortal:nth-child(25) div.ReactModal__Overlay.ReactModal__Overlay--after-open div.ReactModal__Content.ReactModal__Content--after-open div.Flex-sc-1kj10zc-0.bxlpgG div.Flex-sc-1kj10zc-0.kCxUoH:nth-child(2) form.Flex-sc-1kj10zc-0.dXxsJX:nth-child(3) div.Flex-sc-1kj10zc-0.dPEQCs:nth-child(2) > button.Element-sc-1dc3ws0-0.Button-sc-19upfmc-0.jDLIcg.iJTDXa.button.null")).getText();
		Assert.assertEquals("GET STARTED", modal);
	}

@Then("^I check Aspiration Plus monthly and yearly plan$")
public void i_check_Aspiration_Plus_monthly_and_yearly_plan() throws Throwable {
    //WebElement AspPlus=driver.findElement(By.xpath(""));
	  WebElement Aspplus= driver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.iEjEkW:nth-child(1) div.Flex-sc-1kj10zc-0.hXOOzb:nth-child(1) div.Flex-sc-1kj10zc-0.jiowtC:nth-child(3) div.Flex-sc-1kj10zc-0.jfVoNJ:nth-child(1) > span.Text-sc-1yqq6iv-0.czObYy.atom-text"));
String asplus=Aspplus.getText();
Assert.assertEquals(asplus, "ASPIRATION PLUS");

}

@Then("^I check the monthly plan$")
public void i_check_the_monthly_plan() throws Throwable {
    String monthlyplan= driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
    Assert.assertEquals(monthlyplan, "$7.99/mo");
}

@Then("^I check the yearly plan$")
public void i_check_the_yearly_plan() throws Throwable {
	String yearlypaln= driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[2]/p[2]")).getText();
    Assert.assertEquals(yearlypaln, "$5.99/mo if you pay annually");
    
}


			   
	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	   
	}


}
