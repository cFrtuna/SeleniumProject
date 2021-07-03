import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocationMechanism {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/cristianfortuna/Documents/drivers/chromedriver ");
        WebDriver driver = new ChromeDriver(); // launches a new browser session

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twoabsearhtextbox")).sendKeys("socks"+ Keys.ENTER);
    }
}