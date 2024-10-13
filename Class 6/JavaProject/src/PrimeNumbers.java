import java.util.Scanner;

public class PrimeNumbers {
    public void printPrimes(int max) {
        for (int i = 2; i < max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimes(max);
        scanner.close();
    }
}
