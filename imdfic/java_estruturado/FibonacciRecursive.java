import java.util.Scanner;

public class FibonacciRecursive{
    public static void main(String args[]) {
        System.out.println("Digite um número inteiro: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(fib(scan.nextInt()));            
    }

    public static int fib(int n) {
        if(n <=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}