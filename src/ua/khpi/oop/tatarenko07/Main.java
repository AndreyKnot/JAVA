package ua.khpi.oop.tatarenko07;

public class Main {

	public static void main(String... str)
	{
		String[] Authors1 = {"�������� �.�."};
		String[] Genre1 = {"�����������"};
		
		String[] Authors2 = {"���������� �."};
		String[] Genre2 = {"�����", "��������� �������"};
		

		Book book1 = new Book(9785811425396L, "������������ ������ ������", Authors1, "������� ������", Genre1, 2018);
		Book book2 = new Book(5792100810L, "������� ��������� �������", Authors2, "superNOWA", Genre2, 1993);
		
		List array = new List();
		array.array[0] = book1;
		array.array[1] = book2;
		
		for (Book Book : array.array) {
			Book.Output();
			System.out.println();
		}
    }
}