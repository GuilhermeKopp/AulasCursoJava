package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CadastrarContaPage;

public class Hooks {

	@Before(value = "not @CadastrarConta")
	public void suiteSetUp() {
		acessarSistema();
		Na(CadastrarContaPage.class).informarCampoEmail("testandoo1999@gmail.com");
	}
	
	@Before(value = "@CadastrarConta")
	public void funcionalidadeCriarConta() {
		acessarSistema();
	}
	
	
	@After(order = 0)
	public void suiteTearDown(Scenario scenario) throws Exception {
		capturarTela(scenario);
		driver.quit();
	}
	
}
