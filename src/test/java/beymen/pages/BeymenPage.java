package beymen.pages;

import beymen.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeymenPage {


    public BeymenPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath = "//div[@class='o-header__search--wrapper']")
    public WebElement searchBox;

}
