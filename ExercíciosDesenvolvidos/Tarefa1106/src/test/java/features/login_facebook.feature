# language: pt
  # encoding: utf-8

  Funcionalidade: Testa login Facebook

    Cenário: Teste de login
      Dado que o usuario esta na tela de login
      Quando coloca email e senha corretos
      E clica em entrar
      Então deve logar com sucesso na sua conta

