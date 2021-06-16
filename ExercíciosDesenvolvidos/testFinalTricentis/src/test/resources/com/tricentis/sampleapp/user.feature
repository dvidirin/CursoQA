# language: pt
# encoding: utf-8

Funcionalidade: Acessar o site Tricentis, preencher um formulario e ver uma mensagem de sucesso

Cenario: Acessar o site da Trincentis
	Dado que o usuario esta no site tricentis
	
Cenario: Preencher o formulario da aba enter vehicle data e pressione next
	Quando o usuario esta na aba um "Enter Vehicle Data"
	E o usuario preenche o campo make "Suzuki"
	E o usuario preenche o campo model "Motorcycle"
	E o usuario preenche o campo cylinder capacity "300"
	E o usuario preenche o campo engine performance "800"
	E o usuario preenche o campo date of manufacture "12/05/1999"
	E o usuario preenche o campo number of seats1 "2"
	E o usuario preenche o campo right hand drive "No"
	E o usuario preenche o campo number of seats2 "2"
	E o usuario preenche o campo fuel type "Electric Power"
	E o usuario preenche o campo payload "50"
	E o usuario preenche o campo total weight "200"
	E o usuario preenche o campo list price "80000"
	E o usuario preenche o campo license plate number "FQY0130"
	E o usuario preenche o campo annual mileage "2000"
	E clica no botao next aba um

Cenario: Preencher o formulario da aba enter insurant e pressione next
	Quando o usuario esta na aba dois "Enter Insurant Data"
	E o usuario preenche o campo first name "Carmen"
	E o usuario preenche o campo last name "Sandiego"
	E o usuario preenche o campo date of birth "09/18/1979"
	E o usuario preenche o campo gender "Female"
	E o usuario preenche o campo street address "Avenida de Mayo"
	E o usuario preenche o campo country "Argentina"
	E o usuario preenche o campo zip code "88888888"
	E o usuario preenche o campo city "Buenos Aires"
	E o usuario preenche o campo occupation "Selfemployed"
	E o usuario preenche o campo hobbies " Cliff Diving"
	E o usuario preenche o campo website "https://en.wikipedia.org/wiki/Carmen_Sandiego_(character)"
	E clica no botao next aba dois
	
Cenario: Preencher o formulario da aba enter product data e pressione next
	Quando o usuario esta na aba tres "Enter Product Data"
	E o usuario preenche o campo start date "03/28/2024"
	E o usuario preenche o campo insurance sum "30.000.000,00"
	E o usuario preenche o campo merit rating "Malus 13"
	E o usuario preenche o campo damage insurance "Full Coverage"
	E o usuario preenche o campo optional products "Legal Defense Insurance"
	E o usuario preenche o campo courtesy car "Yes"
	E clica no botao next aba tres
	
Cenario: Selecionar a opcao de preco do seguro e pressione next
	Quando o usuario esta na aba quatro "Select Price Option"
	E escolhe o valor seguro "Platinum"
	E clica no botao next aba quatro
	
Cenario: Preencher o formulario da aba send quote e pressione send
	Quando o usuario esta na aba cinco "Send Quote"
	E o usuario preenche o campo email "carmen@testando.com.ar"
	E o usuario preenche o campo phone "54777777777"
	E o usuario preenche o campo username "carmenvile"
	E o usuario preenche o campo password "Cv123456"
	E o usuario preenche o campo confirm password "Cv123456"
	E o usuario preenche o campo comments "Soy la reina de los ladrones kkkkkk"
	E clica no botao send
	Então verifica a mensagem "Sending e-mail success!"
	