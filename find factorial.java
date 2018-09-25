public class FindFactorial {

 public static void main(String[] args) {

  int number = 4;
  int factorial = number;

  for (int i = (number - 1); i & gt; 1; i--) {
   factorial = factorial * i;
  }

  System.out.println("Factorial of " + number + " is " + factorial);
 }
}
