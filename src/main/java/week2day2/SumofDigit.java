package week2day2;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to calculate sum of digits");
		int number = sc.nextInt();
		
		// Remember number/10 reduces one digit from number 
		// and number%10 gives you last digit int sum = 0;
		int input = number; 
		int sum = 0;
		while (input != 0)
		{ 
			int lastdigit = input % 10;
			sum =sum+ lastdigit;
			input =input/ 10;
		} 
		System.out.printf("Sum of digits of number %d is %d", number, sum);
		// closing Scanner to prevent resource leak 
		sc.close(); 

	

	}

}
