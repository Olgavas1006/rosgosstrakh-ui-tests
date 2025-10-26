package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PurchasePolicyOnlinePage {

    private SelenideElement purchasePolicyOnlineTitle = $(byText("Покупка полиса онлайн"));
    private ElementsCollection categoryButtons = $$("ul.tabs button");

    @Step("Открыть главную страницу")
    public PurchasePolicyOnlinePage openMainPage() {
        open("");
        return this;
    }

    @Step("Скролл к заголовку 'Покупка полиса онлайн'")
    public PurchasePolicyOnlinePage scrollToPurchasePolicyOnlineTitle() {
        purchasePolicyOnlineTitle.scrollTo().shouldBe(visible);
        return this;
    }

    @Step("Клик по всем кнопкам категорий")
    public PurchasePolicyOnlinePage clickAllCategoryButtons() {
        for (SelenideElement button : categoryButtons) {
            button.scrollTo();
            button.click();
            button.closest(".tabs-item").shouldHave(cssClass("active"));
        }
        return this;
    }
}
