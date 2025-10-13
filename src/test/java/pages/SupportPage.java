package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SupportPage  {
    private SelenideElement supportLink = $("a[href='/support']"),
            supportTitle = $("h1.support-title"),
            osagoButton = $("button[title='ОСАГО']"),
            policyCopyButton = $("button[title='Копия или дубликат полиса']"),
            paymentCertificateLink = $("a[title='Cправка об оплате страховых взносов']"),
            faqLink = $("a[href='/faq']"),
            popupTitle = $(".support-popup-title"),
            pageTitle = $("h3.title"),
            pageContent = $(".page-content");

    @Step("Открыть главную страницу")
    public SupportPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Перейти в Центр помощи")
    public SupportPage clickSupportLink() {
        supportLink.click();
        return this;
    }

    @Step("Проверить заголовок Центра помощи")
    public SupportPage verifySupportTitle() {
        supportTitle.shouldHave(text("Центр помощи"));
        return this;
    }

    @Step("Нажать на кнопку ОСАГО")
    public SupportPage clickOsagoButton() {
        osagoButton.click();
        return this;
    }

    @Step("Проверить заголовок popup ОСАГО")
    public SupportPage verifyOsagoPopup() {
        popupTitle.shouldHave(text("Что хотите сделать?"));
        return this;
    }

    @Step("Нажать на кнопку 'Копия или дубликат полиса'")
    public SupportPage clickPolicyCopyButton() {
        policyCopyButton.click();
        return this;
    }

    @Step("Проверить заголовок popup копии полиса")
    public SupportPage verifyPolicyCopyPopup() {
        popupTitle.shouldHave(text("Получить копию полиса"));
        return this;
    }

    @Step("Нажать на ссылку 'Справка об оплате страховых взносов'")
    public SupportPage clickPaymentCertificateLink() {
        paymentCertificateLink.click();
        return this;
    }

    @Step("Проверить заголовок страницы справки")
    public SupportPage verifyPaymentCertificatePage() {
        pageTitle.shouldHave(text("Заказать справку об оплате страховых взносов"));
        return this;
    }

    @Step("Нажать на ссылку 'Все вопросы и ответы'")
    public SupportPage clickFaqLink() {
        faqLink.click();
        return this;
    }

    @Step("Проверить содержимое страницы FAQ")
    public SupportPage verifyFaqPage() {
        pageContent.shouldHave(text("Центр поддержки клиентов — отвечаем на ваши вопросы"));
        return this;
    }
}
