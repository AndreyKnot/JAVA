package ua.khpi.oop.tatarenko03;

public class main {

	public static void main(String[] args)
	{
		helper text = new helper();
		StringBuilder wtext = new StringBuilder(text.Input());
		//StringBuilder ntext = new StringBuilder(text.Task(wtext));
		text.Output(wtext);
		//text.Output(ntext);
	}

}
