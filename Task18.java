import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task18 {

    //import the selenium WebDriver
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        //Locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. open chrome driver
        driver = new ChromeDriver();
        //2. Input Your Selenium Demo Page URL (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com/");
        //3. mazimise the browser
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Test(priority = 0)
    public void correctDetails() throws InterruptedException {
        //4. click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //5. Input your username in username field
        driver.findElement(By.id("user_username")).sendKeys("olugbemi");
        //6. Input your email on the email field
        driver.findElement(By.id("user_email")).sendKeys("opeyemi2@malinator.com");
        //7. Input your password on the password field
        driver.findElement(By.id("user_password")).sendKeys("admin");
        //8. Click on the signup button to
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
        //9. Click on the user1 item on the pagelist
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]")).click();
        //10. Search for an element and confirm if it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[34]/div/div/div[1]/a")).click();
        //11. Then click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();

    }

    @AfterTest
    public void closeBrowser() {
        //Quit Browser
        driver.quit();
    }
}
