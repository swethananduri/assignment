package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then; 

public class Register {
	public WebDriver driver=null;

		@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	   
	}

	@Then("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
	    driver.get (url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("^I click on My Account and Register\\.$")
	public void i_click_on_My_Account_and_Register() throws Throwable {
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i")).click();
	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();		 
	    
	}

	@Then("^enter -Name\\(s\\), Email, Phone, Company and Address, City, Post Code\\.Select values from the list for Country and State/Region$")
	public void enter_Name_s_Email_Phone_Company_and_Address_City_Post_Code_Select_values_from_the_list_for_Country_and_State_Region() throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("Venkatesh");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input")).sendKeys("Bandaru");
	
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input")).sendKeys("venkatesh.bandaru@gmail.com");
			
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input")).sendKeys("9143382084");
			
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")).sendKeys("Abhilasha@20");
			
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input")).sendKeys("Abhilasha@20");			  
			
	}

	@Then("^Check privacy policy and click continue$")
	
	public void check_privacy_policy_and_click_continue() throws Throwable {
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();				  
	    
	}

	@Then("^Click on contact link and type the enquiry$")
	public void click_on_contact_link_and_type_the_enquiry() throws Throwable {
		driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[1]/div/input")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[2]/div/input")).sendKeys("venkatesh.bandaru@gmail.com");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[3]/div/textarea")).sendKeys("H No:45, 1-2/23/23,Bheemli Road");
	driver.findElement(By.xpath("//*[@id='content']/form/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();			
				
	    
	}

	@Then("^click on Samsung galaxy tab on home page and then on Review tab below$")
	public void click_on_Samsung_galaxy_tab_on_home_page_and_then_on_Review_tab_below() throws Throwable {
		driver.findElement(By.xpath("//*[@id='slideshow0']/div/div[2]/a/img")).click();
	driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div[3]/p/a[2]")).click();

   	}

	@Then("^fill the name and give the rating as the error code and click on continue$")
	public void fill_the_name_and_give_the_rating_as_the_error_code_and_click_on_continue() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[2]/div/input")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[3]/div/textarea")).sendKeys("The product is very good and satisfied my requirement");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[2]/form/div[4]/div/input[5]")).click();
		driver.findElement(By.xpath("//*[@id='button-review']")).click();

	}

	@Then("^click on add to wish list and close the success ribbon message$")
	public void click_on_add_to_wish_list_and_close_the_success_ribbon_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("venkatesh.bandaru@gmail.com");
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("Abhilasha@20");
		driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
	//WebElement loginlink;
//loginlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/a[1]")));
//loginlink.click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("venkatesh.bandaru@gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Abhilasha@20");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		
	}

//	@Then("^click on wishlist link$")
//	public void click_on_wishlist_link() throws Throwable {
//		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[5]")).click();
		  
//	}

	@Then("^Click on \"([^\"]*)\", get the value and display it$")
	public void click_on_get_the_value_and_display_it(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='form-currency']/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form-currency']/div/ul/li[2]/button")).click(); 
	}

	@Then("^Click on Euro, get the value and display it$")
	public void click_on_Euro_get_the_value_and_display_it() throws Throwable {
		driver.findElement(By.xpath("//*[@id='form-currency']/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form-currency']/div/ul/li[1]/button")).click();

	    	}

	@Then("^Click on US Dollar, get the value and display it$")
	public void click_on_US_Dollar_get_the_value_and_display_it() throws Throwable {
		driver.findElement(By.xpath("//*[@id='form-currency']/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id='form-currency']/div/ul/li[1]/button")).click();
   
	}

	@Then("^click on Add to cart and close the success message$")
	public void click_on_Add_to_cart_and_close_the_success_message() throws Throwable {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[1]/table/tbody/tr/td[6]/button")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='account-wishlist']/div[1]/button")).click();

	}
	@Then("^click on remove icon on the product in \"([^\"]*)\"$")
	public void click_on_remove_icon_on_the_product_in(String arg1) throws Throwable {
driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/table/tbody/tr/td[6]/a")).click();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	@Then("^click on continue and log out$")
	public void click_on_continue_and_log_out() throws Throwable {
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
		
		
	}


}
