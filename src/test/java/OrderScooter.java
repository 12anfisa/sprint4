import PageObject.ElementsFirstPageOrder;
import PageObject.ElementsForQuestions;
import PageObject.ElementsSecondPageOrder;
import PageObject.Confirmation;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrderScooter {
    private WebDriver driver;
    ElementsFirstPageOrder elementsFirstPageOrder;
    ElementsSecondPageOrder elementsSecondPageOrder;
    ElementsForQuestions elementsForQuestions;
    Confirmation confirmation;
    @Before
    public void before(){
        ChromeOptions options = new ChromeOptions(); // Драйвер для браузера Chrome
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        elementsFirstPageOrder = new ElementsFirstPageOrder (driver);
        elementsSecondPageOrder = new ElementsSecondPageOrder (driver);
        elementsForQuestions = new ElementsForQuestions(driver);
        confirmation = new Confirmation(driver);
        elementsForQuestions.scrollToQuestionsAboutImportant(elementsForQuestions.OrderUpper);
        elementsForQuestions.clickToElement(elementsForQuestions.OrderUpper);
        elementsForQuestions.clickToElement(elementsForQuestions.OrderUpper);}
    @Test
    public void test1order(){
        elementsFirstPageOrder.setUsername("Anfisa");
        elementsFirstPageOrder.setLastName("Oдинцова");
        elementsFirstPageOrder.setAddress("Садовническая набережная 81");
        elementsFirstPageOrder.setPhone("89991112233");
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Station);
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Button_Next);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Date);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.ThisDate);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Rent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.TimeRent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Color);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Button_Order);
        elementsForQuestions.clickToElement(confirmation.YesOrder);
        elementsForQuestions.comparisonText("Заказ оформлен",confirmation.Sucсess);
        elementsForQuestions.Close();
    }
    @Test
    public void test2order(){
        elementsFirstPageOrder.setUsername("Anfisa");
        elementsFirstPageOrder.setLastName("Odintsova");
        elementsFirstPageOrder.setAddress("Yablochkova 32");
        elementsFirstPageOrder.setPhone("+79991112233");
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Station);
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Button_Next);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Date);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.ThisDate);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Rent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.TimeRent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Color2);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Button_Order);
        elementsForQuestions.clickToElement(confirmation.YesOrder);
        elementsForQuestions.comparisonText("Заказ оформлен",confirmation.Sucсess);
        elementsForQuestions.Close();
    }
}

