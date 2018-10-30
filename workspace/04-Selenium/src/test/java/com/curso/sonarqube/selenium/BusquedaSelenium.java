package com.curso.sonarqube.selenium;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class BusquedaSelenium {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\CursoSonarQube\\software\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.es/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testBusquedaSelenium() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("wikipedia");
		driver.findElement(By.cssSelector("input[type=button]")).click();
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > div.r > a"))
				.click();
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Componentes de Selenium'])[1]/following::span[2]"))
				.click();
		
		String resultadoObtenido = driver.findElement(By.cssSelector("span#Selenium_IDE")).getText();
		
		Assert.assertEquals("Selenium IDE", resultadoObtenido);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
