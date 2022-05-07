package org.Practicepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Radiobutton extends Pracicepage{

    @FindBy(xpath = "//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[1]/input")
    WebElement Radiobutton1;

    @FindBy(xpath="//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[2]/input")
    WebElement Radiobutton2;

    @FindBy(xpath="//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[3]/input")
    WebElement Radiobutton3;

    @FindBy(id="radio-btn-example")
    WebElement RadioHeading;

    @FindBy(xpath="//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[1]")
    WebElement Radiobutton1value;
    @FindBy(xpath="//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[2]")
    WebElement Radiobutton2value;
    @FindBy(xpath="//legend[contains(text(),'Radio Button Example')]/parent::fieldset/label[3]")
    WebElement Radiobutton3value;
//    @FindBy(xpath="")
//    WebElement Radiobutton2;

    public Radiobutton()
    {
        PageFactory.initElements(driver, this);
    }



    public void clickingradio1()
    {
        Radiobutton1.click();
        String radiobutton1=Radiobutton1value.getText();
        Assert.assertEquals(radiobutton1.toLowerCase(),"radio1");
    }

    public void clickingradio2()
    {
        Radiobutton2.click();
        String radiobutton2=Radiobutton2value.getText();
        Assert.assertEquals(radiobutton2.toLowerCase(),"radio2");
    }

    public void clickingradio3()
    {
        Radiobutton3.click();
        String radiobutton3=Radiobutton3value.getText();
        Assert.assertEquals(radiobutton3.toLowerCase(),"radio3");
    }

    public void VerifyingtheRadioHeading()
    {
        String heading=RadioHeading.getText();
        heading.equalsIgnoreCase("Radio Button Example");
    }






}
