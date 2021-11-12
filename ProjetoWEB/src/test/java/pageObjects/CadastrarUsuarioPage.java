package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastrarUsuarioPage {
	
	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement campoEmployer;
	
	@FindBy(name = "systemUser[userName]")
	private WebElement campoUserName;
	
	@FindBy(name = "systemUser[password]")
	private WebElement campoPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	private WebElement campoConfirmPassword;
	
	@FindBy(name = "btnSave")
	private WebElement botaoSave;

	public void informarCampoEmployerName(String employerName) {
		campoEmployer.clear();
		campoEmployer.sendKeys(employerName);
	}

	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void informarCampoConfirmarPassword(String password) {
		campoConfirmPassword.sendKeys(password);
	}
	
	public void acionarBotaoSalvar() {
		botaoSave.click();
	}
		
}
