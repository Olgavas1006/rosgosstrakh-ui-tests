package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CitySelectionPage {
    private SelenideElement cityButton = $("button.city"),
            cityInput = $("input[placeholder='Ваш город']"),
            dropdown = $("div.dropdown"),
            dropdownItem = $("div.dropdown div.item");

    @Step("Открыть главную страницу")
    public CitySelectionPage openMainPage() {
        open("");
        return this;
    }

    @Step("Нажать на кнопку выбора города")
    public CitySelectionPage clickCityButton() {
        cityButton.click();
        return this;
    }

    @Step("Кликнуть в поле ввода города")
    public CitySelectionPage clickCityInput() {
        cityInput.click();
        return this;
    }

    @Step("Ввести название города: {city}")
    public CitySelectionPage setCityName(String city) {
        cityInput.setValue(city);
        return this;
    }

    @Step("Проверить отображение выпадающего списка")
    public CitySelectionPage verifyDropdownVisible() {
        dropdown.shouldBe(visible);
        return this;
    }

    @Step("Выбрать город из выпадающего списка")
    public CitySelectionPage selectCityFromDropdown() {
        dropdownItem.click();
        return this;
    }

    @Step("Проверить, что город установился: {city}")
    public CitySelectionPage verifyCitySelected(String city) {
        cityButton.shouldHave(text(city));
        return this;
    }
}
