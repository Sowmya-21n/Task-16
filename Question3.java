package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput"));
        By by = By.id("searchInput");
        WebElement element = driver.findElement(by);
        element.sendKeys("Artificial intelligence");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.get("https://en.wikipedia.org/wiki/Artificial_intelligence#History");
        By by1 = By.id("History");
        String text = driver.getTitle();
        System.out.println(text);
    }
}
