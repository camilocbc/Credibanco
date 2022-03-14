package com.banco.bancoPO;

import static org.junit.Assert.assertEquals;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("(https://demoqa.com/automation-practice-form)")
public class toolsPO extends PageObject{

	private String txtFirtName = "//*[@id=\"firstName\"]";
	private String txtLastName = "//*[@id=\"firstName\"]";
	private String btnGenderM = "//*[@id=\"firstName\"]";
	private String btnGenderF = "//*[@id=\"firstName\"]";
	private String btnGenderO = "//*[@id=\"firstName\"]";
	private String txtMobileNumber = "//*[@id=\"firstName\"]";
	private String btnSubmit = "//*[@id=\"firstName\"]";
	
	public void txtFirtName(String primerN) {
		
		find(By.xpath(txtFirtName)).sendKeys(primerN);
	}
	public void txtLastName(String primerN) {
		
		find(By.xpath(txtLastName)).sendKeys(primerN);
	}
	public void txtMobileNumber(String primerN) {
		
		find(By.xpath(txtMobileNumber)).sendKeys(primerN);
	}
	public void btnGender(String gender) {
		
		
		switch (gender) {
		case "M":
			find(By.xpath(btnGenderM)).click();
			break;
		case "F":
			find(By.xpath(btnGenderF)).click();
			break;
		case "O":
			find(By.xpath(btnGenderO)).click();
			break;

		default:
			find(By.xpath(btnGenderM)).click();
			break;
		}
	}
	
	public void btnSubmit() {
		
		find(By.xpath(btnSubmit)).click();
	}
	
}
