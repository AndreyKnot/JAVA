package ua.khpi.oop.tatarenko03;
import java.util.Scanner;

public class helper {

	public String Input()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		input.close();
		return text;
	}
	
	static public void Output(StringBuilder text)
	{
		System.out.println(text);
	}
	
	public static void Task(StringBuilder text)
	{
		int len = text.length();
		int i = 1, c = 0;
		
		while(c < len)
		{
			text.insert(i, "  ");
			i = i + 3;
			c++;
		}
		
		StringBuilder numb = new StringBuilder(text);
		String rep;
		i = 0;
		c = 0;
		Output(text);
		while(c < len)
		{
			rep = Alphabet(numb.charAt(i));
			numb.replace(i, i + 3, rep);
			i = i + 3;
			c++;
		}
		
		Output(numb);
	}
	
	public static String Alphabet(char l)
	{
		switch(l)
		{
		case 'a': 
			return "1  ";
		case 'b': 
			return "2  ";
		case 'c': 
			return "3  ";
		case 'd': 
			return "4  ";
		case 'e': 
			return "5  ";
		case 'f': 
			return "6  ";
		case 'g': 
			return "7  ";
		case 'h': 
			return "8  ";
		case 'i': 
			return "9  ";
		case 'j': 
			return "10 ";
		case 'k': 
			return "11 ";
		case 'l': 
			return "12 ";
		case 'm': 
			return "13 ";
		case 'n': 
			return "14 ";
		case 'o': 
			return "15 ";
		case 'p': 
			return "16 ";
		case 'q': 
			return "17 ";
		case 'r': 
			return "18 ";
		case 's': 
			return "19 ";
		case 't': 
			return "20 ";
		case 'u': 
			return "21 ";
		case 'v': 
			return "22 ";
		case 'w': 
			return "23 ";
		case 'x': 
			return "24 ";
		case 'y': 
			return "25 ";
		case 'z': 
			return "26 ";
		}
		
		return "   ";
	}
	
}
