package edu.wmich.cs1120.spring16.SMSPL.towerc.LA5;

public class SMSandPLConvert {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ISms sms = new SMS();
			IPigLatin pigLatin = new PigLatin();
			IController control = new Controller(sms, pigLatin);
			
			control.runProgram();
		} // END BRACKET FOR main
	
} // END BRACKET FOR public class SMSandPLConvert
