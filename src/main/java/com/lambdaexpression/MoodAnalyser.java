package com.lambdaexpression;

/**
 * Write Junit Test for Happy as well as Sad test case. - Happy Test Case
 * validates the Entry Successfully - Sad Test Cases fails the Entry
 *
 */
public class MoodAnalyser {
	public String analyseMood(String mood) {
		if (mood.toLowerCase().contains("happy")) {
			return "Entry Successful";
		} else if (mood.toLowerCase().contains("sad")) {
			return "Entry Failed";
		} else
			return null;
	}
}
