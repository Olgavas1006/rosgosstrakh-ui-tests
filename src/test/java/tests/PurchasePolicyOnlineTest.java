package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PurchasePolicyOnlinePage;

import static io.qameta.allure.Allure.step;

@Owner("Olgavas1006")
@Feature("Онлайн покупка полисов")
public class PurchasePolicyOnlineTest extends TestBase{
    PurchasePolicyOnlinePage purchasePolicyOnlinePage = new PurchasePolicyOnlinePage();

    @Test
    @DisplayName("Проверка категорий в разделе Покупка полиса онлайн")
    @Story("Проверка переключения между категориями полисов")
    void purchasePolicyOnlineCategoriesTest() {
        step("Открыть главную страницу", () ->
                purchasePolicyOnlinePage.openMainPage());

        step("Скролл к заголовку 'Покупка полиса онлайн'", () ->
                purchasePolicyOnlinePage.scrollToPurchasePolicyOnlineTitle());

        step("Клик по всем кнопкам категорий", () ->
                purchasePolicyOnlinePage.clickAllCategoryButtons());
    }
}
