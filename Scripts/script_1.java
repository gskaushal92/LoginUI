
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_1{

	 public static void main(String[] args) throws interruptedexception {


		// Start browser
		WebDriver driver = new FirefoxDriver();

		// Navigate to the URL

		driver.get("http://www.techbeamers.com");

		// Sleep for 5 seconds

		Thread.sleep(5000);

		//get site title and print it
		String title=driver.getTitle();
		System.out.println("Site Title: " +title);

		//get site url and print it
		String siteUrl=driver.getCurrentUrl();
		System.out.println("Site Url: " +siteUrl);

		// find the input element by link and navigate to form.
		driver.findElement(By.linkText("Sing Up Here")).click();


		// find the  element by id.
		WebElement byId = driver.findElement(By.id("email"));
		// find the  element by name.
		WebElement byName = driver.findElement(By.name("firsttname"));
		// find the  element by className.
		WebElement byClassName = driver.findElement(By.className("lastname"));
		// find the  element by link.
		WebElement bylink = driver.findElement(By.link("Sign In"));
		// find the  element by partial link text.
		WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Sign"));
		// find the  element by tag name.
		WebElement byTagName = driver.findElement(By.tagName("select"));
		// find the  element by cssSector.
		WebElement byCssSelector = driver.findElement(By.cssSelector("#signupform > div:nth-child(6) > div > input"));
		// find the  element by xpath.
		WebElement byXpath = driver.findElement(By.xpath("//*[@id=\"signupform\"]/div[7]/div/input"));



	}
}