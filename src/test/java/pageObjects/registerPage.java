package pageObjects;

 HEAD
public class registerPage {

	public registerPage() {
		// TODO Auto-generated constructor stub
	}


import org.openqa.selenium.By;

public class registerPage {

	By username_RegisterPage=By.xpath("//input[@id='id_username']");
	By password_RegisterPage=By.xpath("//input[@id='id_password1']");
	By confirmPassword=By.xpath("//input[@id='id_password2']");
	By registerBtn=By.xpath("//input[@value='Register']");
	By alterMessage=By.xpath("//div[@class='alert alert-primary']");
	
//alert: password mismatch
 b4db99f (pushing to darshana branch)
}
