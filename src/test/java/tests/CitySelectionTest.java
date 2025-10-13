package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.CitySelectionPage;

import static io.qameta.allure.Allure.step;

@Owner("Olgavas1006")
@Feature("Выбор города")
public class CitySelectionTest extends TestBase {

    CitySelectionPage citySelectionPage = new CitySelectionPage();

    @ParameterizedTest
    @ValueSource(strings = {"Москва", "Уфа", "Новосибирск", "Екатеринбург"})
    @DisplayName("Проверка выбора разных городов")
    @Story("Параметризованная проверка выбора городов")
    void cityParameterizedTest(String city) {
        step("Открыть главную страницу", () ->
                citySelectionPage.openMainPage());

        step("Нажать на кнопку выбора города", () ->
                citySelectionPage.clickCityButton());

        step("Кликнуть в поле ввода города", () ->
                citySelectionPage.clickCityInput());

        step("Ввести название города: " + city, () ->
                citySelectionPage.setCityName(city));

        step("Проверить отображение выпадающего списка", () ->
                citySelectionPage.verifyDropdownVisible());

        step("Выбрать город из выпадающего списка", () ->
                citySelectionPage.selectCityFromDropdown());

        step("Проверить, что город установился: " + city, () ->
                citySelectionPage.verifyCitySelected(city));
    }
}

