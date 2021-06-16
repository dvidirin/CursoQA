package com.tricentis.sampleapp;

import static org.junit.Assert.assertEquals;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Quando;

public class FormPriceOptionSteps {
	
	@Quando("o usuario esta na aba quatro {string}")
	public void o_usuario_esta_na_aba_quatro(String string) {
		String msgValidation = Configuration.seletorCss("#selectpriceoption").getAttribute("name");
		assertEquals(string, msgValidation);
	}

	@Quando("escolhe o valor seguro {string}")
	public void escolhe_o_valor_seguro(String string) {
		if (string.contains("Silver")) {
			Configuration.seletorCss(
		    		"#priceTable > tfoot > tr > th.group > label:nth-child(1) > span")
					.click();
		} else if (string.contains("Gold")){
			Configuration.seletorCss(
		    		"#priceTable > tfoot > tr > th.group > label:nth-child(2) > span")
					.click();
		} else if (string.contains("Platinum")){
			Configuration.seletorCss(
		    		"#priceTable > tfoot > tr > th.group > label:nth-child(3) > span")
					.click();
		} else if (string.contains("Ultimate")){
			Configuration.seletorCss(
		    		"#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")
					.click();
		}
	}

	@Quando("clica no botao next aba quatro")
	public void clica_no_botao_next_aba_quatro() throws InterruptedException {
		Thread.sleep(2000);
		Configuration.seletorCss("#nextsendquote").click();
	}

}
