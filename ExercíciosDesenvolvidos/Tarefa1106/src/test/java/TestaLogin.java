import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestaLogin {
    //Variáveis Globais
    WebDriver driver;
    WebDriverWait wait;

    //Variáveis de Usuário
    String email = "dvn.face@gmail.com";
    String password = "Nihon0281DAniel";

    //Variáveis de Validação
    String msgValidacao;

    @Before
    public void setup(){
        //Configura Selenium
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Configura temporizador
        wait = new WebDriverWait(driver, 15);
    }

    @Test
    public void metodoGeral(){
        driver.get("https://www.facebook.com/");

        //Preenche campos de login
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);

        //Clica no Botão Entrar
        driver.findElement(By.name("login")).click();

        //Espera elemento aparecer, quando aparece valida texto
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Daniel Vidiri Neto")));

        //Validando o teste de Login
        msgValidacao = driver.findElement(By.linkText("Daniel Vidiri Neto")).getText();
        Assert.assertEquals("Daniel Vidiri Neto", msgValidacao);
    }


}
