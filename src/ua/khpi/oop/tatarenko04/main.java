package ua.khpi.oop.tatarenko04;
import java.util.Scanner; 

public class main {
	
	private static boolean debug = true;
	private static helper text = new helper();
	
	public static void main(String[] args)
	{
		for(String str: args)
		{
			if(str.equals("-h") || str.equals("-help"))
			{
				text.Info();
			}
			if(str.equals("-d") || str.equals("-debug"))
			{
				debug = true;
			}
		}
		
		menu();
	}
	
	public static void menu()
	{
		String c;
		StringBuilder wtext = new StringBuilder("nothing");
		StringBuilder wtextCopy = new StringBuilder("nothing");
		StringBuilder ntext = new StringBuilder("nothing");
		Scanner input = new Scanner(System.in);
		boolean exit = false;

		while(!exit)
		{
		System.out.println("||||||||||||||||||||||||||");
		System.out.println("1) Input text");
		System.out.println("2) Task");
		System.out.println("3) Show input text");
		System.out.println("4) Show result");
		System.out.println("5) Exit program");
		if(debug)
		{
			System.out.println("-----------------------------------------");
			System.out.println("StringBuilder wtext     = " + wtext);
			System.out.println("StringBuilder wtextCopy = " + wtextCopy);
			System.out.println("StringBuilder ntext 	= " + ntext);
			System.out.println("boolean exit            = " + exit);
			System.out.println("boolean debug           = " + debug);
			System.out.println("-----------------------------------------");
		}
		System.out.println("||||||||||||||||||||||||||");
		System.out.print("Select an action: ");
		c = input.next();

		switch(c)
		{
		case "1":
			wtext = new StringBuilder(text.Input(debug));
			wtextCopy = new StringBuilder(wtext);
			break;
		case "2":
			ntext = new StringBuilder(text.Task(wtext,debug));
			break;
		case "3":
			text.Output(wtextCopy);
			break;
		case "4":
			text.Output(wtext);
			text.Output(ntext);
			break;
		case "5":
			System.out.println("\n (-_-)/ Bye!!!");
			System.out.println(" /| |/");
			System.out.println("/ |_|");
			System.out.println(" _| |_");
			exit = true;
			break;
		default:
			System.out.println("Error!");
			break;
		}
		}
		
		input.close();
	}
	
}
