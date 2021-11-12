package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CadastrarContaPage {

// FIND BY
	
	@FindBy(linkText = "Sign in")
	public WebElement abaSignIn;

	@FindBy(id = "email_create")
	private WebElement campoEmail;
	
	@FindBy(id = "SubmitCreate")
	public WebElement botaoCreateAccountt;
	
	@FindBy(id = "customer_firstname")
	private WebElement campoFirstName ;
	
	@FindBy(id = "customer_lastname")
	private WebElement campoLastName ;
	
	@FindBy(id = "passwd")
	private WebElement campoPassword1;
		
	@FindBy(id = "address1")
	private WebElement campoAddress1;
	
	@FindBy(id = "city")
	private WebElement campoCity;

	@FindBy(id = "postcode")
	private WebElement campoPostalCode;

	@FindBy(id = "id_country")
	private WebElement campoCountry;
	
	@FindBy(id = "phone_mobile")
	private WebElement campoMobilePhone;

	@FindBy(id = "submitAccount")
	public WebElement botaoSubmitAccountt;
	
// PV	
	
	public void acionarAbaSignIn() {
		abaSignIn.click();
	}
	
	public void acessarMenuSignIn() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaSignIn).build().perform();
	}
	
	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void acionarBotaoCreatAccountt() {
		botaoCreateAccountt.click();
	}
	
	public void acessarCriarConta() {
		Actions acao = new Actions(driver);
		acao.moveToElement(botaoCreateAccountt).build().perform();
	}
	
	public void informarFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}
	
	public void informarLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}
	
	public void informarPassword1(String password) {
		campoPassword1.sendKeys(password);
	}
	
	public void informarAddress1(String address1) {
		campoAddress1.sendKeys(address1);
	}
	
	public void informarCity(String city) {
		campoCity.sendKeys(city);
	}
	
	public void informarPostCode(String postCode) {
		campoPostalCode.sendKeys(postCode);
	}
	
	public void informarCountry() {
	}
	
	public void informarMobilePhone(String mobilePhone) {
		campoMobilePhone.sendKeys(mobilePhone);
	}
	
	public void apertarBotaoSubmitAccountt() throws InterruptedException {
		botaoSubmitAccountt.click();
		Thread.sleep(2000);
	}
}
