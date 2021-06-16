package com.tricentis.sampleapp;

import com.tricentis.sampleapp.setup.Configuration;

import io.cucumber.java.pt.Dado;

public class HomeSteps {
	
	@Dado("que o usuario esta no site tricentis")
	public void que_o_usuario_esta_no_site_tricentis() {
	    Configuration.open("http://sampleapp.tricentis.com/101/app.php");
	}

}
