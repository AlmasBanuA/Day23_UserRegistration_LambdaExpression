package com.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating firstName
 *
 */
public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * created method givenFirstName_IsProper_ReturnTrue() for true condition
	 */
	public void givenFirstName_IsProper_ReturnTrue() {
		/**
		 * calling firstName method to see firstname is valid or not
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
}
