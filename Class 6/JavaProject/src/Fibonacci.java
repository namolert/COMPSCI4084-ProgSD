import java.util.Scanner;

public class Fibonacci {
    public int computeFibonacci(int n) {
        int x = 0;
        int y = 1;
        int target = 0;
        for (int i = 0; i < n - 2; i++) {
            target = x + y;
            x = y;
            y = target;
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fibonacci Fibonacci = new Fibonacci();
        System.out.println(Fibonacci.computeFibonacci(n));
        scanner.close();
    }
}
