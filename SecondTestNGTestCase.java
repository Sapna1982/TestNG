import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//public class SecondTestNGTestCase {
//    WebDriver driver;
//
//    @Test(priority = 5)
//    void openBrowser(){
//        System.out.println("Open Browser");
//        System.setProperty("webdriver.msedge.driver", "C:\\Users\\Sapna Sharma\\IdeaProjects\\TestNG\\src\\test\\resources\\Drivers\\msedgedriver.exe");
//        driver = new EdgeDriver();
//        driver.get("https://demo.nopcommerce.com/");
//    }
//
//    @Test(priority = 6)
//    void registerUser(){
//        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
//        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
//        driver.findElement(By.id("FirstName")).sendKeys("Sapna");
//        driver.findElement(By.id("LastName")).sendKeys("Sharma");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("December");
//        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1982");
//        driver.findElement(By.id("Email")).sendKeys("sapnasharma700@hotmail.com");
//        driver.findElement(By.id("Company")).sendKeys("Unify Testing");
//        driver.findElement(By.id("Password")).sendKeys("123456");
//        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
//        driver.findElement(By.xpath("//button[@id='register-button']")).click();
//    }
//
//    @Test(priority = 7)
//    void closeBrowser() throws InterruptedException{
//        System.out.println("Close Browser");
//        Thread.sleep(1000);
//        driver.quit();
//    }
//}
