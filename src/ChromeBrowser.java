import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/"; //given website
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // calling ChromeDriver class by creating object & using interface 'WebDriver'
        driver.get(baseUrl);
        driver.manage().window().maximize(); // to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle(); //Getting title of the page
        System.out.println(title);
        // Getting Current URL
        System.out.println("Current Url = " + driver.getCurrentUrl());
        String loginUrl = "https://opensource-demo.orangehrmlive.com/"; //Storing URL and navigate
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " + driver.getCurrentUrl());

        WebElement usernameField = driver.findElement(By.id("txtUsername")); // findElement is always returning value 'WebElement'
        usernameField.sendKeys("amir231"); // sending email to email field element

        WebElement passwordField = driver.findElement(By.name("txtPassword")); // findElement is always returning value 'WebElement'
        passwordField.sendKeys("wow548"); // sending Password to password field element
        driver.close(); //closing browser automatically
    }
}
