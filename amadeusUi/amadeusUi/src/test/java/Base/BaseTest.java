package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void click(WebElement clickELement){
        wait.until(ExpectedConditions.elementToBeClickable(clickELement)).click();

    }

    public void sendKeys(WebElement element,String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);

    }

    public void selectElementFromDropdown (WebElement dropdown,String element){
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);

    }


    public void Assertion(WebElement actual,String expected){

        wait.until(ExpectedConditions.visibilityOf(actual));
        // extract the '2' in the actual text
        var result = actual.getText().contains(expected);
        var finalResult = '1';

        if (result)  {
            finalResult = '2';
        }
        Assert.assertEquals(finalResult,expected);
    }
}
