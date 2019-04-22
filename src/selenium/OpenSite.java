package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSite {

    public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://localhost:8090/spring3-mvc-maven-xml-hello-world-1.0-SNAPSHOT/");

    }

}
