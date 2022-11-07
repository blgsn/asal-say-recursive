import java.util.Scanner;

public class Main
{
     static boolean Prime(int number, int i)
    {
        // if the number is 2, return true value(1),if the number smaller than 2, return false(0)
        if (number <= 2) 
           return (number == 2) ? true : false; 
       if (number % i == 0) 
           return false; 
       if (i * i > number)//
            return true;
        // Check for next divisor
        return Prime(number, i + 1);
    }

  // Driver program to test above function
  public static void main(String[] args)
  {  
	  Scanner input=new Scanner(System.in);
	  System.out.println("Sayı giriniz:");
	  int number=input.nextInt();
    if (Prime(number, 2))
      System.out.println(number + " Asal bir sayıdır");
   else
     System.out.println(number + " Asal bir sayı değildir");
   }
 }