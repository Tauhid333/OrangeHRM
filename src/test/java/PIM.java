import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PIM {
    WebDriver driver;
    @BeforeAll
    public void setup(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }
    @Test
    public void login() {
        List<WebElement> txtBox = driver.findElements(By.className("oxd-input"));
        txtBox.get(0).sendKeys("Admin");
        txtBox.get(1).sendKeys("admin123");

        driver.findElement(By.className("oxd-button")).click();
        List<WebElement> menus = driver.findElements(By.className("oxd-main-menu-item--name"));
        menus.get(1).click();
        driver.findElement(By.className("oxd-button-icon")).click();
        driver.findElement(By.className("oxd-switch-input")).click();
        Faker faker = new Faker();
        driver.findElement(By.className("orangehrm-firstname")).sendKeys("ab");
        driver.findElement(By.className("orangehrm-middlename")).sendKeys("cd");
        driver.findElement(By.className("orangehrm-lastname")).sendKeys("ef");


        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("abc");
        List<WebElement> passwords = driver.findElements(By.cssSelector("input.oxd-input[type='password']"));
        passwords.get(0).sendKeys("1234567l");
        passwords.get(1).sendKeys("1234567l");

        driver.findElement(By.cssSelector("button.oxd-button[type='submit']")).click();






    }
    }


