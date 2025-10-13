package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MenuPage;

import static io.qameta.allure.Allure.step;

@Owner("Olgavas1006")
@Feature("Навигация по меню")
public class MenuTest extends TestBase{
    MenuPage menuPage = new MenuPage();

    @Test
    @DisplayName("Переход во вкладку Для всех и проверка категорий страхования")
    @Story("Проверка вкладки 'Для всех'")
    void checkForAllTab() {
        step("Открыть главную страницу", () ->
                menuPage.openMainPage());

        step("Нажать на кнопку меню", () ->
                menuPage.clickMenuButton());

        step("Проверить отображение навигационных ссылок", () ->
                menuPage.verifyNavigationLinksVisible());

        step("Плавный скролл к навигационной секции", () ->
                menuPage.smoothScrollToNavigationSection());

        step("Проверить содержимое навигационной секции", () ->
                menuPage.verifyNavigationSectionContent());
    }

    @Test
    @DisplayName("Переход во вкладку Для бизнеса и проверка категорий страхования")
    @Story("Проверка вкладки 'Для бизнеса'")
    void checkForBusinessTab() {
        step("Открыть главную страницу", () ->
                menuPage.openMainPage());

        step("Нажать на кнопку меню", () ->
                menuPage.clickMenuButton());

        step("Нажать на вкладку 'Для бизнеса'", () ->
                menuPage.clickForBusinessTab());

        step("Проверить отображение корпоративных продуктов", () ->
                menuPage.verifyCorporateProductsVisible());

        step("Проверить список категорий корпоративных продуктов", () ->
                menuPage.verifyCorporateProductsList());
    }
}
