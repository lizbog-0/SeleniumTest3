import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3Adlibris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/lizabogatyrev/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.adlibris.se");
        driver.findElement(By.id("q")).sendKeys("Praktisk mjukvarutestning");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
        WebElement result= driver.findElement(By.xpath("//*[@id=\"search-hits\"]/div/div/div[1]/div/h4/a"));
        result.click();
        WebElement toCart= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/div[4]/div/button"));
        toCart.click();
        WebElement shoppingCart=driver.findElement(By.xpath("/html/body/div[1]/header/button[2]/span[1]"));
        shoppingCart.click();
        WebElement checkout= driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div/a"));
        checkout.click();
    }
}
