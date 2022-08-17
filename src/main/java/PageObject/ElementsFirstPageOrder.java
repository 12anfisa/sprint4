package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsFirstPageOrder {
    private WebDriver driver;

    //поле имя
    private By Name = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    //поле фамилия
    private By LastName = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    //поле адрес
    private By Address = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    //поле станция метро
    public By Metro = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    public By Station = By.linkText("Красносельская");
    //поле телефон

    private By Phone = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    //кнопка далее
    public By Button_Next = By.className("Button_Button__ra12g Button_Middle__1CSJM");


    //конструктор класса
    public ElementsFirstPageOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String name) {
        driver.findElement(Name).sendKeys(name);
    }

    public void setLastName(String lastname) {
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void setAddress(String address) {
        driver.findElement(Address).sendKeys(address);
    }
    public void setPhone(String phone) {
        driver.findElement(Phone).sendKeys(phone);
    }
}


