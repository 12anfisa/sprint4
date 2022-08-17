package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation {
    private WebDriver driver;
    //хотите оформить заказ? Да
    public By YesOrder = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    //заказ оформлен
    public By Sucсess = By.className("Order_ModalHeader__3FDaJ");

    //конструктор класса
    public Confirmation(WebDriver driver) {
        this.driver = driver;}
}
