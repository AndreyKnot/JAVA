package ua.khpi.oop.tatarenko08;

public class List {
	private int Size = 0;
	Book[] array = new Book[Size];
	
	public int GetSize() {
		return Size;
	}
	
	public void SetSize(int Size) {
		this.Size = Size;
	}

	public void AddObject(Book book)
	{
		Book[] newArray = new Book[Size+1];
		for (int i = 0; i < Size; i++) {
			newArray[i] = array[i];
		}
		
		newArray[Size] = book;
		Size++;
		array = newArray;
	}
	
	public void DeleteObject(int position)
	{
		if(Size != 0)
		{
			Book[] newArray = new Book[Size-1];
			for (int i = 0; i < position-1; i++) {
				newArray[i] = array[i];
			}
			for (int i = position-1, j = position; j < Size; i++, j++) {
				newArray[i] = array[j];
			}
			
			Size--;
			array = newArray;
		}
		else
		{
			System.out.println("Array is empty!");
		}
	}
}
