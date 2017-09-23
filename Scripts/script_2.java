
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
		WebElement  email = driver.findElement(By.id("email"));
		// find the  element by name.
		WebElement firsttname = driver.findElement(By.name("firsttname"));
		// find the  element by className.
		WebElement lastname = driver.findElement(By.className("lastname"));
		// find the  element by tag name.
		WebElement userType = driver.findElement(By.tagName("select"));
		// find the  element by cssSector.
		WebElement password = driver.findElement(By.cssSelector("#signupform > div:nth-child(6) > div > input"));
		// find the  element by xpath.
		WebElement confirmPassword = driver.findElement(By.xpath("//*[@id=\"signupform\"]/div[7]/div/input"));

		// enter data to sign up
		email.sendKeys("gskaushal92@gmail.com");
		firsttname.sendKeys("Gopal");
		lastname.sendKeys("Sharma");
		userType.sendKeys("Internal User");
		password.sendKeys("abc@1234");
		confirmPassword.sendKeys("abc@1234");

		// Sleep for 5 seconds

		Thread.sleep(5000);

		//sign up click
		driver.findElement(By.id("btn-signup")).click();

		// Sleep for 5 seconds

		Thread.sleep(5000);

		//sign in click
		driver.findElement(By.id("btn-signin-msg")).click();

		// Sleep for 5 seconds

		Thread.sleep(5000);

		//enter data to login
		driver.findElement(By.id("login-username")).sendKeys("gskaushal92@gmail.com");

		driver.findElement(By.id("login-password")).sendKeys("abc@1234");

		driver.findElement(By.id("login-usertype")).sendKeys("Internal User");

		driver.findElement(By.id("login-usertype")).sendKeys("Internal User");

		driver.findElement(By.id("login-remember")).click();

		// Sleep for 5 seconds
		Thread.sleep(5000);

		//login click
		driver.findElement(By.id("btn-login")).click();

	}
}