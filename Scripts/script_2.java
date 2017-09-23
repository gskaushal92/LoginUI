import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Script_2 {

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
				
				//maximize window
				driver.manage().window().maximize();

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


				// find the  element by id.
				WebElement  email = driver.findElement(By.id("email"));
				// find the  element by name.
				WebElement firsttname = driver.findElement(By.name("firstname"));
				// find the  element by className.
				WebElement lastname = driver.findElement(By.name("lastname"));
				// find the  element by tag name.
				WebElement userType = driver.findElement(By.id("usertype"));
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
				// Sleep for 2 seconds

				Thread.sleep(2000);

				//sign up click
				driver.findElement(By.id("btn-signup")).click();

				// Sleep for 2 seconds

				Thread.sleep(2000);

				//sign in click
				driver.findElement(By.id("btn-signin-msg")).click();

				// Sleep for 2 seconds

				Thread.sleep(2000);

				//enter data to login
				driver.findElement(By.id("login-username")).sendKeys("gskaushal92@gmail.com");

				driver.findElement(By.id("login-password")).sendKeys("abc@1234");

				driver.findElement(By.id("login-usertype")).sendKeys("Internal User");

				driver.findElement(By.id("login-remember")).click();

				// Sleep for 2 seconds
				Thread.sleep(2000);

				//login click
				driver.findElement(By.id("btn-login")).click();

	}

}
