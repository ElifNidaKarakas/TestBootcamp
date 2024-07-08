import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserTests {
    @Test
    public void loginSuccessful() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/giris?cb=%2F"); //linki verilen adrese gider
        driver.findElement(By.name("login email")).sendKeys("sevdekulhan@gmail.com");
        driver.findElement(By.name("login-password")).sendKeys("12345678S.k");
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).click();
        Thread.sleep(5000);//5 sn bekle


    }
}
