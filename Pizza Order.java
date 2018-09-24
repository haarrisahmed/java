import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) 
	{
		int ch;
      	System.out.println("Enter 0 for Sunday");
      	System.out.println("Enter 1 for Monday"); 	
      	System.out.println("Enter 2 for Tuesday");
      	System.out.println("Enter 3 for Wednesday");
      	System.out.println("Enter 4 for Thursday");
      	System.out.println("Enter 5 for Friday");
      	System.out.println("Enter 6 for Saturday");
      	Scanner s = new Scanner(System.in);
      	ch=s.nextInt();
      switch(ch)
      {
         case 0 :
            System.out.println("Free Personal Pizza on purchase of medium Pizza"); 
            break;
         case 1 :
           System.out.println("Rs.101 OFF on a bill of Rs.400 and above");
      	break;
         case 2 :
            System.out.println("Free Plain Garlic Bread on another medium pizza");
            break;
         case 3 :
            System.out.println("Buy 1 Get 1 Free on any medium pizza");
      	break;
         case 4 :
            System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
      	break;
	 case 5 :
            System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
      	break;
         case 6 :
            System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
            break;
         default :
            System.out.println("Invalid choice");
      }
   }
}
