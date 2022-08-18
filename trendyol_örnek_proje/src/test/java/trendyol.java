import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class trendyol extends Base{



    @Test
    public void openthewebsite() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d18589\\IdeaProjects\\trendyol_örnek_proje\\driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();



        //driver.get("https://www.trendyol.com/");
        driver.navigate().to(web_adress);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Cookie menusunu kapat
        WebElement cookie =driver.findElement(By.id(cookie_id));
        cookie.click();


        // Giriş yap menu butonuna tıkla
        WebElement sign_in =driver.findElement(By.xpath(sign_in_xpath));
        sign_in.click();

        //Email girişi yap
        WebElement email =driver.findElement(By.id(email_id));
        email.sendKeys("mehmetsahin583401@gmail.com");

        //Password girişi yap
        WebElement password =driver.findElement(By.id(password_id));
        password.sendKeys("Test_34");

        // Giriş yap butonuna tıkla
        WebElement sign_button =driver.findElement(By.xpath(sign_button_xpath));
        sign_button.click();

        Thread.sleep(600);

        //Logout menu butonuna tıkla
        WebElement dropdown =driver.findElement(By.xpath(hesabim_dropdown));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();

        Thread.sleep(600);

        WebElement logout =driver.findElement(By.xpath(hesabim_logout));
        logout.click();

        //tarayıcıyı kapat
        driver.close();

        //başarılı mesajı
        System.out.println("otomasyon başarılı oldu...");

    }
}
