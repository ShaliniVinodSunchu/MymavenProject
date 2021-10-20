package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
WebDriver ldriver;
protected LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	
	
	
}

@FindBy(name="SpendSave")
WebElement SpendandSaveH= ldriver.findElement(By.xpath("//li//a[@href='https://www.aspiration.com/spendandsave']"));
@FindBy(name="AspirationH")
WebElement AspirationH1=ldriver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.iEjEkW:nth-child(1) div.Flex-sc-1kj10zc-0.hXOOzb:nth-child(1) div.Flex-sc-1kj10zc-0.bcdqJ:nth-child(2) div.Flex-sc-1kj10zc-0.kZcPmK:nth-child(1) > span.Text-sc-1yqq6iv-0.czObYy.atom-text"));
@FindBy(name="AspirationPlusH")
WebElement AspirationPlusH1=ldriver.findElement(By.cssSelector("div.css-184k64j-SkeletonTheme section.Flex-sc-1kj10zc-0.InfoSection__Section-sc-17h2ux1-0.jcpHDO.blwkKx.content-section:nth-child(9) div.Flex-sc-1kj10zc-0.InfoSection__Wrapper-sc-17h2ux1-3.kTgtnU div.Flex-sc-1kj10zc-0.InfoSection__Content-sc-17h2ux1-4.iEjEkW:nth-child(1) div.Flex-sc-1kj10zc-0.hXOOzb:nth-child(1) div.Flex-sc-1kj10zc-0.jiowtC:nth-child(3) div.Flex-sc-1kj10zc-0.jfVoNJ:nth-child(1) > span.Text-sc-1yqq6iv-0.czObYy.atom-text"));;
@FindBy(name="GetStartedH")
WebElement GetStartedH1=ldriver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]"));

@FindBy(name="MonthlyH")
WebElement MonthlyH1=ldriver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[7]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]"));

@FindBy(name="YearlyH")
WebElement YearlyH1;

public void click()
{
	GetStartedH1.click();
}




}
