package helper;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

public class HelperMethod {
    public SelenideElement waitElement(SelenideElement element){
        return element.should(Condition.visible);
    }
    public HelperMethod clickButton(SelenideElement element){
        waitElement(element).scrollTo().click();
        return this;
    }
    public HelperMethod writeValue(SelenideElement element,String value){
        waitElement(element).setValue(value);
        return this;
    }
}
