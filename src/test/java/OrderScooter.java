import PageObject.ElementsFirstPageOrder;
import PageObject.ElementsForQuestions;
import PageObject.ElementsSecondPageOrder;
import PageObject.Confirmation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrderScooter {
    private WebDriver driver;
    ElementsFirstPageOrder elementsFirstPageOrder;
    ElementsSecondPageOrder elementsSecondPageOrder;
    ElementsForQuestions elementsForQuestions;
    Confirmation confirmation;
    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        elementsFirstPageOrder = new ElementsFirstPageOrder (driver);
        elementsSecondPageOrder = new ElementsSecondPageOrder (driver);
        elementsForQuestions = new ElementsForQuestions(driver);
        confirmation = new Confirmation(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.HowMuchDoesItCost);
        elementsForQuestions.clickToElement(elementsForQuestions.OrderLower);}
    @Test
    public void test1order(){
        elementsFirstPageOrder.setUsername("Анфиса");
        elementsFirstPageOrder.setLastName("Одинцова");
        elementsFirstPageOrder.setAddress("Садовническая набережная 81");
        elementsFirstPageOrder.setPhone("89991112233");
        elementsFirstPageOrder.setMetro("3");
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Button_Next);
        elementsFirstPageOrder.setDate("3");
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Rent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.TimeRent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Color);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Button_Order);
        elementsForQuestions.clickToElement(confirmation.YesOrder);
        elementsForQuestions.comparisonText("Заказ оформлен",confirmation.Sucсess);

    }
    @Test
    public void test2order(){
        elementsFirstPageOrder.setUsername("Дмитрий");
        elementsFirstPageOrder.setLastName("Соболевский");
        elementsFirstPageOrder.setAddress("Тут 32");
        elementsFirstPageOrder.setPhone("+79991112233");
        elementsFirstPageOrder.setMetro("3");
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Button_Next);
        elementsFirstPageOrder.setDate("20");
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Rent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.TimeRent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Color2);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Button_Order);
        elementsForQuestions.clickToElement(confirmation.YesOrder);
        elementsForQuestions.comparisonText("Заказ оформлен",confirmation.Sucсess);

    }
    @After
    public void after(){
        elementsForQuestions.Close();
    }
}

