package ua.khpi.oop.tatarenko02;
import java.util.Random;

public class main {
  
	public static void main(String[] args)
	 {
		int num;
		Random rand = new Random(1000);
		
		System.out.printf("Number        |    10 |    01 |\n");
		
		for (int i = 0; i < 10; i++) 
		{
			num = rand.nextInt(1000);
			ShowBin(num);
			Binary(num);
		}
		
	 }
	
	public static void ShowBin(int num)
	{	
		System.out.print("-------------------------------\n");
		
		System.out.printf("%10s    |", Integer.toBinaryString(num));
	}
	
	public static void Binary(int num)
	{
		int res = 0, prev = 0, next = 0, num1 = num;
		
		while(num1 != 0)
		{
			prev = num1 % 2;
			num1 = num1 / 2;
			next = num1 % 2;
			if(prev == 0 && next == 1)
			{
				res++;
			}
		}
		
		System.out.printf("%6d |", res);
		
		res = 0;
		
		while(num != 0)
		{
			prev = num % 2;
			num = num / 2;
			next = num % 2;
			if(prev == 1 && next == 0)
			{
				res++;
			}
		}
		
		res--;
		
		System.out.printf("%6d |\n", res);
	}
	
}
