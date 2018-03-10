package week2day3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the day:");
		String day=scan.next();

		switch(day.toUpperCase())
		{
		case "SUNDAY":
			System.out.println("1st day of the week");
			break;
		case "MONDAY":
			System.out.println("2nd day of the week");
			break;
		case "TUESDAY":
			System.out.println("3rd day of the week");
			break;
		case "WEDNESDAY":
			System.out.println("4th week of the day");
			break;
		case "THURSDAY":
			System.out.println("5th week of the day");
			break;
		case "FRIDAY":
			System.out.println("6th day of the week");
			break;
		case "SATURDAY":
			System.out.println("7th day of the week");
			break;
		default:
				System.out.println("Invalid day");
			
		}

	}
}