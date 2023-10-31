import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By searchBox = By.name("q");
    private final By title = By.xpath("//img[@alt='Google']");

    //private By searchButton = By.name("btnK");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void buscarTexto(String texto) throws InterruptedException {
        this.sendText(texto, searchBox);
        this.sendKey(Keys.ENTER, searchBox);
    }

    public String obtenerTituloGoogle() {
        System.out.println("INGRESO CORRECTAMENTE A: " + driver.getTitle());
        return driver.getTitle();
    }

    public String obtenerBusqueda() throws InterruptedException {
        System.out.println("RESULTADO DE LA BUSQUEDA: " + this.getText(searchBox));
        return this.getText(searchBox);
    }
}