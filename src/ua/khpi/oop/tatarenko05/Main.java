package ua.khpi.oop.tatarenko05;
import java.util.Iterator;

public class Main {

	public static void main(String[] args)
	{
		Container cont = new Container("hello","how","are you");
		Iterator<String> iter = cont.iterator();

		System.out.println("Loop while:");
		 while(iter.hasNext())
			 {
	            System.out.println(iter.next());
			 }
		 
		 iter = cont.iterator();
		 System.out.println("Loop for each:");
		 for(int i = 0; iter.hasNext(); i++)
		 {
			 System.out.println(i + ". " + iter.next());
		 }
		 
		System.out.println("Size of a conteiner: " + cont.size());
		System.out.println("Data to string: " + cont.toString());
		
		System.out.println("Add new string 'end'");
		cont.add("end");
		System.out.println("Data to string: " + cont.toString());
		
		System.out.println("Remove string 'how'");
		cont.remove("how");
		System.out.println("Data to string: " + cont.toString());
		
		System.out.println("Does cont contains 'how': " + cont.contains("how"));
		System.out.println("Are all el in second cont: " + cont.containsAll(new Container("hello","how","are you","end")));
		cont.clear();
	}

}