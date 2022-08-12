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
    private By Adress = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    //поле станция метро
    public By Metro = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    public By Station = By.linkText("Красносельская");
    //поле телефон

    private By Phone = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    //кнопка далее
    public By Button_Next = By.className("Button_Button__ra12g Button_Middle__1CSJM");


    //конструктор класса
    public ElementsFirstPageOrder(WebDriver driver) {
        this.driver = this.driver;
    }

    public void setUsername(String name) {
        driver.findElement(Name).sendKeys(name);
    }

    public void setLastName(String lastname) {
        driver.findElement(LastName).sendKeys(lastname);
    }
    public void setAdress(String adress) {
        driver.findElement(Adress).sendKeys(adress);
    }
    public void setPhone(String phone) {
        driver.findElement(Phone).sendKeys(phone);
    }
}
   /* public void clickByElement() {
        driver.findElement("").click();

    }
    //метод заполненяет поля ввода пароля
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    //метод кликает по кнопке авторизации
    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
    //метод авторизации в приложении: объединяет ввод email, пароля и клик по кнопке
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}*/

