package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
	
	@Before(value = "not @login")
	public void suiteSetUp() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	
	@After(order = 0)
	public void suiteTearDown(Scenario scenario) throws Exception {
		capturarTela(scenario);
		driver.quit();
	}

}
