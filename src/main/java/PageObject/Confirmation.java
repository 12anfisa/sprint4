package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation {
    private WebDriver driver;
    //хотите оформить заказ? Да
    public By YesOrder = By.cssSelector("Order_Buttons__1xGrp:nth-child(2) > .Button_Button__ra12g:nth-child(2)");
    //заказ оформлен
    public By Sucсess =By.cssSelector(".Order_ModalHeader__3FDaJ");

    //конструктор класса
    public Confirmation(WebDriver driver) {
        this.driver = driver;}
}
