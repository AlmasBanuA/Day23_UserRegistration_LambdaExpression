package com.lambdaexpression;

/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC1- As a User need to enter a valid First Name - First name starts with Cap
 * and has minimum 3 characters 
 * UC2- As a User need to enter a valid Last Name-Last name starts with Cap and
 * has minimum 3 characters 
 * UC3- As a User need to enter a valid email UC4- As a User need to follow 
 * pre-defined Mobile Format Country code follow by space and 10 digit number 
 * UC5- As a User need to follow pre-defined Password rules. Rule1– minimum 8 Characters
 * UC6- Rule2 – Should have at least 1 Upper Case
 * UC7- Rule3- Should have at least 1 numeric number in the password
 * UC8- Rule4- Should have at Exactly 1 Special Character in the password
 * UC9- Should clear all email samples provided separately
 * UC10- Junit Test for Happy as well as Sad test case.
 * UC11- JUnit Parameterised Test to validate multiple entry for the Email Address.
 * UC12- Refactor the Code to throw custom exceptions in case of Invalid User Details
 * @author user-Almas
 *
 */
public class ExceptionUserRegistration {

	/**
	 * created method firstName and passing parameter in this it will check
	 * FirstName is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param str -passing string of first name
	 * @return -return to method created
	 */
	public boolean firstName(String str) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * created method testFirstName that throws Exception
	 * 
	 * @param validFirstName -pass valid Name
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testFirstName(String firstName) throws InputInvalidException {
		try {
			if (!firstName(firstName)) {
				throw new InputInvalidException("Entered FirstName is Invalid\n"
						+ "First name starts with Capital Letter and has\n" + "minimum 3 characters");
			} else {
				System.out.println("Entered FirstName is Valid");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return firstName(firstName);
	}

	// validating last name
	/**
	 * created method lastName and passing parameter in this it will check FirstName
	 * is valid or not result will be in true or false because method is boolean
	 * type
	 * 
	 * @param str -passing string of last name
	 * @return -return to method created
	 */
	public boolean lastName(String str) {
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

	/**
	 * created method testLastName that throws Exception
	 * 
	 * @param lastName -enters lastName
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testLastName(String lastName) throws InputInvalidException {
		try {
			if (!lastName(lastName)) {
				throw new InputInvalidException("Entered LastName is Invalid\n"
						+ "Last name starts with Capital Letter and has\n" + "minimum 3 characters");
			} else {
				System.out.println("Entered LastName is Valid");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return lastName(lastName);
	}

	// validating email
	/**
	 * created method email and passing parameter in this it will check email is
	 * valid or not result will be in true or false because method is boolean type
	 * 
	 * @param str -passing email id
	 * @return -return to method created
	 */
	public boolean email(String str) {
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * created method testEmailId that throws Exception
	 * 
	 * @param emailId- enters emailId
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testEmailId(String emailId) throws InputInvalidException {
		try {
			if (!email(emailId)) {
				throw new InputInvalidException("Entered EmailId is Invalid");
			} else {
				System.out.println("Entered EmailId is Valid");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return email(emailId);
	}

	/**
	 * created method phoneNumber and passing parameter in this it will check phone
	 * Number is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param str -passing phone number
	 * @return -return to method created
	 */
	public boolean phoneNumber(String str) {
		Pattern pattern = Pattern.compile("91\\s[0-9]{10}");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * created method testMobileNumber that throws Exception
	 * 
	 * @param mobileNumber -enters mobilenumber
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testMobileNumber(String mobileNumber) throws InputInvalidException {
		try {
			if (!phoneNumber(mobileNumber)) {
				throw new InputInvalidException(
						"Entered MobileNumber is Invalid\n" + "Mobile Number Must Contain Country Code");
			} else {
				System.out.println("Entered MobileNumber is Valid\n");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return phoneNumber(mobileNumber);
	}

	/**
	 * created method PasswordRule1 and passing parameter in this it will check
	 * Password is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param password- passing password
	 * @return -return to method created
	 */
	public boolean password(String str) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])([a-zA-Z0-9@$!%*#?&]){8,}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * created method testPassword that throws Exceptio
	 * 
	 * @param password -enters a password
	 * @return -return to method created
	 * @throws InputInvalidException
	 */
	public boolean testPassword(String password) throws InputInvalidException {
		try {
			if (!password(password)) {
				throw new InputInvalidException("Entered Password is Invalid\n" + "Password Must Contain at least\n"
						+ "one Uppercase, one Numeric, one Special Char\n" + "and minimum 8 Characters ");
			} else {
				System.out.println("Entered Password is Valid");
			}
		} catch (InputInvalidException e) {
			System.out.println("Exception is Occurred" + e);
		}
		return password(password);
	}
}
