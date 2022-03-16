package com.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	/**
	 * testCases for validating firstName,lastName, emailId, phone Number and
	 * password
	 *
	 */
	@Test
	/**
	 * created method givenFirstName_IsProper_ReturnTrue() for true condition
	 */
	public void givenFirstName_IsProper_ReturnTrue() {
		/**
		 * calling firstName method to see firstname is valid and result will be in
		 * boolean type
		 */
		boolean actualResult = exceptionUserRegistration.firstName("Almas");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenFirstName_IsProper_ReturnFalse() for false condition
	 */
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.firstName("almas");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnTrue() for true condition
	 */
	public void givenLastName_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.lastName("Advani");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnFalse() for false condition
	 */
	public void givenLastName_IsProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.lastName("advani");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	/**
	 * created method givenEmailId_IsProper_ReturnTrue() for true condition
	 */
	public void givenEmailId_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.email("almas.advani2022@gmail.com");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenEmailId_IsNotProper_ReturnFalse() for false condition
	 */
	public void givenEmailId_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.email("almasadvani.gmail.com");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	/**
	 * created method givenMobileNumber_IsProper_ReturnTrue() for true condition
	 */
	public void givenMobileNumber_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.phoneNumber("91 9075528330");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenMobileNumber_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenMobileNumber_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.phoneNumber("91 907552833047");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule1_IsProper_ReturnTrue() for true condition
	 */
	public void givenPasswordRule1_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("abcdefghi");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule1_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenPasswordRule1_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("abcd");
		Assert.assertEquals(false, actualResult);
	}
}
