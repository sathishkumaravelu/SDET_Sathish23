package mandatoryHomeWork.foundation.RedoDailyConnect;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Selenium_Assessment_1_CreateLead {

	public static String baseURL = "http://leaftaps.com/opentaps/control/main";

	@Test
	public void createLead() {

		WebDriver driver = new ChromeDriver();
		// implicit wait of 60 sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(baseURL);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[contains(text(),'Leads')]")).click();

		driver.findElement(By.xpath("(//*[text()='Create Lead'])[1]")).click();
		
		
		//createLeadForm_companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumaravelu");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing create lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathish@test.com");
		WebElement stateDDElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(stateDDElement);
		stateDD.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//*[@value='Create Lead']")).click();
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals("View Lead | opentaps CRM", actualTitle);
		
		driver.quit();
		
	}
}
