import java.math.BigInteger;
import java.util.*;

public class FibonacciCalculator {

    private static BigInteger fib(long n) {
        return fib(BigInteger.valueOf(n));
    }

    private static BigInteger fib(BigInteger n) {
        if(memory.containsKey(n)) {
            return memory.get(n);
        }
        if (n.compareTo(BigInteger.valueOf(2)) < 1) { // Använd BigInteger.valueOf(2)
            return BigInteger.ONE;
        }
        BigInteger result = fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.valueOf(2))));
        memory.put(n, result);
        return result;
    }

    private static HashMap<BigInteger, BigInteger> memory = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ange vilket Fibonacci-tal du vill räkna ut (eller 0 för att avsluta): ");
                int input = scanner.nextInt();

                if (input == 0) {
                    break;
                }

                BigInteger result = fib((long) input);
                System.out.println("Fibonacci-tal nummer " + input + " är: " + result);
            }
        }
    }
}