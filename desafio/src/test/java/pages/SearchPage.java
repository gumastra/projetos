package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	private WebDriver navegador;
	
	public SearchPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public SearchPage validaResultado() {
		navegador.findElement(By.className("nm-search-results-container")).isEnabled();
		return this;
	}
	
	public SearchPage validaResultadoInvalido() {
		navegador.findElement(By.id("nm-not-found-page")).isEnabled();
		return this;
	}
	
	public GeladeiraPage clickProduto() {
		navegador.findElement(By.xpath("//*[@id=\"product_088894200\"]")).click();
		return new GeladeiraPage(navegador);
	}

}
