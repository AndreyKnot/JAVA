package ua.khpi.oop.tatarenko04;
import java.util.Scanner;

public class helper {

	public String Input(boolean d)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = input.nextLine();
		if(d) 
		{
		System.out.println("-----------------------------");
		System.out.println("String text = " + text);
		System.out.println("-----------------------------"); 
		}
		return text;
	}
	
	public void Output(StringBuilder text)
	{
		System.out.println(text);
	}
	
	public StringBuilder Task(StringBuilder text, boolean d)
	{
		int len = text.length();
		int i = 1, c = 0;
		
		if(d) 
			{
			System.out.println("-----------------------------");
			System.out.println("int len = " + len);
			}
		
		while(c < len)
		{
			if(d)
			{
				System.out.println("c = " + c + "; i = " + i + "; text = " + text);
			}
			text.insert(i, "  ");
			i = i + 3;
			c++;
		}
		
		if(d) 
		{
		System.out.println("-----------------------------");
		}
		
		StringBuilder numb = new StringBuilder(text);
		String rep = "";
		i = 0;
		c = 0;
		
		while(c < len)
		{
			if(d)
			{
				System.out.println("c = " + c + "; i = " + i + "; numb = " + numb + "; rep = " + rep);
			}
			rep = Alphabet(numb.charAt(i));
			numb.replace(i, i + 3, rep);
			i = i + 3;
			c++;
		}
		
		if(d) 
		{
		System.out.println("-----------------------------");
		}
		
		return numb;
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
	
	public void Info()
	{
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("AUTHOR:\nTatarenko A.G., KIT-119a");
		System.out.println("\nTASK:\nEnter text. In the text, replace each letter with its number in the alphabet.");
		System.out.println("Print the result as follows: in one line print the text with two spaces between the letters,");
		System.out.println("in the next line under each letter print its number.");
		System.out.println("\nMENU:\n1) Input text            --- allows you to enter text");
		System.out.println("2) Task                  --- performs the task with your text, that you input in 1 action");
		System.out.println("3) Show input text       --- output your text, that you input in 1 action");
		System.out.println("4) Show result           --- shows the result of the task");
		System.out.println("5) Exit program          --- ends the program");
		System.out.println("-----------------------------------------------------------------------------");
	}
	
}
