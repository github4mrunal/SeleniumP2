package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BarclaysChrome {

    public static void main(String[] args) {
        String URL = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Personal Banking");
        boolean TitleContain = title.contains("Barclays");
        System.out.println(title);
        System.out.println(TitleContain);
        System.out.println(verifyTitle);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);
        driver.close();
    }

}
