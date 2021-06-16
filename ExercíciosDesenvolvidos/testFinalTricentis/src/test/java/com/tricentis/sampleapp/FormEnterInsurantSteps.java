package com.tricentis.sampleapp;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Quando;

public class FormEnterInsurantSteps {
	
	@Quando("o usuario esta na aba dois {string}")
	public void o_usuario_esta_na_aba_dois(String string) {
		String msgValidation = Configuration.seletorCss("#enterinsurantdata").getAttribute("name");
		assertEquals(string, msgValidation);
	}

	@Quando("o usuario preenche o campo first name {string}")
	public void o_usuario_preenche_o_campo_first_name(String string) {
		Configuration.seletorCss("#firstname").sendKeys(string);
	}

	@Quando("o usuario preenche o campo last name {string}")
	public void o_usuario_preenche_o_campo_last_name(String string) {
		Configuration.seletorCss("#lastname").sendKeys(string);
	}

	@Quando("o usuario preenche o campo date of birth {string}")
	public void o_usuario_preenche_o_campo_date_of_birth(String string) {
		Configuration.seletorCss("#birthdate").sendKeys(string);
	}

	@Quando("o usuario preenche o campo gender {string}")
	public void o_usuario_preenche_o_campo_gender(String string) {
		if (string.contains("Male")) {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)")
					.click();
		} else {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2)")
					.click();
		}
	}

	@Quando("o usuario preenche o campo street address {string}")
	public void o_usuario_preenche_o_campo_street_address(String string) {
		Configuration.seletorCss("#streetaddress").sendKeys(string);
	}

	@Quando("o usuario preenche o campo country {string}")
	public void o_usuario_preenche_o_campo_country(String string) {
		Select pais = new Select(Configuration.seletorCss("#country"));
		pais.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo zip code {string}")
	public void o_usuario_preenche_o_campo_zip_code(String string) {
		Configuration.seletorCss("#zipcode").sendKeys(string);
	}

	@Quando("o usuario preenche o campo city {string}")
	public void o_usuario_preenche_o_campo_city(String string) {
		Configuration.seletorCss("#city").sendKeys(string);
	}

	@Quando("o usuario preenche o campo occupation {string}")
	public void o_usuario_preenche_o_campo_occupation(String string) {
		Select occu = new Select(Configuration.seletorCss("#occupation"));
		occu.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo hobbies {string}")
	public void o_usuario_preenche_o_campo_hobbies(String string) {
		if (string.contains("Speeding")) {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)")
					.click();
		} else if (string.contains("BungeeJumping")){
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)")
					.click();
		} else if (string.contains("Cliff Diving")){
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(3)")
					.click();
		} else if (string.contains("Skydiving")){
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4)")
					.click();
		} else if (string.contains("Other")){
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)")
					.click();
		}
	}

	@Quando("o usuario preenche o campo website {string}")
	public void o_usuario_preenche_o_campo_website(String string) {
		Configuration.seletorCss("#website").sendKeys(string);
	}

	//@Quando("o usuario preenche o campo picture")
	//public void o_usuario_preenche_o_campo_picture() {
	//	Configuration.seletorCss("#open").click();
	//}
	
	@Quando("clica no botao next aba dois")
	public void clica_no_botao_next_aba_dois() {
		Configuration.seletorCss("#nextenterproductdata").click();
	}

}
