package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;

import static io.qameta.allure.Allure.step;

@Owner("Olgavas1006")
@Feature("Личный кабинет")
public class AuthorizationTest extends TestBase {

    AuthorizationPage authorizationPage = new AuthorizationPage();
    Faker faker = new Faker();

    @Test
    @DisplayName("Проверка входа в личный кабинет")
    @Story("Проверка ошибки при вводе неверного номера телефона")
    void authorizationTest() {
        String randomPhone = faker.numerify("89#########");

        step("Открыть главную страницу", () ->
                authorizationPage.openMainPage());

        step("Нажать на кнопку 'Войти'", () ->
                authorizationPage.clickLoginLink());

        step("Выбрать 'Личный кабинет клиента'", () ->
                authorizationPage.clickClientAccount());

        step("Ввести случайный номер телефона", () ->
                authorizationPage.setPhoneNumber(randomPhone));

        step("Нажать кнопку 'Войти'", () ->
                authorizationPage.clickLoginButton());

        step("Проверить сообщение об ошибке", () ->
                authorizationPage.verifyPhoneError());
    }
}
