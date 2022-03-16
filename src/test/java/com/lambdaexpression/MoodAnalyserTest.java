package com.lambdaexpression;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	@Test
	/**
	 * create method givenMessage_WhenHappy_ReturnEntrySuccessful() when mood is
	 * happy it return successfull
	 */
	public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
		/**
		 * calling method analyseMood to see mood is happy or not
		 */
		String actualResult = moodAnalyser.analyseMood("User is Happy");
		Assert.assertEquals("Entry Successful", actualResult);
	}

	@Test
	/**
	 * create method givenMessage_WhenNotHappy_ReturnEntryFailed() when mood is not
	 * happy it return Entry failed
	 */
	public void givenMessage_WhenNotHappy_ReturnEntryFailed() {
		String actualResult = moodAnalyser.analyseMood("User is Sad");
		Assert.assertEquals("Entry Failed", actualResult);
	}

}
