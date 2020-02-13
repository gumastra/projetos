package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import suporte.Web;

public class ValidaBuscaSteps {
	
	private WebDriver navegador;
	
	@Given("^que o cliente esteja na pagina principal do magazine luiza$")
	public void que_o_cliente_esteja_na_pagina_principal_do_magazine_luiza() {
		navegador = Web.createChrome();
	}

	@When("^buscar pelo produto geladeira$")
	public void buscar_pelo_produto_geladeira() {
		new HomePage(navegador)
		.searchGeladeira()
		.clickSearchBtn();
	}

	@Then("^a lista de resultados deve ser exibida$")
	public void a_lista_de_resultados_deve_ser_exibida() {
		new SearchPage(navegador).validaResultado();
		navegador.close();
	}
	
	@When("^buscar por um produto inexistente$")
	public void buscar_por_um_produto_inexistente() {
		new HomePage(navegador)
		.searchInvalid()
		.clickSearchBtn();
	}

	@Then("^a seguinte mensagem sua busca por nao encontrou resultado algum$")
	public void a_seguinte_mensagem_sua_busca_por_nao_encontrou_resultado_algum() {
		new SearchPage(navegador).validaResultadoInvalido();
		navegador.close();
	}
}
