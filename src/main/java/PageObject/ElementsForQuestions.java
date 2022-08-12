package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsForQuestions {

    //заголовок вопрос
    public By Heading = By.className("Home_SubHeader__zwi_E");
    private WebDriver driver;
    //заказть верхняя
    public By OrderUpper = By.className("Button_Button__ra12g");
    //заказать нижняя
    private By OrderLower = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    //сколько это стоит
    public By HowMuchDoesItCost = By.id("accordion__heading-0");
    //текст 1
    public By TextOne = By.id("accordion__panel-0");
    //несколько самокатов
    public By aFewScooters = By.id("accordion__heading-1");
    //текс 2
    public By TextTwo = By.id("accordion__panel-1");
    //как рассчитывается время
    public By HowToCalculateTheTime = By.id("accordion__heading-2");
    //текст 3
    public By TextThree = By.id("accordion__panel-2");
    ///можно ли заказать самокат
    public By OrderAScooterNow = By.id("accordion__heading-3");
    //текст 4
    public By TextFour = By.id("accordion__panel-3");
    //можно ли продлить
    public By ToExtend = By.id("accordion__heading-4");
    //текст 5
    public By TextFive = By.id("accordion__panel-4");
    //вы привозите зарядку
    public By QuestionAboutCharging = By.id("accordion__heading-5");
    //текст 6
    public By TextSix = By.id("accordion__panel-5");
    //можно ли отменить
    public By CanIcancel = By.id("accordion__heading-6");
    //текст 7
    public By TextSeven = By.id("accordion__panel-6");
    //я живу за мкадом
    public By LifeIsPain = By.id("accordion__heading-7");
    //текст 8
    public By TextEight = By.id("accordion__panel-8");
    //конструктор класса

    public ElementsForQuestions(WebDriver driver) {
        this.driver = driver;

    }

    //метод сколлит до нужного объекта

    public void scrollToQuestionsAboutImportant(By element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);;
    }
    //клик
    public void clickToElement(By element){
        driver.findElement(element).click();
    }
    //сравниваю текст
    public void comparisonText (String text, By element) {
        ExpectedConditions.textToBe(element, text);

    }

    public void Close(){
        // Закрой браузер
        driver.quit();
    }

    }



