package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation {
    private WebDriver driver;
    //хотите оформить заказ? Да
    public By YesOrder = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    //заказ оформлен
    public By Sucсess =By.cssSelector(".Order_ModalHeader__3FDaJ");

    //конструктор класса
    public Confirmation(WebDriver driver) {
        this.driver = driver;}
}
