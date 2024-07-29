import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial of negative number doesn't exist");
        } else {
            long fact = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is " + fact);
        }

        sc.close();
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
