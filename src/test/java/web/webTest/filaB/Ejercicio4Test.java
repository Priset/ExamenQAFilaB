package web.webTest.filaB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import web.webTest.TestBase;

public class Ejercicio4Test extends TestBase {
    String psw = "priset1234";
    String user = "priset@gmail.com";
    String psw2= "karim1234";
    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(user);
        loginSection.passwordTextBox.setText(psw);
        loginSection.loginButton.click();
        menuSection.settingButton.click();
        Thread.sleep(2000);
        settingsSection.oldPwdTxtBox.setText(psw);
        settingsSection.newPwdTxtBox.setText(psw2);
        settingsSection.confirmChangesButton.click();
        Thread.sleep(2000);
        //verificacion deslogeando para volver a logear con la nueva contrasenia
        menuSection.logoutButton.click();
        Thread.sleep(2000);
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(user);
        loginSection.passwordTextBox.setText(psw2);
        loginSection.loginButton.click();

        Thread.sleep(5000);
        Assertions.assertTrue(menuSection.settingButton.isControlDisplayed(), "ERROR, No se pudo cambiar la contraseña");
    }
}