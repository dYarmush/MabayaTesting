import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MabayaTesting {
    MabayaBO mabayaBO;
    WebDriver driver;
    @BeforeClass
    private void beforeAll(){
         driver = DriverSingleton.getDriver();
         mabayaBO = new MabayaBO();
    }

    @Test
    private void test01LoginTest(){
        mabayaBO.login();
    }
    @Test
    private void test02Navigation(){
        mabayaBO.chooseLastYear();
    }
    @AfterClass
    private void afterAll(){
        driver.quit();
    }

}
