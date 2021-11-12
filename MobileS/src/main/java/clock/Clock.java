package clock;
import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Clock {

	public static void main(String[] args) throws Exception {
		
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
	    el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("mais");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
	    el3.click();	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("igual");
	    el4.click();
	}

	  private AndroidDriver driver;

	  public void acessarApp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.google.android.deskclock");
	    desiredCapabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  public void acessarMenuAlarme() throws Exception{
		//ALARM
		    System.out.println("Acessando meu alarme");
		    MobileElement botaoAlarme = (MobileElement) driver
		    		.findElement(MobileBy.AccessibilityId("Alarm"));
		    botaoAlarme.click();		    
		    Thread.sleep(2000);
	  }
	  
	  public void acionarBotaoNovoAlarme() throws Exception{
		    //ADD ALARM
		    System.out.println("Adicionando novo alarme");
			MobileElement botaoADD = (MobileElement) driver.findElement(MobileBy.AccessibilityId("Add alarm"));
		    botaoADD.click();		    
		    Thread.sleep(2000);
	  }
	  
	  public void acionarBotaoOk() throws Exception {
		    //ADD ALARM
		  	MobileElement botaoOk = (MobileElement) driver.findElement(MobileBy.id("android:id/button1"));
		  	botaoOk.click();		  	    
		  	Thread.sleep(2000);
	  }

	  public void interagirComElementos() throws Exception {
	    
		  acessarMenuAlarme();
		  acionarBotaoNovoAlarme();
		  
		  MobileElement campoLabel = (MobileElement) driver.findElement(MobileBy.id("com.google.android.deskclock:id/edit_label"));
		  campoLabel.click();		  
		  Thread.sleep(2000);
		  
		  MobileElement campoEditText = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.EditText"));
		  campoEditText.sendKeys("novo alarme");
		  Thread.sleep(2000);
	  }
	  

	  public void interagirComCombo() throws Exception {
		  
		  acessarMenuAlarme();
		  acionarBotaoNovoAlarme();
		  
		  System.out.println("interagindo com o combo");
		  MobileElement textCombo = (MobileElement) driver.findElement(MobileBy.id("//android.widget.TextView[@text = 'Default (Celsium)']"));
		  textCombo.click();
		  Thread.sleep(2000);
		  
		  MobileElement opcaoCombo = (MobileElement) driver.findElement(MobileBy.id("//android.widget.TextView[@text = 'Barium']"));
		  opcaoCombo.click();
		  Thread.sleep(2000);
		  
	  }
	  

      public void interagindoComSwitch() throws Exception{
    	  
    	  acessarMenuAlarme();
    	  acionarBotaoNovoAlarme();
		  
		  MobileElement switchApp = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.Switch[@text = 'ON'][1]"));
		  switchApp.click();
		  Thread.sleep(2000);
		  
		  assertEquals("False", switchApp.getAttribute("checked"));
		  
      }
      

      public void interagindoComCheckBox() throws Exception{
    	  
    	  acessarMenuAlarme();
    	  acionarBotaoNovoAlarme();
		  
		  MobileElement check = (MobileElement) driver.findElement(By.xpath("//android.widget.CheckBox[@text = 'REPEAT']"));
		  check.click();
		  Thread.sleep(2000);
		  
		  assertEquals("True", check.getAttribute("checked"));
		  
      }
      
      public void clicarNaHora(String hora) throws Exception {
    	  
    	  MobileElement clickHora = (MobileElement) driver.findElement(MobileBy.AccessibilityId(hora));
    	  clickHora.click();
    	  Thread.sleep(2000);
      }
      
      public void clicarNaMinuto(String minuto) throws Exception {
    	  
    	  MobileElement clickMinuto = (MobileElement) driver.findElement(MobileBy.AccessibilityId(minuto));
    	  clickMinuto.click();
    	  Thread.sleep(2000);
       }
      
       public void selecionarOPeriodo(String periodo) throws Exception {
    	  
    	  String periodoModificado = periodo.toLowerCase();
    	   
    	  MobileElement clickPeriodo = (MobileElement) driver.findElement(MobileBy.id("android.id" + periodoModificado + "_label"));
    	  clickPeriodo.click();
    	  Thread.sleep(2000);
       }
      

	  public void fecharAplicativo() {
	    driver.quit();
	  }
}
