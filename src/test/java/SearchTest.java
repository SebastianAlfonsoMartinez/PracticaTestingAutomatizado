import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SearchTest {
    public WebDriver driver;

    @Test
    public void test_1() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.setUp();
        searchPage.getUrl("http://testing.ctd.academy/");

        searchPage.clickBuscar();
        searchPage.seleccionarEmail("test@dh.com");
        searchPage.seleccionarPassword("254852");
        searchPage.clickBuscar2();


        Assertions.assertEquals(searchPage.obtenerMensaje(), "Sus credenciales son inválidas. Por favor, vuelva a intentarlo");
        searchPage.close();
    }
}
