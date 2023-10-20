package web.pages.todoist;


import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class RegisterSection {

    public TextBox emailTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, 'Introduce tu email...')]"));

    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, 'Introduce tu contrase\u00f1a...')]"));

    public TextBox nameTxtBox = new TextBox(By.xpath("//input[contains(@placeholder, 'Por ej. Juan P\u00e9rez')]"));

    public Button personalButton = new Button(By.xpath("(//button[@type='button'])[1]"));

    public Button continueButton = new Button(By.xpath("//button[@type='submit']"));

    public Button signUpButton = new Button(By.xpath("//button[@data-gtm-id='start-email-signup']"));

    public Button openTodoIstButton = new Button(By.xpath("//button[@aria-label='Abrir Todoist']"));
}
