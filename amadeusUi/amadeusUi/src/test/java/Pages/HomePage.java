package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    WebDriver driver;

    public HomePage(){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "headlessui-combobox-input-:Rq9lla:")
    private WebElement fromInput;

    @FindBy(id = "headlessui-combobox-input-:Rqhlla:")
    private WebElement toInput;

    @FindBy(xpath = "//*[@id=\"headlessui-combobox-option-:rj:\"]/div")
    private WebElement fromOption;

    @FindBy(xpath = "//*[@id=\"headlessui-combobox-option-:rc:\"]/div")
    private WebElement toOption;

    @FindBy(xpath = "/html/body/main/div[2]/div/p")
    private WebElement resultText;

    public void searchFrom(String from){
        sendKeys(fromInput,from);
        click(fromOption);

    }
    public void searchTo(String to){
        sendKeys(toInput,to);
        click(toOption);

    }
    public void verifyResult(String result){
        Assertion(resultText,result);
    }
}
