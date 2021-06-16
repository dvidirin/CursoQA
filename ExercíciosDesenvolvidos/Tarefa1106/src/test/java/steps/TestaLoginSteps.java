package steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestaLoginSteps {

    //Variáveis Globais
    public WebDriver driver;
    WebDriverWait wait;

    //Variáveis de Usuário
    String email = "dvn.face@gmail.com";
    String password = "Nihon0281DAniel";

    //Variáveis de Validação
    String msgValidacao;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 15);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Dado("que o usuario esta na tela de login")
    public void que_o_usuario_esta_na_tela_de_login() {
        driver.get("https://www.facebook.com/");
    }

    @Quando("coloca email e senha corretos")
    public void coloca_email_e_senha_corretos() {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @Quando("clica em entrar")
    public void clica_em_entrar() {
        driver.findElement(By.name("login")).click();
    }

    @Então("deve logar com sucesso na sua conta")
    public void deve_logar_com_sucesso_na_sua_conta() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Daniel Vidiri Neto")));
        msgValidacao = driver.findElement(By.linkText("Daniel Vidiri Neto")).getText();
        Assert.assertEquals("Daniel Vidiri Neto", msgValidacao);
    }
}
