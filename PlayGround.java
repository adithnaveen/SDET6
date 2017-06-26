

import static org.junit.Assert.*;



import java.util.concurrent.TimeUnit;



import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import com.fannie.utility.Driver;



// this class is to show working of navigation

public class Test02 {

	WebDriver driver ; 

	String baseURL1;

	String baseURL2;

	

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);

	}



	@Before

	public void setUp() throws Exception {

		driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL1 = "http://fanniemae.com/portal/index.html";

		baseURL2 = "https://google.com";

		driver.get(baseURL1);

	}



	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	

	@Test

	public void test() throws Exception{

		String baseUrl1Title = driver.getTitle();

		System.out.println("Base Url1 title -> " + baseUrl1Title);

		

		Thread.sleep(2000);

		

		driver.navigate().to(baseURL2);

		String baseUrl2Title = driver.getTitle();

		System.out.println("BaseURL 2 Title -> " + baseUrl2Title);

	

		Thread.sleep(2000);

		System.out.println("going back....");

		driver.navigate().back();

		

		Thread.sleep(1500);

		System.out.println("Before Refresh... ");

		driver.navigate().refresh();

		System.out.println("Before forward... ");

		driver.navigate().forward();

		

		System.out.println("current URL after forward is " + driver.getCurrentUrl());

		

		System.out.println("------------------------");

		

		System.out.println(driver.getPageSource());

		

		
	}
	}


	----------------------------------------------------------



	

import static org.junit.Assert.*;



import java.util.concurrent.TimeUnit;



import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import com.fannie.utility.Driver;



public class Test03 {

	WebDriver driver ; 

	String baseURL;

	

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);

	}



	@Before

	public void setUp() throws Exception {

		driver = new ChromeDriver();

	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL = "http://google.com";

		driver.get(baseURL);

	}



	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	

	@Test

	public void test() {

		WebElement element1 = driver.findElement(By.id("lst-ib"));

		System.out.println("Element1 Enables -> " +element1.isEnabled());

		element1.sendKeys("places to visit");

		

		

		// below code does not work since it is 

		// disabled 

		/*

		  WebElement element2 = driver.findElement(By.id("gs_taif0"));

		 

		System.out.println("Element 2 enabled -> " + element2.isEnabled());

		element2.sendKeys("places to visit");

		*/

		// try with this 

		// gs_htif0 (@ Your leisure) 

		

	}



}

-------------------------------------------------------------------

	// This program is to show working of radio button 

	

import static org.junit.Assert.*;



import java.util.concurrent.TimeUnit;



import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



import com.fannie.utility.Driver;



public class Test04 {

	WebDriver driver ; 

	String baseURL;

	

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);

	}



	@Before

	public void setUp() throws Exception {

		driver = new ChromeDriver();

	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL = "http://naveenks.com/selenium/RegForm.html";

		driver.get(baseURL);

	}







	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	



	// select radio button 

	@Test

	public void test()  throws Exception{

		WebElement male = driver.findElement(By.id("genderMale"));

		male.click();

		

		Thread.sleep(2000);

		WebElement female = driver.findElement(By.id("genderFemale"));

		female.click();

		

		Thread.sleep(2000);

		

		WebElement trans = driver.findElement(By.id("genderTrans"));

		trans.click();

		

		

		System.out.println("Selected Male -> " + male.isSelected());

		System.out.println("Selected Female -> " + female.isSelected());

		System.out.println("Selected Trans Gender -> " + trans.isSelected());

		

		

		

		

	}



}

----------------------------------------------------------------------------------------------

// This program have 3 test cases 
// 1. to show multiple select 
// 2. To test on expedia.com to select the dropdown button and 
// get all the values in it iterate and show it to the user 
// 3. Get attribut by value 


import static org.junit.Assert.*;



import java.util.List;

import java.util.concurrent.TimeUnit;



import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Ignore;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



import com.fannie.utility.Driver;



public class Test05 {



	WebDriver driver ; 

	String baseURL;

	String baseURL1;

