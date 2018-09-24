import java.util.Scanner;
class java
{
public static void main(String[] args)
{
  int a;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number:");
  a=s.nextInt();
  if(a>0)
    {
    System.out.println("The Number is positive:"+a);
    }
  else if(a<0)
    {
    System.out.println("The Number is negative:"+a);
    }
  else
    {
    System.out.println("The Number is equal to zero:"+a);
    }
  }
}
