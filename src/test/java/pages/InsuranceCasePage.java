package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InsuranceCasePage {
    private SelenideElement insuranceCaseLink = $("a[href*='insurance-case']"),
            forIndividuals = $(byText("Для частных лиц")),
            forCorporateClients = $(byText("Для корпоративных клиентов")),
            mayBeUseful = $(byText("Может пригодиться")),
            frequentQuestions = $(byText("Частые вопросы")),
            reviews = $(byText("Отзывы"));

    @Step("Открыть главную страницу")
    public InsuranceCasePage openMainPage() {
        open("");
        return this;
    }

    @Step("Нажать на ссылку 'Страховой случай'")
    public InsuranceCasePage clickInsuranceCaseLink() {
        insuranceCaseLink.click();
        return this;
    }

    @Step("Проверить раздел 'Для частных лиц'")
    public InsuranceCasePage verifyForIndividualsSection() {
        forIndividuals.shouldBe(visible);
        return this;
    }

    @Step("Проверить раздел 'Для корпоративных клиентов'")
    public InsuranceCasePage verifyForCorporateClientsSection() {
        forCorporateClients.scrollTo().shouldBe(visible);
        return this;
    }

    @Step("Проверить раздел 'Может пригодиться'")
    public InsuranceCasePage verifyMayBeUsefulSection() {
        mayBeUseful.scrollTo().shouldBe(visible);
        return this;
    }

    @Step("Проверить раздел 'Частые вопросы'")
    public InsuranceCasePage verifyFrequentQuestionsSection() {
        frequentQuestions.scrollTo().shouldBe(visible);
        return this;
    }

    @Step("Проверить раздел 'Отзывы'")
    public InsuranceCasePage verifyReviewsSection() {
        reviews.scrollTo().shouldBe(visible);
        return this;
    }
}
