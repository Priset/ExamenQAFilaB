package web.webTest.filaB;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import web.webTest.TestBase2;

import java.util.Random;

public class Ejercicio3Test extends TestBase2 {

        private static Random rand = new Random();

        @BeforeAll
        public static void setup(){
                userRand = "karim"+rand.nextInt(10000)+"@gmail.com";
        }
        static String userRand;
        @Test
        public void createUserTest() throws InterruptedException {
                mainTodoistPage.loginButton.click();
                mainTodoistPage.registerButton.click();
                registerSection.emailTxtBox.setText(userRand);
                registerSection.pwdTxtBox.setText("Priset753159");
                registerSection.signUpButton.click();
                Thread.sleep(6000);
                registerSection.nameTxtBox.setText("Karim" + rand.nextInt(10000));
                registerSection.continueButton.click();
                Thread.sleep(2000);
                registerSection.personalButton.click();
                registerSection.openTodoIstButton.click();
        }

        @Test
        public void createProject() throws InterruptedException{
                String nameProject = "UPB QA TESTING";
                mainTodoistPage.loginButton.click();
                loginPage.emailTextBox.setText(userRand);
                loginPage.passwordTextBox.setText("Priset753159");
                loginPage.loginButton.click();

                //Crear projeyto
                Thread.sleep(3000);
                lateralProjectSection.projectSectionLabel.click();
                lateralProjectSection.addProjectButton.click();
                addProjectPopUp.projectNameTextbox.setText(nameProject);
                addProjectPopUp.changeColorButton.click();
                addProjectPopUp.selectBlueColor.click();
                addProjectPopUp.submitNameButton.click();
                Assertions.assertEquals(lateralProjectSection.checkNewProject(nameProject).getTextValue(), nameProject, "ERROR! No se pudo crear el proyecto");

        }
}
