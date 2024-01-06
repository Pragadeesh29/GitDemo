package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String email="aspragadeeshwaran1@gmail.com";
	driver.get("https://groww.in/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div")).click();
	driver.findElement(By.id("login_email1")).sendKeys(email);
	System.out.println(title.equals("Groww - Online Demat, Trading and Direct Mutual Fund Investment in India"));
	driver.quit();
}
}
