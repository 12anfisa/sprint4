package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementsForQuestions {

    //заголовок вопрос
    public By Heading = By.className("Home_SubHeader__zwi_E");
    private WebDriver driver;
    //заказть верхняя
    public By OrderUpper = By.cssSelector(".Header_Nav__AGCXC > .Button_Button__ra12g");
    //заказать нижняя
    public By OrderLower = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    //сколько это стоит
    public By HowMuchDoesItCost = By.id("accordion__heading-0");
    //текст 1
    public By TextOne = By.cssSelector("#accordion__panel-0 > p");
    //несколько самокатов
    public By aFewScooters = By.id("accordion__heading-1");
    //текс 2
    public By TextTwo = By.cssSelector("#accordion__panel-1 > p");
    //как рассчитывается время
    public By HowToCalculateTheTime = By.id("accordion__heading-2");
    //текст 3
    public By TextThree = By.cssSelector("#accordion__panel-2 > p");
    ///можно ли заказать самокат
    public By OrderAScooterNow = By.id("accordion__heading-3");
    //текст 4
    public By TextFour = By.cssSelector("#accordion__panel-3 > p");
    //можно ли продлить
    public By ToExtend = By.id("accordion__heading-4");
    //текст 5
    public By TextFive = By.cssSelector("#accordion__panel-4 > p");
    //вы привозите зарядку
    public By QuestionAboutCharging = By.id("accordion__heading-5");
    //текст 6
    public By TextSix = By.cssSelector("#accordion__panel-5 > p");
    //можно ли отменить
    public By CanIcancel = By.id("accordion__heading-6");
    //текст 7
    public By TextSeven = By.cssSelector("#accordion__panel-6 > p");
    //я живу за мкадом
    public By LifeIsPain = By.id("accordion__heading-7");
    //текст 8
    public By TextEight = By.cssSelector("#accordion__panel-7 > p");
    //конструктор класса

    public ElementsForQuestions(WebDriver driver) {
        this.driver = driver;

    }

    //метод сколлит до нужного объекта

    public void scrollToQuestionsAboutImportant(By element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(element));;
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



