package week2day3;

public class Fibonacci {

	public static void main(String[] args) {
		int limit=11;
		int first=0;
		int second=1;
		System.out.print(first + "," + second);
		for (int i=1; i<limit; i++)
		{
		int next = first+second;
		System.out.print("," + next);
		first=second;
		second=next;
		}

			
		}
	}

