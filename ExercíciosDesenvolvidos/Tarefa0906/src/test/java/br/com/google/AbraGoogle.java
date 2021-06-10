package br.com.google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbraGoogle {
    //Método de Teste do JUnit
    @Test
    //Método criado para teste, público e void (não retorna nada)
    public void abreGoogle(){
        //Apontamento para o driver do browser que vai ser utilizado no teste
        //No caso, o browser utilizado é o Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

        //Comando utilizado para abrir o browser
        WebDriver navegador = new ChromeDriver();

        //Comando utilizado para navegar para a página desejada
        navegador.get("https://www.google.com.br/");

        //Comando utilizado para fechar o browser
        navegador.quit();
    }
}
