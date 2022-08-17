import PageObject.ElementsForQuestions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class QuestionsAboutImportant {
    private WebDriver driver;
    ElementsForQuestions elementsForQuestions;
@Before
public void before() {ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
    driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    elementsForQuestions = new ElementsForQuestions(driver);}
    @Test
    public void test1() {
    runtest(elementsForQuestions.HowMuchDoesItCost, elementsForQuestions.HowMuchDoesItCost, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", elementsForQuestions.TextOne);
    }

    @Test
    public void test2() {
    runtest(elementsForQuestions.aFewScooters,elementsForQuestions.aFewScooters, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", elementsForQuestions.TextTwo);
    }

    @Test
    public void test3() {
        runtest(elementsForQuestions.HowToCalculateTheTime, elementsForQuestions.HowToCalculateTheTime, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", elementsForQuestions.TextThree);
    }

    @Test
    public void test4() {
        runtest(elementsForQuestions.OrderAScooterNow, elementsForQuestions.OrderAScooterNow, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",elementsForQuestions.TextFour);
    }
    @Test
    public void test5() {
        runtest(elementsForQuestions.ToExtend, elementsForQuestions.ToExtend, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",elementsForQuestions.TextFive);
    }
    @Test
    public void test6() {
        runtest(elementsForQuestions.QuestionAboutCharging, elementsForQuestions.QuestionAboutCharging, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",elementsForQuestions.TextSix);
    }
    @Test
    public void test7() {
        runtest(elementsForQuestions.CanIcancel, elementsForQuestions.CanIcancel, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",elementsForQuestions.TextSeven);
    }
    @Test
    public void test8() {
        runtest(elementsForQuestions.LifeIsPain,elementsForQuestions.LifeIsPain,"Да, обязательно. Всем самокатов! И Москве, и Московской области.",elementsForQuestions.TextEight);
    }
    @After
    public void after(){
        elementsForQuestions.Close();
    }
    private void runtest(By scrollToElement,By clickToElement,String text, By textElement) {
        elementsForQuestions.scrollToQuestionsAboutImportant(scrollToElement);
        elementsForQuestions.clickToElement(clickToElement);
        elementsForQuestions.comparisonText(text, textElement);

    }
}