package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import entities.User;
import helper.HelperMethod;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;

public class TextBox {
    HelperMethod helperMethod = new HelperMethod();
    public SelenideElement userName = $x("//input[@id='userName']");
    public SelenideElement userEmail = $x("//input[@id='userEmail']");
    public SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    public SelenideElement permanentAddress = $x("//textarea[@id='permanentAddress']");
    public SelenideElement submitBtn = $x("//button[@id='submit']");
    public SelenideElement name = $x("//p[@id='name']");

    public TextBox writeAll(User user) {
        helperMethod.writeValue(userName, user.username)
                .writeValue(userEmail, user.userEmail)
                .writeValue(currentAddress, user.userCurrentAddress)
                .writeValue(permanentAddress, user.userPermanentAddress)
                .clickButton(submitBtn);
        return this;
    }
}
