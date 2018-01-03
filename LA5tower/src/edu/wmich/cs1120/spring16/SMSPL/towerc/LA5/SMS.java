package edu.wmich.cs1120.spring16.SMSPL.towerc.LA5;

public class SMS implements ISms {
	
	private String input;

	/**
	 *@param - myInput is the string of the input to be converted 
	 *This is just a setter method.
	 */
	@Override
	public void setInput(String myInput) {
		
		input = myInput;
	}

	@Override
	/**
	 * @return - returns the input String after replace methods do conversion
	 */
	public String textToSMS() {
		
		input = input.replace("what", "w@");
		input = input.replace("incredible", "NcreDbl");
		input = input.replace("best", "A1");
		input = input.replace("the", "d");
		input = input.replace("england", "UK");
		input = input.replace("world", "wrld");
		input = input.replace("and", "n");
		input = input.replace("stuff", "stuf");
		input = input.replace("that", "dat");
		input = input.replace("game", "gme");
		input = input.replace("has", "hs");
		input = input.replace("twisted", "twistD");
		input = input.replace("one", "1");
		input = input.replace("ten", "10");
		input = input.replace("another", "nothA");
		input = input.replace("again", "agn");
		input = input.replace("before", "B4");
		input = input.replace("up", "^");
		input = input.replace("even", "evn");
		input = input.replace("great", "gr8");
		input = input.replace("have", "av");
		input = input.replace("night", "nite");
		input = input.replace("good", "gud");
		
		return input;
	} // END BRACKET for textToSMS

	@Override
	/**
	 * @return - returns the input String after replace methods do conversion
	 */
	public String smsToText() {
		
		input = input.replace("w@", "what");
		input = input.replace("ncredbl", "incredible");
		input = input.replace("a1", "best");
		input = input.replace(" d ", " the ");
		input = input.replace("uk", "England");
		input = input.replace("wrld", "world");
		input = input.replace(" n ", " and ");
		input = input.replace("stuf ", "stuff");
		input = input.replace(" dat ", " that ");
		input = input.replace("gme", "game");
		input = input.replace(" hs ", " has ");
		input = input.replace("twistd", "twisted");
		input = input.replace("1", "one");
		input = input.replace("notha", "another");
		input = input.replace("agn", "again");
		input = input.replace("b4", "before");
		input = input.replace("^", "up");
		input = input.replace("evn", "even");
		input = input.replace("gr8", "great");
		input = input.replace("av", "have");
		input = input.replace("nite", "night");
		input = input.replace("have", "av");
		input = input.replace("gud", "good");

		
		return input;
	} // END BRACKET for smsToText

} // END BRACKET of public class for SMS class
