import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class testGoogle {
    public WebDriver driver;

    @Test
    public void test_1() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.setUp();
        homePage.getUrl("http://testing.ctd.academy/");

        homePage.obtenerTituloGoogle();
        homePage.buscarTexto("Selenium");
        homePage.obtenerBusqueda();

        homePage.close();
    }
}
