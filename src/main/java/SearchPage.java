import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private final By searchEmail = By.id("email");
    private final By searchPassword = By.id("password");
    private final By searchButtom = By.xpath("//*[@id='root']/header/nav/a[2]");
    private final By searchButtom2 = By.xpath("//*[@id=\'root\']/main/div/form/button");
    private final By searchResult = By.className("form-feedback");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void seleccionarEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        this.sendText(email, searchEmail);
        this.sendKey(Keys.TAB, searchEmail);
    }

    public void seleccionarPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        this.sendText(password, searchPassword);
    }

    public void clickBuscar() throws InterruptedException {
        Thread.sleep(1000);
        this.click(searchButtom);
    }
    public void clickBuscar2() throws InterruptedException {
        Thread.sleep(1000);
        this.click(searchButtom2);
    }

    public String obtenerMensaje() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("RESULTADO DE LA BUSQUEDA: " + this.getText(searchResult));
        return this.getText(searchResult);
    }
}
