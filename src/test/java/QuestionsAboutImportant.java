import PageObject.ElementsForQuestions;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class QuestionsAboutImportant {
    private WebDriver driver;

    @Test
    public void test1() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.HowMuchDoesItCost);
        elementsForQuestions.clickToElement(elementsForQuestions.HowMuchDoesItCost);
        elementsForQuestions.comparisonText("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", elementsForQuestions.TextOne);
        elementsForQuestions.Close();
    }

    @Test
    public void test2() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.aFewScooters);
        elementsForQuestions.clickToElement(elementsForQuestions.aFewScooters);
        elementsForQuestions.comparisonText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", elementsForQuestions.TextTwo);
        elementsForQuestions.Close();
    }

    @Test
    public void test3() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.HowToCalculateTheTime);
        elementsForQuestions.clickToElement(elementsForQuestions.HowToCalculateTheTime);
        elementsForQuestions.comparisonText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", elementsForQuestions.TextThree);
        elementsForQuestions.Close();
    }
    @Test
    public void test4() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.OrderAScooterNow);
        elementsForQuestions.clickToElement(elementsForQuestions.OrderAScooterNow);
        elementsForQuestions.comparisonText("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",elementsForQuestions.TextFour);
        elementsForQuestions.Close();
    }
    @Test
    public void test5() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.ToExtend);
        elementsForQuestions.clickToElement(elementsForQuestions.ToExtend);
        elementsForQuestions.comparisonText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",elementsForQuestions.TextFive);
        elementsForQuestions.Close();
    }
    @Test
    public void test6() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.QuestionAboutCharging);
        elementsForQuestions.clickToElement(elementsForQuestions.QuestionAboutCharging);
        elementsForQuestions.comparisonText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",elementsForQuestions.TextSix);
        elementsForQuestions.Close();
    }
    @Test
    public void test7() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.CanIcancel);
        elementsForQuestions.clickToElement(elementsForQuestions.CanIcancel);
        elementsForQuestions.comparisonText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",elementsForQuestions.TextSeven);
        elementsForQuestions.Close();
    }
    @Test
    public void test8() {
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        ElementsForQuestions elementsForQuestions = new ElementsForQuestions(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.LifeIsPain);
        elementsForQuestions.clickToElement(elementsForQuestions.LifeIsPain);
        elementsForQuestions.comparisonText("Да, обязательно. Всем самокатов! И Москве, и Московской области.",elementsForQuestions.TextEight);
        elementsForQuestions.Close();
    }
}