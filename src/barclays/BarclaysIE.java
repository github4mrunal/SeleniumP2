package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BarclaysIE {
    public static void main(String[] args) {
        String url = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        boolean verifyTitle = title.equalsIgnoreCase("barclays");
        boolean TitleContains = title.contains("Banking");
        System.out.println(title);
        System.out.println(verifyTitle);
        System.out.println(TitleContains);

        String pagesource = driver.getPageSource();
        driver.close();
    }


}
