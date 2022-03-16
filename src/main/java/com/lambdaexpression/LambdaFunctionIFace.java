package com.lambdaexpression;

/**
 * import class Matcher and pattern that present in java.util package
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Refactor the Code to use Lambda Function to validate User Entry - Use Lambda
 * Function to validate First Name, Last Name, Email, Mobile, and Password
 *
 */
@FunctionalInterface
interface LambdaFunctionIFace {
	boolean checkRegex(String data, String name);
}

class LambdaValidation {
	public static String firstName, lastName, emaIlId, mobileNo, password;
	public static String regexOfFirstName, regexOfLastName, regexOfEmailId, regexOfMobileNo, regexOfPassword;
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * main method created to manipulate LambdaFunction
	 * 
	 * @param args -no args returns default value
	 */
	public static void main(String[] args) {
		LambdaFunctionIFace validation = (regex, input) -> {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			return matcher.matches();
		};

		regexOfFirstName = "^[A-Z]{1}[a-z]{2,}$";
		System.out
				.println("Enter your FirstName\n" + "First Letter Will be UpperCase\n" + "should Minimum 3 Characters");
		firstName = scanner.next();
		if (validation.checkRegex(regexOfFirstName, firstName)) {
			System.out.println("Given FirstName is Valid");
		} else {
			System.out.println("Given FirstName is Invalid");
		}

		regexOfLastName = "^[A-Z]{1}[a-z]{2,}$";
		System.out
				.println("Enter your LastName\n" + "First Letter Will be UpperCase\n" + "should Minimum 3 Characters");
		lastName = scanner.next();
		if (validation.checkRegex(regexOfLastName, lastName)) {
			System.out.println("Given LastName is Valid");
		} else {
			System.out.println("Given LastName is Invalid");
		}

		regexOfEmailId = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
		System.out.println("Enter your EmailId");
		emaIlId = scanner.next();
		if (validation.checkRegex(regexOfEmailId, emaIlId)) {
			System.out.println("Given EmailId is Valid");
		} else {
			System.out.println("Given EmailId is Invalid");
		}

		regexOfMobileNo = "91\\s[0-9]{10}";
		System.out.println("Enter your MobileNo\n" + "With Country Code");
		mobileNo = scanner.next();
		if (validation.checkRegex(regexOfMobileNo, mobileNo)) {
			System.out.println("Given MobileNo is Valid");
		} else {
			System.out.println("Given MobileNo is Invalid");
		}

		regexOfPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$";
		System.out.println("Enter your Password\n" + "at least contain One Uppercase, one Numeric, One Special Char\n"
				+ "and minimum 8 field length");
		password = scanner.next();
		if (validation.checkRegex(regexOfPassword, password)) {
			System.out.println("Given Password is Valid");
		} else {
			System.out.println("Given Password is Invalid");
		}
	}
}
