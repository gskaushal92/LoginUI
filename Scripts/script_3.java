import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script_3 {

	public static void main(String[] args)  throws InterruptedException  {
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

		// Sleep for 2 seconds

		Thread.sleep(2000);

		//get site title and print it
		String title=driver.getTitle();
		System.out.println("Site Title: " +title);

		//get site url and print it
		String siteUrl=driver.getCurrentUrl();
		System.out.println("Site Url: " +siteUrl);
		System.out.println("");
		//find all the links elements
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//print no. of links elements
		System.out.println("No. of Links: " +links.size());
		
		// print text of each link element
		for (int i = 0; i<links.size(); i=i+1)			 
		{ 
			System.out.println("Link "+ i+ ": " +links.get(i).getText());
		}	
		
		System.out.println("");
		//find all the input text elements
		List<WebElement> textBoxes= driver.findElements(By.xpath("//*[input[@type=\"text\"]]"));
		
		//print no. of links elements
		System.out.println("No. of input text boxes: " +textBoxes.size());
		
		// print text of each link element
		for (int i = 0; i<textBoxes.size(); i=i+1)			 
		{ 
			System.out.println("TextBox "+ i+ ": " +textBoxes.get(i).getAttribute("id"));
		}	
		
		System.out.println("");
		//find all the input text elements
		List<WebElement> checkBoxes= driver.findElements(By.xpath("//*[input[@type=\"checkbox\"]]"));
		
		//print no. of links elements
		System.out.println("No. of input check boxes: " +checkBoxes.size());
		
		// print text of each link element
		for (int i = 0; i<checkBoxes.size(); i=i+1)			 
		{ 
			System.out.println("CheckBox "+ i+ ": " +checkBoxes.get(i).isSelected());
		}
		
	}

}
