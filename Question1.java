package task16;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {
    public static void main(String[] args) {
//        ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.co.in/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.navigate().refresh();
        driver.close();
    }
}