	String baseURL2;

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);

	}



	@Before

	public void setUp() throws Exception {

		driver = new ChromeDriver();

	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL = "http://html.com/attributes/select-multiple/";

		baseURL1 ="https://www.expedia.com/";

		baseURL2="http://naveenks.com/selenium/RegForm.html";

	}







	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	



	@Test

	public void test() throws Exception {

		driver.get(baseURL);



		

		// //*[@id="post-291"]/div/div[2]/select

	

		WebElement element = driver.findElement

				(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"));

		Select select = new Select(element);

	

		select.selectByValue("American");

		select.selectByValue("Greater");

		

		Thread.sleep(2000);

		

		select.deselectByValue("Greater");

		Thread.sleep(2000);

		

		select.selectByValue("Andean");

		Thread.sleep(2000);

		

		select.deselectAll();

		

	}



	@Test

	public void expediaTest() throws Exception{

		driver.get(baseURL1);



		// move from Bundle Deals to Flights tab 

		driver.findElement(By.id("tab-flight-tab-hp")).click();

		

		

		// to select rooms id -> package-rooms-hp-package

		// to select adults id -> package-1-adults-hp-package

		// to select children id -> package-1-children-hp-package

		

		

		WebElement roomsElement = driver.findElement(By.id("flight-adults-hp-flight"));

		Select roomsSelect = new Select(roomsElement);

		

		List<WebElement> options = roomsSelect.getOptions();

		



		for(int i=0; i<options.size(); i++){

			System.out.println(options.get(i).getText());

		}

		

		

		roomsSelect.selectByIndex(1);

		Thread.sleep(2000);

		

		roomsSelect.selectByIndex(2);

		Thread.sleep(3000);

		

		

		

	}

	

	

	@Test

	public void getAttributeValue() throws Exception{

		driver.get(baseURL2);



		WebElement element = 

			driver.findElement(By.xpath("/html/body/div[1]/form/div[13]/div/input[1]"));

	

		String elementText = element.getAttribute("value");

		

		System.out.println("Element Text -> " + elementText);

	}

	

}


-------------------------------------------------------------------




// Program to show parameterization with 

// expedia.com 





import static org.junit.Assert.*;



import java.util.Arrays;

import java.util.Collection;

import java.util.concurrent.TimeUnit;



import org.junit.After;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import com.fannie.utility.Driver;



@RunWith(Parameterized.class)

public class Test06 {



	private String fltSrc;

	private String fltDest; 

	private String deptDate; 

	private String retDate;

	private int noOfAdults;

	WebDriver driver ; 

	String baseURL;



	 

	@Parameterized.Parameters

	public static Collection<Object[]> data(){

		return Arrays.asList(new Object[][] {

			{"Chicago, IL (CHI-All Airports)", "San Francisco, California", "06/14/2017", "06/17/2017", 2}, 

			{"Washington, DC (IAD-Washington Dulles Intl.)", "San Francisco, California", "06/14/2017", "06/17/2017", 2}

		});

	}

	

	

	@BeforeClass

	public static void setUpBeforeClass() throws Exception {

		System.setProperty(Driver.CHROME, Driver.CHROME_PATH);

	}



	@Before

	public void setUp() throws Exception {

		driver = new ChromeDriver();

     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver.manage().window().maximize();

		baseURL = "https://www.expedia.com/";

	}







	@After

	public void tearDown() throws Exception {

		Thread.sleep(3000);

		driver.quit();

	}

	

	@Test

	public void expediaTest() {

		driver.get(baseURL);

		

		// click on Flights tab 

		driver.findElement(By.id("tab-flight-tab-hp")).click();

		

		// fltSrc -> flight-origin-hp-flight

		driver.findElement(By.id("flight-origin-hp-flight")).clear();

		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(fltSrc);



		// fltDest -> flight-destination-hp-flight

		driver.findElement(By.id("flight-destination-hp-flight")).clear();

		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(fltDest);



		// deptDate -> flight-departing-hp-flight

		driver.findElement(By.id("flight-departing-hp-flight")).clear();

		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys(deptDate);

		

		// arrDate -> flight-returning-hp-flight

		driver.findElement(By.id("flight-returning-hp-flight")).clear();

		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(retDate);

	}



	public Test06(String fltSrc, String fltDest, String deptDate, String retDate, int noOfAdults) {

		this.fltSrc = fltSrc;

		this.fltDest = fltDest;

		this.deptDate = deptDate;

		this.retDate = retDate;

		this.noOfAdults = noOfAdults;

	}



}