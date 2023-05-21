package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.base_class_datadriven;
import com.runner.Runner_dataDriven;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;

public class stepdef_dataDriven extends base_class_datadriven {
	public static WebDriver driver = Runner_dataDriven.driver;
	
	@Given("Launch the DemoQA website")
	public static void launch_the_demo_qa_website() {
		base_class_datadriven.driver = driver;
	driver = getURL("https://demoqa.com/text-box");
	}

	@When("I enter my name fullname name field")
	public void i_enter_my_name_fullname_name_field() {
	Sendkeys(driver.findElement(By.id("userName")), "hariprasad");
	}

	@When("I enter my email address in email field")
	public void i_enter_my_email_address_in_email_field() {
		Sendkeys(driver.findElement(By.id("userEmail")), "hari123@gmail.com");
	}

	@When("I enter my address address in address field")
	public void i_enter_my_address_address_in_address_field() {
		Sendkeys(driver.findElement(By.id("currentAddress")), "1188 Duncan Avenue  Lighthouse Point United States");
	}

	@When("I enter my confirm address address in permenent address field")
	public void i_enter_my_confirm_address_address_in_permenent_address_field() {
		Sendkeys(driver.findElement(By.id("permanentAddress")), "1188 Duncan Avenue  Lighthouse Point United States");
			}

	@Then("I click the Sumbit button user able to view Enter details below")
	public void i_click_the_sumbit_button_user_able_to_view_enter_details_below() {
		ClickonElement(driver.findElement(By.id("submit")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 5000)");
	}

	@When("I Click the forms field")
	public void i_click_the_forms_field() throws InterruptedException {
		Thread.sleep(5000);
		ClickonElement(driver.findElement(By.xpath("(//div[@class='icon'])[2]")));
		
	}

	@When("Click the practice form field")
	public void click_the_practice_form_field() {
		ClickonElement(driver.findElement(By.xpath("//span[text()='Practice Form']")));
	}
		
	@When("I enter my first name in name field")
	public void i_enter_my_first_name_in_name_field() {
		
	}

	@When("I enter my Last sname in name field")
	public void i_enter_my_last_sname_in_name_field() {
		Sendkeys(driver.findElement(By.id("firstName")), "Hariprasd");
	}

	@When("I enter my email in email field")
	public void i_enter_my_email_in_email_field() {
		Sendkeys(driver.findElement(By.id("lastName")), "Muralikrishnan");
	}

	@When("I choose my gender")
	public void i_choose_my_gender() {
		ClickonElement(driver.findElement(By.xpath("//label[text()='Male']")));
	}

	@When("I Enter the vaild mobile number")
	public void i_enter_the_vaild_mobile_number() {
		Sendkeys(driver.findElement(By.id("userNumber")), "1234567891");
	}

	@When("I Select the date")
	public void i_select_the_date() {
		Sendkeys(driver.findElement(By.id("dateOfBirthInput")), "10 July 1994");
	}

	@When("I enter my choosed Subject")
	public void i_enter_my_choosed_subject() {
		Sendkeys(driver.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']")), "Game creation");
	}

	@When("I Click the my hobbies in Hobbies field")
	public void i_click_the_my_hobbies_in_hobbies_field() {
		ClickonElement(driver.findElement(By.id("hobbies-checkbox-3")));
	}

}
