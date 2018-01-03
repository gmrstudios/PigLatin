package edu.wmich.cs1120.spring16.SMSPL.towerc.LA5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller implements IController {
	
	private ISms sms;
	private IPigLatin pigLatin;
	private String input;
	private String output;
	
	/**
	 * CONSTRUCTOR
	 * @param s - ISms object from input
	 * @param pL - IPigLatin object from input
	 */
	public Controller(ISms s, IPigLatin pL){
		sms = s;
		pigLatin = pL;
		
	}
	
	/**
	 *@param - mySms object of type ISms object setter 
	 */
	@Override
	public void setSmsObject(ISms mySms) {
	
		sms = mySms;

	}

	@Override
	/**
	 * @param - myPigLatin object of type IPigLatin object setter 
	 */
	public void setPigLatinObject(IPigLatin myPigLatin) {
		
		pigLatin = myPigLatin;
	
	}

	@Override
	/**
	 * void method - no return value or parameters
	 * runs program - handles menu and user input
	 * error handling for user input handled here, also
	 */
	public void runProgram() {
		
		int choice = -1; // set initial value of choice to an illegal value to initialize
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); // for menu input
		
		// ****************** MENU ***********************
		while(choice != 0){
		System.out.println("Program Menu");
		System.out.println("What would you like to do?");
		System.out.println("Choose from the following menu");
		System.out.println("1 - Text to SMS conversion");
		System.out.println("2 - SMS to Text conversion");
		System.out.println("3 - Text to PigLatin conversion");
		System.out.println("0 - Quit");
		System.out.print("Please choose an option: ");
		
		// TRY-CATCH block to test use input for number - throws exception if not a number
		try{
			choice=Integer.parseInt(scanner.nextLine());
			}// END BRACKET FOR choice TRY
			catch(NumberFormatException e){ 
					System.out.println("Please enter only a number.");
					choice = -1;
				}// END BRACKET for CHOICE catch
		
		// TRY CATCH block for user input for text to convert
		// menu choice exceptions are handled by default
		try{		
				switch(choice)
				{
				case 0: // EXIT CASE
					exit(); // program writes to file and exits
					break; // I know I don't really need this statement as program exited. 
				case 1:	//  Text to SMS conversion Case
					System.out.println("Input text to be converted to SMS:");
					input = scanner.nextLine().toLowerCase();
					if("".equals(input)) // THROW empty string exception if needed
						throw new EmptyStringException();
					convertTextToSMS();
						
						break;
				case 2:  // SMS to Text conversion Case
					System.out.println("Input SMS to be converted to text:");
					
					input = scanner.nextLine().toLowerCase();
					if("".equals(input)) // THROW empty string exception if needed
						throw new EmptyStringException();
					convertSMSToText();
					
						break;
				case 3:  // Text to PigLatin conversion Case
					System.out.println("Input text to be converted to Pig Latin:");
					
					input = scanner.nextLine().toLowerCase();
					if("".equals(input)) // THROW empty string exception if needed
						throw new EmptyStringException();
					
					convertTextToPigLatin();
					
						break;
				default:
					System.out.println("Valid menu choices are only 1, 2, 3, and 0.");
					System.out.println("Please re-enter your choice.");
					break;
				
				} // END BRACKET for switch case
		} // END BRACKET for input try // I do not need all these exceptions, actually.
		catch(EmptyStringException | IllegalArgumentException | InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}
				
		} // END BRACKET for WHILE loop for menu
		if(choice == 0) // This is redundant I know.
			exit();
	} //END BRACKET for RunProgram
		
	
	@Override
	/**
	 * void method
	 * grabs input field and calls method on the object with appropriate class
	 */
	public void convertTextToSMS() {
		sms.setInput(input);
		output = sms.textToSMS();
		System.out.println(output);

	}

	@Override
	/**
	 * void method
	 * grabs input field and calls method on the object with appropriate class
	 */
	public void convertSMSToText() {
		sms.setInput(input);
		output = sms.smsToText();
		System.out.println(output);

	}

	@Override
	/**
	 * void method
	 * grabs input field and calls method on the object with appropriate class
	 */
	public void convertTextToPigLatin() {
		pigLatin.setInput(input);
		output = pigLatin.textToPigLatin();
		System.out.println(output);
		
	}
	/**
	 * void method
	 * I added this, which I hope is all right.
	 * I like to exit from a method.
	 */
	public void exit(){
		
		 System.out.println("System exited.");
         System.exit(0); 
	} // END BRACKET for EXIT class
	
} // END BRACKET of public class for CONTROLLER
