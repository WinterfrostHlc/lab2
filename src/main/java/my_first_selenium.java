import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class my_first_selenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\RandomShit" +
                        "\\Загрузки\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        System.out.println("Мы на странице " + driver.getTitle());

        driver.findElement(By.xpath("//input[@name = 'q']"));

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();
        driver.quit();
    }
}
