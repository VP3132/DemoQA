package com.project.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.project.base.Base;

public class Registeration extends Base {
	@Test
	public void RegisterationForm() {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vinod");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Potdar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("PotdarVinod3132@gmail.com");
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9158853132");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();

	}

}
