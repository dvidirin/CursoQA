package com.facebook;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroFacebook {
    //Método de teste do Junit
    @Test

    //Método criado para teste, público e void (não retorna nenhum valor)
    public void newUser(){
        //Apontamento para o driver do browser que vai ser utilizado no teste, no caso é Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        //Ação que abre o browser
        WebDriver navegador = new ChromeDriver();
        //Comando para maximizar a janela do browser
        navegador.manage().window().maximize();

        //Comando utilizado para navegar para a página desejada
        navegador.get("https://pt-br.facebook.com/r.php");
        //Comandos que preenchem todos os campos com texto
        navegador.findElement(By.name("firstname")).sendKeys("Daniel");
        navegador.findElement(By.name("lastname")).sendKeys("Vidiri Neto");
        navegador.findElement(By.name("reg_email__")).sendKeys("dvn.face@gmail.com");
        navegador.findElement(By.name("reg_email_confirmation__")).sendKeys("dvn.face@gmail.com");
        navegador.findElement(By.name("reg_passwd__")).sendKeys("ABC123!def");

        //Comando que seleciona os valores nos dropdown de dia, mês e ano
        Select datadia = new Select(navegador.findElement(By.id("day")));
        datadia.selectByVisibleText("2");
        Select datames = new Select(navegador.findElement(By.id("month")));
        datames.selectByVisibleText("Fev");
        Select dataano = new Select(navegador.findElement(By.id("year")));
        dataano.selectByVisibleText("1981");

        //Comando para selecionar o sexo "Masculino" nos radio button
        WebElement radiosexo = navegador.findElement(By.cssSelector("input[value='2']"));
        radiosexo.click();

    }
}
