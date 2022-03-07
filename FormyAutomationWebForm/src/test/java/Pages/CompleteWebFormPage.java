package Pages;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class CompleteWebFormPage extends TestBase {

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By submitButton = By.xpath("//a[contains(text(),'Submit')]");


//    //constructor
//    public CompleteWebFormPage()
//    {
//        PageFactory.initElements(driver, this);
//    }
//
//
//
//    public void enterDetailsAndSubmitForm() {
//        driver.findElement(firstNameField).sendKeys("David");
//        driver.findElement(lastNameField).sendKeys("Sims");
//        driver.findElement(submitButton).click();
   // }
}
