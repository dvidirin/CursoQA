package com.tricentis.sampleapp;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Quando;

public class FormVehicleDataSteps {
	
	@Quando("o usuario esta na aba um {string}")
	public void o_usuario_esta_na_aba_um(String string) {
		String msgValidation = Configuration.seletorCss("#entervehicledata").getAttribute("name");
		assertEquals(string, msgValidation);
	}
	
	@Quando("o usuario preenche o campo make {string}")
	public void o_usuario_preenche_o_campo_make(String string) {
		Select make = new Select(Configuration.seletorCss("#make"));
		make.selectByVisibleText(string);		
	}

	@Quando("o usuario preenche o campo model {string}")
	public void o_usuario_preenche_o_campo_model(String string) {
		Select model = new Select(Configuration.seletorCss("#model"));
		model.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo cylinder capacity {string}")
	public void o_usuario_preenche_o_campo_cylinder_capacity(String string) {
	    Configuration.seletorCss("#cylindercapacity").sendKeys(string);
	}

	@Quando("o usuario preenche o campo engine performance {string}")
	public void o_usuario_preenche_o_campo_engine_performance(String string) {
		Configuration.seletorCss("#engineperformance").sendKeys(string);
	}

	@Quando("o usuario preenche o campo date of manufacture {string}")
	public void o_usuario_preenche_o_campo_date_of_manufacture(String string) {
		Configuration.seletorCss("#dateofmanufacture").sendKeys(string);
	}

	@Quando("o usuario preenche o campo number of seats1 {string}")
	public void o_usuario_preenche_o_campo_number_of_seats1(String string) {
		Select seat1 = new Select(Configuration.seletorCss("#numberofseats"));
		seat1.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo right hand drive {string}")
	public void o_usuario_preenche_o_campo_right_hand_drive(String string) {
	    
		if (string.contains("Yes")) {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span")
					.click();
		} else {
			Configuration.seletorCss(
		    		"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span")
					.click();
		}
	}
	
	@Quando("o usuario preenche o campo number of seats2 {string}")
	public void o_usuario_preenche_o_campo_number_of_seats2(String string) {
		Select seat2 = new Select(Configuration.seletorCss("#numberofseatsmotorcycle"));
		seat2.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo fuel type {string}")
	public void o_usuario_preenche_o_campo_fuel_type(String string) {
		Select fuel = new Select(Configuration.seletorCss("#fuel"));
		fuel.selectByVisibleText(string);
	}

	@Quando("o usuario preenche o campo payload {string}")
	public void o_usuario_preenche_o_campo_payload(String string) {
		Configuration.seletorCss("#payload").sendKeys(string);
	}

	@Quando("o usuario preenche o campo total weight {string}")
	public void o_usuario_preenche_o_campo_total_weight(String string) {
		Configuration.seletorCss("#totalweight").sendKeys(string);
	}

	@Quando("o usuario preenche o campo list price {string}")
	public void o_usuario_preenche_o_campo_list_price(String string) {
		Configuration.seletorCss("#listprice").sendKeys(string);
	}

	@Quando("o usuario preenche o campo license plate number {string}")
	public void o_usuario_preenche_o_campo_license_plate_number(String string) {
		Configuration.seletorCss("#licenseplatenumber").sendKeys(string);
	}

	@Quando("o usuario preenche o campo annual mileage {string}")
	public void o_usuario_preenche_o_campo_annual_mileage(String string) {
		Configuration.seletorCss("#annualmileage").sendKeys(string);
	}

	@Quando("clica no botao next aba um")
	public void clica_no_botao_next_aba_um() {
		Configuration.seletorCss("#nextenterinsurantdata").click();
	}

}
