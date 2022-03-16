package com.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating lastName
 *
 */
public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnTrue() for true condition
	 */
	public void givenLastName_IsProper_ReturnTrue() {
		/**
		 * calling lastName method to see lastname is valid or not
		 */
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
}
