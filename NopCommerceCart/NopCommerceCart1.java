package NopCommerceCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NopCommerceCart1 {
    WebDriver driver;

//    @BeforeMethod
    @Test (priority = 1)
    void OpenBrowser() {

        System.out.println("Open Browser");
        System.setProperty("webdriver.msedge.driver", "C:\\Users\\Sapna Sharma\\IdeaProjects\\TestNG\\src\\test\\resources\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test (priority = 2)
    void selectProduct() {
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button")).click();

    }

    @Test(priority = 3)
    void checkout() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input")).sendKeys("Sapna");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[2]/input")).sendKeys("Sharma");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[3]/input")).sendKeys("sapnasharma700@hotmail.com");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[4]/input")).sendKeys("Unify Testing");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[7]/input")).sendKeys("Leicestershire");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[8]/input")).sendKeys("46 Verdale Avenue");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[9]/input")).sendKeys("Leicester");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[10]/input")).sendKeys("LE4 9TG");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[11]/input")).sendKeys("07964661873");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();

    }

    @Test(priority = 4)
    void shippingMethod() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).submit();

    }

    @Test(priority = 5)
    void paymentMethod() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")).submit();


    }

//    @AfterMethod
    @Test(priority = 6)
    void closeBrowser() throws InterruptedException {
        System.out.println("Close Browser");
        Thread.sleep(1000);
        driver.quit();

    }
}
