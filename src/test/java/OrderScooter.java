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
        elementsForQuestions.clickToElement(elementsForQuestions.OrderUpper);}
    @Test
    public void test1order(){
        useCase("Анфиса","Одинцова", "Садовническая набережная 81","89991112233","Сокольники" );
        useCase2("4");

    }
    @Test
    public void test2order(){
        useCase("Дмитрий","Соболевский", "Тут 32","+79991112233","Сокольники" );
        useCase2("2");

    }

    public void useCase(String name, String lastName, String address, String phone, String station ) {
        elementsFirstPageOrder.setUsername(name);
        elementsFirstPageOrder.setLastName(lastName);
        elementsFirstPageOrder.setAddress(address);
        elementsFirstPageOrder.setPhone(phone);
        elementsFirstPageOrder.setStation(station);
        elementsForQuestions.clickToElement(elementsFirstPageOrder.Button_Next);

    }
    public void useCase2(String date ) {
        elementsFirstPageOrder.setDate(date);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Rent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.TimeRent);
        elementsForQuestions.clickToElement(elementsSecondPageOrder.Button_Order);
        elementsForQuestions.clickToElement(confirmation.YesOrder);
        elementsForQuestions.comparisonText("Заказ оформлен",confirmation.Sucсess);}
        @After
        public void close () {
            elementsForQuestions.Close();
        }
    }


