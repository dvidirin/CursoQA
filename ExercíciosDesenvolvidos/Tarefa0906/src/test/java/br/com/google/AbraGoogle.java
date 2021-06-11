package br.com.google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        //maximiza a janela do navegador
        navegador.manage().window().maximize();

        //Comando utilizado para navegar para a página desejada
        navegador.get("https://www.google.com/");

        //Vai encontrar o elemento com nome "q" que é o campo de pesquisa e digitar Notebook nele
        navegador.findElement(By.name("q")).sendKeys("Notebook");

        //Ação que vai pressionar o botão ENTER após digitar a palavra no campo de pesquisa
        navegador.findElement(By.name("q")).sendKeys(Keys.ENTER);

        //Criando uma variável que vai receber o valor que quero receber para comparar no teste
        String resultadoEsperado = "Notebook - Pesquisa Google";

        //Ação para comparar resultados, no caso o valor da variável com o valor do título da página
        Assert.assertEquals(resultadoEsperado, navegador.getTitle());

        //Comando utilizado para fechar o browser
        navegador.quit();
    }
}
