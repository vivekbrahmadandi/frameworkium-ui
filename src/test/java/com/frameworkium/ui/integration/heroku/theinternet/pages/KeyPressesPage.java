package com.frameworkium.ui.integration.heroku.theinternet.pages;

import com.frameworkium.ui.annotations.Visible;
import com.frameworkium.ui.pages.BasePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class KeyPressesPage extends BasePage<KeyPressesPage> {

    @Visible
    @Name("Container")
    @FindBy(css = "div.example")
    private WebElement container;

    @Name("Result")
    @FindBy(css = "p#result")
    private WebElement result;


    public KeyPressesPage enterKeyPress(Keys key) {

        (new Actions(driver)).sendKeys(key).perform();

        // We're still on this page, so return this
        return this;
    }


    public String getResultText() {
        return result.getText();
    }

}
