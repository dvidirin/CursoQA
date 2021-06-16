# language: pt
# encoding: utf-8

Funcionalidade: Testa pesquisa google

Cenario: Deve validar pesquisa de <produto>
	Dado que estou na tela de pesquisa do google
	Quando pesquiso por <produto>
	Então o titulo da pagina deve conter <ResultadoDaPesquisa>
	
Exemplos:
|produto    |ResultadoDaPesquisa          |
|"notebook" |"notebook - Pesquisa Google" |
|"geladeira"|"geladeira - Pesquisa Google"|
|"televisão"|"televisão - Pesquisa Google"|
	