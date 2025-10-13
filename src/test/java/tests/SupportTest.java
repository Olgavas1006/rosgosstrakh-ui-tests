package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SupportPage;

import static io.qameta.allure.Allure.step;

@Owner("Olgavas1006")
@Feature("Вкладки поддержки")
public class SupportTest extends TestBase {

    SupportPage supportPage = new SupportPage();

    @Test
    @DisplayName("Проверка вкладки Осаго")
    @Story("Проверка открытия страницы ОСАГО")
    void checkOsagoSupport() {
        step("Открыть главную страницу", () ->
                supportPage.openMainPage());

        step("Перейти в Центр помощи", () ->
                supportPage.clickSupportLink());

        step("Проверить заголовок Центра помощи", () ->
                supportPage.verifySupportTitle());

        step("Нажать на кнопку ОСАГО", () ->
                supportPage.clickOsagoButton());

        step("Проверить заголовок popup ОСАГО", () ->
                supportPage.verifyOsagoPopup());
    }

    @Test
    @DisplayName("Проверка вкладки Копия или дубликат полиса")
    @Story("Проверка открытия страницы Копия полиса")
    void checkPolicyCopySupport() {
        step("Открыть главную страницу", () ->
                supportPage.openMainPage());

        step("Перейти в Центр помощи", () ->
                supportPage.clickSupportLink());

        step("Проверить заголовок Центра помощи", () ->
                supportPage.verifySupportTitle());

        step("Нажать на кнопку 'Копия или дубликат полиса'", () ->
                supportPage.clickPolicyCopyButton());

        step("Проверить заголовок popup копии полиса", () ->
                supportPage.verifyPolicyCopyPopup());
    }

    @Test
    @DisplayName("Проверка вкладки Cправка об оплате страховых взносов")
    @Story("Проверка открытия страницы Справки")
    void checkPaymentCertificateSupport() {
        step("Открыть главную страницу", () ->
                supportPage.openMainPage());

        step("Перейти в Центр помощи", () ->
                supportPage.clickSupportLink());

        step("Проверить заголовок Центра помощи", () ->
                supportPage.verifySupportTitle());

        step("Нажать на ссылку 'Справка об оплате страховых взносов'", () ->
                supportPage.clickPaymentCertificateLink());

        step("Проверить заголовок страницы справки", () ->
                supportPage.verifyPaymentCertificatePage());
    }

    @Test
    @DisplayName("Проверка вкладки Все вопросы и ответы")
    @Story("Проверка открытия страницы Все вопросы и ответы")
    void checkFaqSupport() {
        step("Открыть главную страницу", () ->
                supportPage.openMainPage());

        step("Перейти в Центр помощи", () ->
                supportPage.clickSupportLink());

        step("Проверить заголовок Центра помощи", () ->
                supportPage.verifySupportTitle());

        step("Нажать на ссылку 'Все вопросы и ответы'", () ->
                supportPage.clickFaqLink());

        step("Проверить содержимое страницы FAQ", () ->
                supportPage.verifyFaqPage());
    }
}
