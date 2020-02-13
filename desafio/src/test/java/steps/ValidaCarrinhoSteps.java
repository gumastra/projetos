package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CarrinhoPage;
import pages.GeladeiraPage;
import pages.HomePage;
import pages.SearchPage;
import suporte.Web;

public class ValidaCarrinhoSteps {
	
	private WebDriver navegador;
	
	@Given("^que o cliente esteja na pagina do produto desejado$")
	public void que_o_cliente_esteja_na_pagina_do_produto_desejado() {
		navegador = Web.createChrome();
		new HomePage(navegador)
			.searchGeladeira()
			.clickSearchBtn();
		new SearchPage(navegador)
			.clickProduto();
	}

	@When("^clicar em adicionar a sacola$")
	public void clicar_em_adicionar_a_sacola() {
		new GeladeiraPage(navegador)
			.escolhaVoltagem()
			.clickAdicionarASacola()
			.clickContinuar();
	}

	@Then("^o produto deve ser adicionado ao carrinho$")
	public void o_produto_deve_ser_adicionado_ao_carrinho() {
		new CarrinhoPage(navegador)
			.validaProdutoCarrinho();
		navegador.close();
	}
}
