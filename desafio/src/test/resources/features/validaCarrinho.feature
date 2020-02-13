Feature: Validacao Carrinho

  Scenario: Validar que o produto selecionado foi adicionado ao carrinho
    Given que o cliente esteja na pagina do produto desejado
    When clicar em adicionar a sacola
    Then o produto deve ser adicionado ao carrinho
