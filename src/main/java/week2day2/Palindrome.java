package week2day2;

import java.util.Scanner;

public class Palindrome {


//		1. Get the input number and store it as int inputNumber
//		using Scanner nextInt()
//
//		inputNumber = inputNumber * -1;
//
//		2. Take a copy of inputNumber (originalNumber = inputNumber)
//
//		3. reverseNumber = 0
//
//		4. Reverse the number
//			while (inputNumber != 0)
//			{
//			quotient = inputNumber / 10;
//			reminder = inputNumber % 10;
//			reverseNumber =  reverseNumber * 10 + reminder;
//			inputNumber = quotient; 
//			}
//
//		5. if(originalNumber == reverseNumber) 
//		   {
//		    System.out.println("Original Number is a palindrome");    
//		   }
//		   else
//		   {
//		      print "Original Number is NOT a palindrome"; 
//		    }
	
	
	
	public static void main(String[] args) {
		
		
		int remainder;
		int quotient;
		int orgNum;
		int revNum=0;
		
		System.out.print("give the input:");
		
		
		Scanner scan=new Scanner(System.in);
		int inputNumber=scan.nextInt();
		
		
		if(inputNumber<0)
		{
		inputNumber=inputNumber* -1;
		}
		orgNum=inputNumber;
		while(inputNumber>0)
		{
			remainder=inputNumber%10;
			quotient=inputNumber/10;
			revNum=revNum*10+remainder;
			inputNumber=quotient;
		}
		if(orgNum==revNum)
		{
			System.out.println(orgNum +"is palindrome");
		}
		else
		{
		System.out.println(orgNum +"is not a palindrome");	
		}
		scan.close();
		}
		
	}


