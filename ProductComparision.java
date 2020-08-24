package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductComparision {
	public class Login {
		 WebDriver driver=null;
		@Given("^Launch the browser$")
		public void open_the_browser() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		@When("^Open the URL \"([^\"]*)\"$")
		public void open_the_URL(String url) throws Throwable {
			driver.get (url);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

		@Then("^Click on My Account ->login$")
		public void click_on_My_Account_login() throws Throwable {
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/i")).click();
			driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		}

		@Then("^Enter registered user name  and password$")
		public void enter_registered_user_name_and_password(DataTable credentials) throws Throwable {
			List <List <String>> data=credentials.raw();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(data.get(0).get(0));
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(data.get(0).get(1));
		}
		  
		@Then("^Click on login button$")
		public void click_on_login_button() throws Throwable {
	driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

	@Then("^User should enter the keyword and hit enter$")
	public void user_should_enter_the_keyword_and_hit_enter() throws Throwable {
	driver.findElement(By.xpath("//*[@id='search']/input")).sendKeys("Samsung Galaxy Tab");
	driver.findElement(By.xpath("//*[@id='search']/span/button")).sendKeys(Keys.ENTER);
	}

	@Then("^Select monitors, check in sub category and click search$")
	public void select_monitors_check_in_sub_category_and_click_search() throws Throwable {
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[6]")).click();	
	}

	@Then("^Click on \"([^\"]*)\" tab and sort in desc$")
	public void click_on_tab_and_sort_in_desc(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='input-sort']")).click();
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		Select price=new Select(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")));
		price.selectByIndex(4);
	} 

	@Then("^Click on \"([^\"]*)\" for the first three phones\" and click on Close button$")
	public void click_on_for_the_first_three_phones_and_click_on_Close_button(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[3]")).click();
	driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[3]")).click();
	driver.findElement(By.xpath("//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[3]")).click();
	driver.findElement(By.id("compare-total")).click();
		
	}

	@When("^Click on \"([^\"]*)\" and on on the first phone link on the page\\.$")
	public void click_on_and_on_on_the_first_phone_link_on_the_page(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/table/tbody[1]/tr[1]/td[2]/a/strong")).click();
		
		
	}

	@Then("^Click on Add to Cart and  Shopping Cart displayed on ribbon message$")
	public void click_on_Add_to_Cart_and_Shopping_Cart_displayed_on_ribbon_message() throws Throwable {
		driver.findElement(By.xpath("//*[@id='button-cart']")).click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("^Click on Check out buttons\\.$")
	public void click_on_Check_out_buttons() throws Throwable {
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^Click on Check out button and Click on Check out button\\.$")
	public void click_on_Check_out_button_and_Click_on_Check_out_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a")).click();
	}

	/*@Then("^Click on confirm order$")
	public void click_on_confirm_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Click on browser Back button, Click on \"([^\"]*)\" from \"([^\"]*)\"tab$")
	public void click_on_browser_Back_button_Click_on_from_tab(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	@Then("^Click on \"([^\"]*)\", Click on Extras -> Specials in the footer$")
	public void click_on_Click_on_Extras_Specials_in_the_footer(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[4]/a")).click();
	}

	@Then("^Click on List \\(or\\) Grid whichever is enabled$")
	public void click_on_List_or_Grid_whichever_is_enabled() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/div/button[1]")).click();
	}

	//@Then("^Click on \"([^\"]*)\"$")
	//public void click_on(String Logout) throws Throwable {
		//driver.findElement(By.xpath	
		
	}
	   
	}
