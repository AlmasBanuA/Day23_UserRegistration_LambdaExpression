package com.lambdaexpression;

/**
 * import Matcher and Pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSampleEmailIds {

	/**
	 * created method testForValidEmails and passing parameter in this it will check
	 * Password is valid or not having Minimum 8 Characters and first letters should
	 * be capital with one numeric number and have one Exactly Special Character in
	 * that result will be in true or false because method is boolean type
	 * 
	 * @param validEmails -passing Email id's
	 * @return -return to method created
	 */
	public boolean testForValidEmails(String validEmails) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$");
		Matcher matcher = pattern.matcher(validEmails);
		return matcher.matches();
	}

	/**
	 * created method testSampleEmailId that throws Exception
	 * 
	 * @param validEmails -pass valid emails
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testSampleEmailId(String validEmails) throws InputInvalidException {
		try {
			if (!testForValidEmails(validEmails)) {
				throw new InputInvalidException("Entered EmailId is Invalid");
			} else {
				System.out.println("Entered EmailId is Valid");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return testForValidEmails(validEmails);
	}
}
