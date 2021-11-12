package pageObjects;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ClockPage {

	  public ClockPage(AppiumDriver<?> driver) {
		  
		  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		  
	  }
	  
	  @AndroidFindBy(accessibility = "Alarm")
	  private MobileElement botaoAlarme;
	  
	  @AndroidFindBy(accessibility = "Add alarm")
	  private MobileElement botaoADD;
	  
	  @AndroidFindBy(id = "android:id/button1")
	  private MobileElement botaoOk;
	  
	  @AndroidFindBy(id = "com.google.android.deskclock:id/edit_label")
	  private MobileElement campoLabel;
	  
	  @AndroidFindBy(xpath = "//android.widget.EditText")
	  private MobileElement campoEditText;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Default (Celsium)']")
	  private MobileElement textCombo;
	  
	  @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Barium']")
	  private MobileElement opcaoCombo;
	  
	  @AndroidFindBy(xpath = "//android.widget.Switch[@text = 'ON'][1]")
	  private MobileElement switchApp;
	
	  @AndroidFindBy(xpath = "//android.widget.CheckBox[@text = 'REPEAT']")
	  private MobileElement check;
	  
	  public void acessarMenuAlarme() throws Exception{
		//ALARM
		    System.out.println("Acessando meu alarme");
		    botaoAlarme.click();		    
	  }
	  
	  public void acionarBotaoNovoAlarme() throws Exception{
		    //ADD ALARM
		    System.out.println("Adicionando novo alarme");
		    botaoADD.click();		    
	  }
	  
	  public void acionarBotaoOk() throws Exception {
		    //ADD ALARM
		  	botaoOk.click();		  	    
	  }

	  public void interagirComElementos() throws Exception {
	    
		  acessarMenuAlarme();
		  acionarBotaoNovoAlarme();
	  }
	  

	  public void interagirComCombo() throws Exception {
		  
		  acessarMenuAlarme();
		  acionarBotaoNovoAlarme();
		  
		  System.out.println("interagindo com o combo");
		  textCombo.click();
		  
		  opcaoCombo.click(); 
	  }
	  
      public void interagindoComSwitch() throws Exception{
    	  
    	  acessarMenuAlarme();
    	  acionarBotaoNovoAlarme();
		  
		  switchApp.click();
		  
		  assertEquals("False", switchApp.getAttribute("checked"));  
      }
      
      public void interagindoComCheckBox() throws Exception{
    	  
    	  acessarMenuAlarme();
    	  acionarBotaoNovoAlarme();
		  
		  check.click();
		  
		  assertEquals("True", check.getAttribute("checked"));	  
      }
      
      public void clicarNaHora(String hora) throws Exception {
    	  
    	  MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
    	  clickHora.click();
      }
      
      public void clicarNaMinuto(String minuto) throws Exception {
    	  
    	  MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
    	  clickMinuto.click();
       }
      
       public void selecionarOPeriodo(String periodo) throws Exception {
    	  
    	  String periodoModificado = periodo.toLowerCase();
    	   
    	  MobileElement clickPeriodo = (MobileElement) driver.findElement(MobileBy.id("android.id" + periodoModificado + "_label"));
    	  clickPeriodo.click();
       }
       
       public void validarInformacoes(List <String> dados) {
    	   
    	   MobileElement infos;
    	   
    	   for (String info : dados) {
    		   infos = (MobileElement) driver.findElement(MobileBy.xpath("//*[@text = '"+ info +"']"));
    		   System.out.println("Infos tela: " + infos.getText());
    		   assertEquals(info, infos.getText());
    	   }
       }
      
}
