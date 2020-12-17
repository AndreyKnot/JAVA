package ua.khpi.oop.tatarenko06;
import ua.khpi.oop.tatarenko03.helper; 
import java.util.Scanner;
import kap.help;

public class Main {

	public static void main(String[] args)
	{
		Container cont = new Container("hello","how how","are you");
		Scanner in = new Scanner(System.in);
		int ch = 0;
		Serialization ser = new Serialization();
		
		while(ch != 11)
		{
		System.out.println("----------------------");
		System.out.println("1)  Serializate data;");
		System.out.println("2)  Deserializate data;");
		System.out.println("3)  Show container;");
		System.out.println("4)  Add new element;");
		System.out.println("5)  Remove element;");
		System.out.println("6)  Find element;");
		System.out.println("7)  Compare;");
		System.out.println("8)  Helpers task;");
		System.out.println("9)  My task;");
		System.out.println("10) Sort;");
		System.out.println("11) Exit;");
		System.out.print("----------------------\nYour choice: ");
		ch = in.nextInt();
		
			switch(ch) 
			{
			case 1:
				System.out.println("Serialization: " + ser.serialization(cont));
				break;
			case 2:
				cont = ser.deserialization();
				break;
			case 3:
				System.out.println("Data to string: " + cont.toString());
				break;
			case 4:
				System.out.println("Add new string 'end'");
				cont.add("end");
				break;
			case 5:
				System.out.println("Remove string 'how'");
				cont.remove("how");
				break;
			case 6:
				System.out.println("Does cont contains 'how': " + cont.contains("how"));
				break;
			case 7:
				System.out.println("Are all el in second cont: " + cont.containsAll(new Container("hello","how","are you","end")));
				break;
			case 8:
				help.task(cont.GetEl(1));
				break;
			case 9:
				StringBuilder ts = new StringBuilder(cont.GetEl(1));
				helper.Task(ts);
				break;
			case 10:
				cont.Sort();
				break;
			default:
				break;
			}
		}
		
		in.close();
		cont.clear();
		System.out.println("Bye!!!");
	}

}