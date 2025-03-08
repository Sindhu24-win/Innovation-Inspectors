package pageObjects;

import org.openqa.selenium.By;

public class homePage {

	By signout=By.xpath("//a[@href='/logout']");
	By Arraybutton=By.xpath("//a[@href='array']");
	
	By Linkedlistbutton=By.xpath("//a[@href='linked-list']");
	By Stackbutton=By.xpath("//a[@href='stack']");
	By queuebutton=By.xpath("//a[@href='queue']");
	By graphbutton=By.xpath("//a[@href='graph']");
	By treebutton=By.xpath("//a[@href='tree']");
	By registerlink=By.xpath("//a[@href='/register']");
	By logoutmessage=By.xpath("//div[@role='alert']");
	By loginlink=By.xpath("//a[@href='/login']");
	By loginmessage=By.xpath("//div[@role='alert']");
	By logoutlink=By.xpath("//a[@href='/logout']");
	
	
}
