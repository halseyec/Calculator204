import java.util.Random;

class Calculator {

    Calculator() {
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return a / b;
    }

    long fibonacciNumberFinder(int n) {
        if (n <= 1) {
            return n;
        }

        long previous = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long temp = current;
            current = current + previous;
            previous = temp;
        }

        return current;
    }

    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    String createUniqueID(String n) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder uniqueID = new StringBuilder(n);
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            uniqueID.append(characters.charAt(random.nextInt(characters.length())));
        }
        uniqueID.append(System.currentTimeMillis());
        return uniqueID.toString();
    }

}
