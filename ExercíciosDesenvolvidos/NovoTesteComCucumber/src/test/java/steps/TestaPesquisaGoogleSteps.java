package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TestaPesquisaGoogleSteps {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Dado("que estou na tela de pesquisa do google")
	public void que_estou_na_tela_de_pesquisa_do_google() {
	    driver.get("https://www.google.com/");
	}

	@Quando("pesquiso por {string}")
	public void pesquiso_por(String produto) {
		driver.findElement(By.name("q")).sendKeys(produto);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Então("o titulo da pagina deve conter {string}")
	public void o_titulo_da_pagina_deve_conter(String resultadoEsperado) {
		assertEquals(resultadoEsperado, driver.getTitle());	    
	}
	
	@After
	public void dps() {
		driver.quit();
	}

}
