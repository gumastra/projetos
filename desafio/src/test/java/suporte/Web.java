package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gustavofm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.get("http://www.magazineluiza.com.br");
		return navegador;
	}
}
