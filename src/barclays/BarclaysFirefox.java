package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BarclaysFirefox {
    public static void main(String[] args) {
        String URL = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver =  new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Banking");
        boolean TitleContains = title.contains("Personal Banking");
        System.out.println(title);
        System.out.println(verifyTitle);
        System.out.println(TitleContains);

        String pagesource = driver.getPageSource();
        driver.quit();
    }
}
