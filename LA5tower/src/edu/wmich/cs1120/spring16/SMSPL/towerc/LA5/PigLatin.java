package edu.wmich.cs1120.spring16.SMSPL.towerc.LA5;

public class PigLatin implements IPigLatin {
	
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
	 * @return - returns the String built with String Builder
	 * after performing operation to convert text to Pig Latin
	 */
	public String textToPigLatin() {
		
		String[] str = input.split(" "); // Tokenize string and stash in array
		StringBuilder s  = new StringBuilder(); // create a string builder
		
		for(int i = 0; i < str.length; i++){ // iterate through string which is words in message
	      char aChar = str[i].charAt( 0 );        // get first character of word
	      s.append(str[i].substring(1) + aChar + "ay "); // append first character with 
	      												//ay at end to complete Pig Latin conversion
	          
		} // END BRACKET FOR string builder loop
		
		return s.toString(); // have to call to string on a string builder object to get a string
	} // END BRACKET for textToPigLatin

} // END BRACKET of public class PigLatin
