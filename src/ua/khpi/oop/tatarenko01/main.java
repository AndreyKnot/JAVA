package ua.khpi.oop.tatarenko01;

public class main {

 public static void main(String[] args)
 {
   int num = 0xB6E4;
   long phone = 380958695517l;
   int lastT = 0b00010001;
   int lastF = 012615;
   int n = ((20-1)%26)+1;
   char c = (char)(n+65);
   
   CountEven(num);
   CountOdd(num);
   CountOnes(num);
   
   CountEven(phone);
   CountOdd(phone);
   CountOnes(phone);
   
   CountEven(lastT);
   CountOdd(lastT);
   CountOnes(lastT);
   
   CountEven(lastF);
   CountOdd(lastF);
   CountOnes(lastF);
   
   CountEven(n);
   CountOdd(n);
   CountOnes(n);
   
   CountEven(c);
   CountOdd(c);
   CountOnes(c);
 }
 
 public static void CountEven(long i)
 {
	 System.out.print("Figure: " + i);
	 
       long rest = 0;
       long acc = i;
       int count = 0;
       while (acc != 0) 
       {
           rest = acc % 10;
           acc = acc / 10;
           if (rest % 2 == 0)
               count++;
       }
       
       System.out.print(" - Paired: " + count);
   }
 
 public static void CountOdd(long i) 
 { 
       long rest = 0;
       long acc = i;
       int count = 0;
       while (acc != 0) 
       {
           rest = acc % 10;
           acc = acc / 10;
           if (rest % 2 != 0)
               count ++;
       }
       
       System.out.print(" - Unpaired: " + count);
   }
 
 public static void CountOnes(long number) 
 {       
	 System.out.print(" - ");
	 long count = 0;
	 long bin = 0;
	 
	 while(number != 0)
	 {
		bin = number % 2;
		number = number / 2;
		System.out.print(bin);
		if(bin == 1)
			count++;
	 }
	 
	 System.out.println(" BinOnes: " + count);
   }

}
