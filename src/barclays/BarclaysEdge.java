package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BarclaysEdge {

    public static void main(String[] args) {
        String url = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.msedge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Banking");
        boolean verifyTitleContain = title.contains("Private Banking");
        System.out.println(title);
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);

        String pagesource = driver.getPageSource();
        driver.close();
    }
}
