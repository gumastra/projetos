Desafio: 
Utilizando as ferramentas que preferir crie um teste automatizado que faça o fluxo de ponta a ponta de um cliente que: 
 
  1- Entre em um grande portal de comércio online(Exemplo: Americanas, Submarino, Magazine Luiza) <br>
  2- Faça uma busca por um produto <br>
  3- Valide o retorno da busca <br>
  4- Escolha um produto na lista <br>
  5- Adicione o carrinho <br>
  6- Valide o produto no carrinho<br>

Tecnologias Usadas:<br>
Selenium, Junit, Cucumber, Java e Maven<br>
Conceito: Page Objects<br>
Report: Cucumber Report<br>
Github<br>

Cenários de Teste:<br>
DADO que o cliente esteja na pagina principal do magazine luiza<br>
QUANDO buscar pelo produto geladeira<br>
ENTÃO a lista de resultados deve ser exibida<br>

DADO que o cliente esteja na página do produto desejado<br>
QUANDO clicar em adicionar a sacola<br>
ENTÃO o produto deve ser adicionado ao carrinho<br>

DADO que o cliente esteja na pagina principal do magazine luiza<br>
QUANDO buscar por um produto inexistente<br>
ENTÃO a a seguinte mensagem "Sua busca por  não encontrou resultado algum :("<br>
