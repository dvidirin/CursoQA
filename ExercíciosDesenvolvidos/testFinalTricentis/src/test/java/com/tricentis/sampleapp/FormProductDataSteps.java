package com.tricentis.sampleapp;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Quando;

public class FormProductDataSteps {
	
	@Quando("o usuario esta na aba tres {string}")
	public void o_usuario_esta_na_aba_tres(String string) {
		String msgValidation = Configuration.seletorCss("#enterproductdata").getAttribute("name");
		assertEquals(string, msgValidation);
	}

	@Quando("o usuario preenche o campo start date {string}")
	public void o_usuario_preenche_o_campo_start_date(String string) {
		Configuration.seletorCss("#startdate").sendKeys(string);
	}

	@Quando("o usuario preenche o campo insurance sum {string}")
	public void o_usuario_preenche_o_campo_insurance_sum(String string) {
		Select insu = new Select(Configuration.seletorCss("#insurancesum"));
		insu.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo merit rating {string}")
	public void o_usuario_preenche_o_campo_merit_rating(String string) {
		Select merit = new Select(Configuration.seletorCss("#meritrating"));
		merit.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo damage insurance {string}")
	public void o_usuario_preenche_o_campo_damage_insurance(String string) {
		Select dmg = new Select(Configuration.seletorCss("#damageinsurance"));
		dmg.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo optional products {string}")
	public void o_usuario_preenche_o_campo_optional_products(String string) {
		if (string.contains("Euro Protection")) {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)")
					.click();
		} else {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(2)")
					.click();
		}
	}

	@Quando("o usuario preenche o campo courtesy car {string}")
	public void o_usuario_preenche_o_campo_courtesy_car(String string) {
		Select court = new Select(Configuration.seletorCss("#courtesycar"));
		court.selectByVisibleText(string);
	}

	@Quando("clica no botao next aba tres")
	public void clica_no_botao_next_aba_tres() {
		Configuration.seletorCss("#nextselectpriceoption").click();
	}

}
