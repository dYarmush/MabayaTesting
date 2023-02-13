import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MabayaBO {

    final WebDriver driver = DriverSingleton.getDriver();

    public void login(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://backoffice.mabaya.com");
        //Clears field and sends userID
        driver.findElement(By.cssSelector("input[type='email']")).clear();
        driver.findElement(By.cssSelector("input[type='email']"))
                .sendKeys("Email");
        //Clears and sends pw
        driver.findElement(By.cssSelector("input[type='password']")).clear();
        driver.findElement(By.cssSelector("input[type='password']"))
                .sendKeys("Password");
        // Clicks on send
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    public void chooseLastYear() {
       // Click on billing
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        WebElement billing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//*[@id=\"admin-main-menu\"]/li[5]/div/a/span[2]")));
        billing.click();
        // Click on dropdown menu
       driver.findElement(By.xpath("//*[@id=\"admin-intro-full-page\"]" +
                "/backoffice-admin-billing/div/div[2]/div/div/ul/li[2]/fieldset/div/" +
               "select-date-range/div/button")).click();
       // Click on "Last Year"
       driver.findElement(By.xpath("//*[@id=\"admin-intro-full-page\"]/backoffice-admin-billing/div/div[2]" +
               "/div/div/ul/li[2]/fieldset/div/select-date-range/div/div/button[5]")).click();

    }

}
