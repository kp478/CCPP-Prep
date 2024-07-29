import java.util.Scanner;

public class RecursiveFactorial {

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println("Factorial is not defined by negative numbers.");
        } else{
            long factorial = factorial(num);
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        sc.close();
    }
}