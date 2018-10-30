package marketing.mailshots;

import java.util.concurrent.TimeUnit;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(ConcordionRunner.class)
public class BusquedaWikipediaSeleniumFixture {

	private WebDriver driver;
	private String baseUrl;
	
	public String buscarSeleniumEnLaWikipedia(
			String baseUrl, 
			String textoBusqueda, 
			String etiquetaCampoBusqueda) {
		//Config
		System.setProperty("webdriver.chrome.driver", "C:\\CursoSonarQube\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navegacion
		driver.get(baseUrl);
		driver.findElement(By.id(etiquetaCampoBusqueda)).clear();
		driver.findElement(By.id(etiquetaCampoBusqueda)).sendKeys(textoBusqueda);
		driver.findElement(By.cssSelector("input[type=submit]")).click();

		
		String resultadoObtenido = driver.findElement(By.cssSelector("span#Selenium_IDE")).getText();
		
		driver.quit();
		
		return resultadoObtenido;
		
		//Las Validaciones estan en el MD
		//Assert.assertEquals("Selenium IDE", resultadoObtenido);
	}
	
}
