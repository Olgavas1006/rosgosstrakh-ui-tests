package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthorizationPage {
    private SelenideElement loginLink = $("a[href*='authorization'] span"),
            cardContent = $(".card-content"),
            phoneInput = $("[name='phoneNumber']"),
            loginButton = $("button[name='login']"),
            phoneError = $("#input-error-phoneNumber");

    @Step("Открыть главную страницу")
    public AuthorizationPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Нажать на кнопку 'Войти'")
    public AuthorizationPage clickLoginLink() {
        loginLink.shouldHave(text("Войти")).click();
        return this;
    }

    @Step("Выбрать 'Личный кабинет клиента'")
    public AuthorizationPage clickClientAccount() {
        cardContent.shouldHave(text("Личный кабинет клиента")).click();
        return this;
    }

    @Step("Ввести номер телефона: {phone}")
    public AuthorizationPage setPhoneNumber(String phone) {
        phoneInput.setValue(phone);
        return this;
    }

    @Step("Нажать кнопку 'Войти'")
    public AuthorizationPage clickLoginButton() {
        loginButton.shouldBe(visible).shouldHave(text("Войти")).click();
        return this;
    }

    @Step("Проверить сообщение об ошибке")
    public AuthorizationPage verifyPhoneError() {
        phoneError.shouldBe(visible).shouldHave(text("Телефон не найден"));
        return this;
    }
}
