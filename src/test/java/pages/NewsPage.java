package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class NewsPage {
    private SelenideElement newsCompanyTitle = $(byText("Новости компании")),
            newsLink = $(byText("Перейти в раздел новостей")),
            newsPageTitle = $("h1.section-basic__title");

    @Step("Открыть главную страницу")
    public NewsPage openMainPage() {
        open("");
        return this;
    }

    @Step("Скролл к заголовку 'Новости компании' на главной странице")
    public NewsPage scrollToNewsCompanyTitle() {
        newsCompanyTitle.scrollTo().shouldBe(visible);
        executeJavaScript("arguments[0].scrollIntoView({block: 'center'});", newsCompanyTitle);
        sleep(1000);
        newsCompanyTitle.shouldBe(visible);
        return this;
    }

    @Step("Клик по ссылке 'Перейти в раздел новостей'")
    public NewsPage clickNewsLink() {
        newsLink.shouldBe(visible).click();
        return this;
    }

    @Step("Проверить заголовок на странице новостей")
    public NewsPage verifyNewsPageTitle() {
        newsPageTitle.shouldBe(visible)
                .shouldHave(text("Новости компании"))
                .scrollTo()
                .shouldBe(visible);
        return this;
    }
}
