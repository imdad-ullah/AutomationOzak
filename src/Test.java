import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Test {

	public static void main(String[] args) throws TimeoutException {
		


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ozak.ai");
        System.out.println("Page Title: " + driver.getTitle());
     
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement connectButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Connect Wallet')]")));

        connectButton.click();
        System.out.println("Clicked on the 'Connect Wallet' button successfully.");

       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
	}

}
