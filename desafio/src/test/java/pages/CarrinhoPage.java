package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {
	private WebDriver navegador;
	
	public CarrinhoPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public CarrinhoPage validaProdutoCarrinho() {
		navegador.findElement(By.className("BasketItemProduct")).isDisplayed();
		return this;
	}
}
