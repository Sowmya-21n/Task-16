package task16;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2
{
    public static void main(String[] args)
    {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "STORE";
        if (expectedTitle.equals(actualTitle))
        {
            System.out.println("The page not  landed on correct website");
        } else
        {
                System.out.println("The page landed on correct website");
        }
            driver.close();
    }
}







