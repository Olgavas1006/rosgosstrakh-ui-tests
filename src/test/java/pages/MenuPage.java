package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MenuPage {
    private SelenideElement menuButton = $("button.action-item.btn--empty.action-item__custom-styles.btn--with-icon"),
            navigationLinks = $(".rgs-navigation-links"),
            navigationSection = $(".rgs-navigation-section"),
            forBusinessTab = $(byText("Для бизнеса"));

    @Step("Открыть главную страницу")
    public MenuPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Нажать на кнопку меню")
    public MenuPage clickMenuButton() {
        menuButton.click();
        return this;
    }

    @Step("Проверить отображение навигационных ссылок")
    public MenuPage verifyNavigationLinksVisible() {
        navigationLinks.shouldBe(visible)
                .shouldHave(text("Действия с полисом"), text("Личный кабинет"));
        return this;
    }

    @Step("Плавный скролл к навигационной секции")
    public MenuPage smoothScrollToNavigationSection() {
        executeJavaScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", navigationSection);
        return this;
    }

    @Step("Проверить содержимое навигационной секции")
    public MenuPage verifyNavigationSectionContent() {
        navigationSection.shouldBe(visible)
                .shouldHave(
                        text("Приложение Росгосстрах"),
                        text("Связь с компанией"),
                        text("Офисы и агенты на карте"),
                        text("О компании")
                );
        return this;
    }

    @Step("Нажать на вкладку 'Для бизнеса'")
    public MenuPage clickForBusinessTab() {
        forBusinessTab.click();
        return this;
    }

    @Step("Проверить отображение корпоративных продуктов")
    public MenuPage verifyCorporateProductsVisible() {
        navigationSection.shouldHave(text("Корпоративные продукты"));
        return this;
    }
    @Step("Проверить список корпоративных продуктов")
    public MenuPage verifyCorporateProductsList() {
        navigationSection.shouldHave(
                text("Автострахование"),
                text("Здоровье"),
                text("Имущество"),
                text("Ответственность"),
                text("Транспорт и перевозки"),
                text("Отраслевые продукты"),
                text("Перестрахование"),
                text("Строительство")
        );
        return this;
    }
}
