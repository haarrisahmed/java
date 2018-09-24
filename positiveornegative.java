import java.util.Scanner;
class java
{
public static void main(String[] args)
{
  int x;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number:");
  x=s.nextInt();
  if(x>0)
    {
    System.out.println("The Number is positive:"+x);
    }
  else if(x<0)
    {
    System.out.println("The Number is negative:"+x);
    }
  else
    {
    System.out.println("The Number is equal to zero:"+x);
    }
  }
}
