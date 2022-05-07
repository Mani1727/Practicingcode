package org.Practicepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Pracicepage{

    @FindBy(xpath = "//legend[contains(text(),'Dropdown Example')]")
    WebElement Dropdownheading ;
    @FindBy(xpath = "//legend[contains(text(),'Dropdown Example')]/parent::fieldset/select")
    WebElement  dropdown;

    Dropdown()
    {
        PageFactory.initElements(driver,this);
    }

    public void SelectingDropdown()
    {
        Select select =new Select(dropdown);
        select.selectByValue("option1");
        select.selectByValue("option2");
        select.selectByValue("option3");
     //   select.deselectByValue("option1");


    }
}
