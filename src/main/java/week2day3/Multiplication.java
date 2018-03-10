package week2day3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int i,result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input:");
		int num=scan.nextInt();
		
		
		for(i=1;i<=10;i++)
		{
			result=i*num;
			System.out.println(i+ "*" +num+ "=" +result);
		}

	}

}
