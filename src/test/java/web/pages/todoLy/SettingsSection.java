package web.pages.todoLy;

import web.controls.Button;
import web.controls.TextBox;
import org.openqa.selenium.By;

public class SettingsSection {

    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button confirmChangesButton = new Button(By.xpath("//span[text()='Ok']"));
    public TextBox oldPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwOld']"));

    public TextBox newPwdTxtBox = new TextBox(By.xpath("//input[@id='TextPwNew']"));

}
