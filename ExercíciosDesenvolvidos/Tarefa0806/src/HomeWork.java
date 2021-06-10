import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();

        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        if (idade >= 18){
            navegador.get("https://www.wine.com.br/");
            WebElement botaosim = navegador.findElement(By.className("resposta_sim"));
            botaosim.click();
        }

        if (idade < 18){
            navegador.get("https://www.wine.com.br/");
            WebElement botaonao = navegador.findElement(By.className("resposta_nao"));
            botaonao.click();
            //navegador.get("https://www.google.com.br/");
        }

        System.out.println(navegador.getTitle());

    }
}
