import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public static WebDriver driver;

    protected BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void getUrl(String url) {
        driver.get(url);
    }

    public void close() {
        driver.quit();
    }

    protected WebElement elementFind(By locator) throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(locator);
    }

    protected void sendText(String imputText, By locator) throws InterruptedException {
        this.elementFind(locator).clear();
        this.elementFind(locator).sendKeys(imputText);
    }

    protected void sendKey(CharSequence key, By locator) throws InterruptedException {
        this.elementFind(locator).sendKeys(key);
    }

    protected void click(By locator) throws InterruptedException {
        this.elementFind(locator).click();
    }

    protected String getText(By locator) throws InterruptedException {
        return this.elementFind(locator).getText();
    }
}