package com.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * create method firstName() that throws Exception
	 * 
	 * @throws InputInvalidException
	 */
	public void firstName() throws InputInvalidException {
		String firstName = "Almas";
		Assert.assertTrue(exceptionUserRegistration.testFirstName(firstName));
	}

	@Test
	/**
	 * create method lastName() that throws Exception
	 * 
	 * @throws InputInvalidException
	 */
	public void lastName() throws InputInvalidException {
		String lastName = "Advani";
		Assert.assertTrue(exceptionUserRegistration.testLastName(lastName));
	}

	@Test
	/**
	 * create method emailId() that throws Exception
	 * 
	 * @throws InputInvalidException
	 */
	public void emailId() throws InputInvalidException {
		String emailId = "Almas.Advani2022@gmail.com";
		Assert.assertTrue(exceptionUserRegistration.testEmailId(emailId));
	}

	@Test
	/**
	 * create method mobileNumber() that throws Exception
	 * 
	 * @throws InputInvalidException
	 */
	public void mobileNumber() throws InputInvalidException {
		String mobileNumber = "91 9075528330";
		Assert.assertTrue(exceptionUserRegistration.testMobileNumber(mobileNumber));
	}

	@Test
	/**
	 * create method password() that throws Exception
	 * 
	 * @throws InputInvalidException
	 */
	public void password() throws InputInvalidException {
		String password = "Almas@7862";
		Assert.assertTrue(exceptionUserRegistration.testPassword(password));
	}

}
