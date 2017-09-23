import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Script_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//set system property to use chrme driver
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chrome_driver\\chromedriver.exe");

		// Start firefox browser
		//WebDriver driver = new FirefoxDriver();
		
		//start chrome broweser
		
		WebDriver driver= new ChromeDriver();

		//set baseUrl
		String baseURL="file:///E:/Study/MyGIT_Repository/LoginUI/Views/Login.html";
		
		// Navigate to the URL
		driver.get(baseURL);

		// Sleep for 5 seconds

		Thread.sleep(2000);

		//get site title and print it
		String title=driver.getTitle();
		System.out.println("Site Title: " +title);

		//get site url and print it
		String siteUrl=driver.getCurrentUrl();
		System.out.println("Site Url: " +siteUrl);

		// find the input element by link and navigate to form.
		driver.findElement(By.linkText("Sign Up Here")).click();


		// find the  element by id and print tag name..
		WebElement byId = driver.findElement(By.id("email"));
		System.out.println("ById: " + byId.getTagName());
		// find the  element by name and print tag name..
		WebElement byName = driver.findElement(By.name("firstname"));
		System.out.println("ByName: " + byName.getTagName());
		// find the  element by className.
		//WebElement byClassName = driver.findElement(By.className("lastname"));
		// find the  element by link and print tag name..
		WebElement byLinkText = driver.findElement(By.linkText("Sign In"));
		System.out.println("ByLinkText: " + byLinkText.getTagName());
		// find the  element by partial link text and print tag name..
		WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Sign"));
		System.out.println("ByPartialLinkText: " + byPartialLinkText.getTagName());
		// find the  element by tag name and print tag name..
		WebElement byTagName = driver.findElement(By.tagName("select"));
		System.out.println("ByTagName: " + byTagName.getTagName());
		// find the  element by cssSector and print tag name.
		WebElement byCssSelector = driver.findElement(By.cssSelector("#signupform > div:nth-child(6) > div > input"));
		System.out.println("ByCssSelector: " + byCssSelector.getTagName());
		// find the  element by xpath and print tag name.
		WebElement byXpath = driver.findElement(By.xpath("//*[@id=\"signupform\"]/div[7]/div/input"));
		System.out.println("ByXpath: " + byXpath.getTagName());
		
		driver.close();


	}

}
