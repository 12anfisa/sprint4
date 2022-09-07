package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsSecondPageOrder {
    private WebDriver driver;
    //когда привезти самокат
    public static By Date = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    //выбор даты
    // public By ThisDate = By.cssSelector(".Dropdown-placeholder");
    //срок аренды
    public By Rent = By.cssSelector(".Dropdown-placeholder");
    //время аренды
    public By TimeRent = By.className("Dropdown-option");
    // цвет самоката
    private By ScooterColor = By.className("Order_Checkboxes__3lWSI");
    //черный
    public By Color = By.tagName("black");
    //цвет самоката серая безысходность
    public By Color2 = By.tagName("gray");
    // комментарий для курьера
    private By Comment = By.tagName("Комментарий для курьера");
    //кнопка заказть
    public By Button_Order = By.cssSelector(".Button_Middle__1CSJM:nth-child(2)");

    //конструктор класса
    public ElementsSecondPageOrder(WebDriver driver) {
        this.driver = driver;
    }



}




