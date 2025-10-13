package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.InsuranceCasePage;

import static io.qameta.allure.Allure.step;

@Feature("Информация о страховых случаях")
public class InsuranceCaseTest extends TestBase {

    InsuranceCasePage insuranceCasePage = new InsuranceCasePage();

    @Test
    @DisplayName("Проверка раздела 'Для частных лиц'")
    @Story("Проверка видимости раздела для частных лиц")
    void verifyForIndividualsSectionTest() {
        step("Открыть главную страницу", () ->
                insuranceCasePage.openMainPage());
        step("Нажать на ссылку 'Страховой случай'", () ->
                insuranceCasePage.clickInsuranceCaseLink());
        step("Проверить раздел 'Для частных лиц'", () ->
                insuranceCasePage.verifyForIndividualsSection());
    }

    @Test
    @DisplayName("Проверка раздела 'Для корпоративных клиентов'")
    @Story("Проверка видимости раздела для бизнеса")
    void verifyForCorporateClientsSectionTest() {
        step("Открыть главную страницу", () ->
                insuranceCasePage.openMainPage());
        step("Нажать на ссылку 'Страховой случай'", () ->
                insuranceCasePage.clickInsuranceCaseLink());
        step("Проверить раздел 'Для корпоративных клиентов'", () ->
                insuranceCasePage.verifyForCorporateClientsSection());
    }

    @Test
    @DisplayName("Проверка раздела 'Может пригодиться'")
    @Story("Проверка полезных материалов")
    void verifyMayBeUsefulSectionTest() {
        step("Открыть главную страницу", () ->
                insuranceCasePage.openMainPage());
        step("Нажать на ссылку 'Страховой случай'", () ->
                insuranceCasePage.clickInsuranceCaseLink());
        step("Проверить раздел 'Может пригодиться'", () ->
                insuranceCasePage.verifyMayBeUsefulSection());
    }

    @Test
    @DisplayName("Проверка раздела 'Частые вопросы'")
    @Story("Проверка раздела FAQ")
    void verifyFrequentQuestionsSectionTest() {
        step("Открыть главную страницу", () ->
                insuranceCasePage.openMainPage());
        step("Нажать на ссылку 'Страховой случай'", () ->
                insuranceCasePage.clickInsuranceCaseLink());
        step("Проверить раздел 'Частые вопросы'", () ->
                insuranceCasePage.verifyFrequentQuestionsSection());
    }

    @Test
    @DisplayName("Проверка раздела 'Отзывы'")
    @Story("Проверка раздела с отзывами клиентов")
    void verifyReviewsSectionTest() {
        step("Открыть главную страницу", () ->
                insuranceCasePage.openMainPage());
        step("Нажать на ссылку 'Страховой случай'", () ->
                insuranceCasePage.clickInsuranceCaseLink());
        step("Проверить раздел 'Отзывы'", () ->
                insuranceCasePage.verifyReviewsSection());
    }
}
