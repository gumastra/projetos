Feature: Validacao Busca

  Scenario: Validar lista de resultados retornados pela busca
    Given que o cliente esteja na pagina principal do magazine luiza
    When buscar pelo produto geladeira
    Then a lista de resultados deve ser exibida

  Scenario: Validar mensagem de erro buscando por um produto inexistente
    Given que o cliente esteja na pagina principal do magazine luiza
    When buscar por um produto inexistente
    Then a seguinte mensagem sua busca por nao encontrou resultado algum
