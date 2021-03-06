package com.frameworkium.ui.integration.heroku.theinternet.pages;

import com.frameworkium.ui.annotations.Visible;
import com.frameworkium.ui.pages.BasePage;
import com.frameworkium.ui.pages.PageFactory;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Link;

public class DynamicLoadingPage extends BasePage<DynamicLoadingPage> {

    @Visible
    @Name("Example 2: Element rendered after the fact")
    @FindBy(linkText = "Example 2: Element rendered after the fact")
    private Link example2Link;


    public DynamicLoadingExamplePage clickExample2() {
        example2Link.click();
        return PageFactory.newInstance(DynamicLoadingExamplePage.class);
    }
}
