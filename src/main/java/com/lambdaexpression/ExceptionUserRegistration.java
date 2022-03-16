package com.lambdaexpression;

/**
 * UC1-As a User need to enter a valid First Name
 * - First name starts with Cap and has minimum 3 characters
 * @author user-Almas
 *
 */

/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionUserRegistration {
	// validating first name
	/**
	 * created method firstName and passing parameter in this it will check
	 * FirstName is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param str -passing string of first name
	 * @return -return to method created
	 */
	public boolean firstName(String str) {
		/**
		 * The Matcher and Pattern classes provide the facility of Java regular
		 * expression Pattern object represents a compile version of regular expression
		 * we can create a pattern object by using compile() version of pattern class
		 */
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");

		/**
		 * we can use matcher object to match the given pattern in the target string we
		 * can create matcher object by using matcher() of pattern class
		 */
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
