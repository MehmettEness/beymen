
package beymen.test;

        import beymen.pages.BeymenPage;
        import beymen.utilities.ConfigReader;
        import beymen.utilities.Driver;
        import org.junit.Test;

public class search {

    @Test
    public void search01() {
        // WebDriver'ı yapılandırılmış URL'ye yönlendirme
        Driver.getDriver().get(ConfigReader.getProperty("BeymenUrl"));

        // BeymenPage nesnesi oluşturma
        BeymenPage beymenPage = new BeymenPage();

        // Arama kutusuna tıklama işlemi
        beymenPage.searchBox.click();
    }
}
