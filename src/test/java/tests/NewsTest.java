package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.NewsPage;

import static io.qameta.allure.Allure.step;

@Feature("Новости компании")
public class NewsTest extends TestBase {

    NewsPage newsPage = new NewsPage();

    @Test
    @DisplayName("Проверка вкладки новости")
    @Story("Переход на страницу новостей компании")
    void newsSectionTest() {
        step("Открыть главную страницу", () ->
                newsPage.openMainPage());

        step("Скролл к заголовку 'Новости компании' на главной странице", () ->
                newsPage.scrollToNewsCompanyTitle());

        step("Клик по ссылке 'Перейти в раздел новостей'", () ->
                newsPage.clickNewsLink());

        step("Проверить заголовок на странице новостей", () ->
                newsPage.verifyNewsPageTitle());
    }
}
