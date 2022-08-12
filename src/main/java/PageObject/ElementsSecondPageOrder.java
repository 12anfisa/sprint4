package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsSecondPageOrder {
    private WebDriver driver;
    //когда привезти самокат
    public By Date = By.tagName("* Когда привезти самокат");
    //выбор даты
    public By ThisDate = By.className("react-datepicker__day react-datepicker__day--026 react-datepicker__day--selected");
    //срок аренды
    public By Rent = By.className("Dropdown-control");
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
    public By Button_Order = By.className("Button_Button__ra12g Button_Middle__1CSJM");

//конструктор класса
public ElementsSecondPageOrder(WebDriver driver) {
    this.driver = this.driver;
}
   //заполняет пол



}
