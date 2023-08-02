package Day09;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);

        MyMethods.myWait(1);

        Action action = actions.moveToElement(singleClick).click().build();

        action.perform();

        waitAndQuit();
    }
}
