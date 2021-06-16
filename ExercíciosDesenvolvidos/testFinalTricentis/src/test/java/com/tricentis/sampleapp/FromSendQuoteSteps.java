package com.tricentis.sampleapp;

import static org.junit.Assert.assertEquals;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class FromSendQuoteSteps {
	
	@Quando("o usuario esta na aba cinco {string}")
	public void o_usuario_esta_na_aba_cinco(String string) {
		String msgValidation = Configuration.seletorCss("#sendquote").getAttribute("name");
		assertEquals(string, msgValidation);
	}

	@Quando("o usuario preenche o campo email {string}")
	public void o_usuario_preenche_o_campo_email(String string) {
		Configuration.seletorCss("#email").sendKeys(string);
	}

	@Quando("o usuario preenche o campo phone {string}")
	public void o_usuario_preenche_o_campo_phone(String string) {
		Configuration.seletorCss("#phone").sendKeys(string);
	}

	@Quando("o usuario preenche o campo username {string}")
	public void o_usuario_preenche_o_campo_username(String string) {
		Configuration.seletorCss("#username").sendKeys(string);
	}

	@Quando("o usuario preenche o campo password {string}")
	public void o_usuario_preenche_o_campo_password(String string) {
		Configuration.seletorCss("#password").sendKeys(string);
	}

	@Quando("o usuario preenche o campo confirm password {string}")
	public void o_usuario_preenche_o_campo_confirm_password(String string) {
		Configuration.seletorCss("#confirmpassword").sendKeys(string);
	}

	@Quando("o usuario preenche o campo comments {string}")
	public void o_usuario_preenche_o_campo_comments(String string) {
		Configuration.seletorCss("#Comments").sendKeys(string);
	}

	@Quando("clica no botao send")
	public void clica_no_botao_send() {
		Configuration.seletorCss("#sendemail").click();
	}

	@Então("verifica a mensagem {string}")
	public void verifica_a_mensagem(String string) throws InterruptedException {
		Thread.sleep(12000);
		String msgSucesso = Configuration.seletorCss("body > div.sweet-alert.showSweetAlert.visible > h2").getText();
		assertEquals(string, msgSucesso);
		Configuration.seletorCss("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button").click();
		Thread.sleep(1000);
		Configuration.close();
	}
}
