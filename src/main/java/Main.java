import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] parts = input.split(" ");

    Calculator calculator = new Calculator();

    switch (parts[0].toLowerCase()) {
      case "add":
        System.out.println(calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        break;
      case "subtract":
        System.out.println(calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        break;
      case "multiply":
        System.out.println(calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        break;
      case "divide":
        System.out.println(calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        break;
      case "fibonacci":
        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parts[1])));
        break;
      case "binary":
        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parts[1])));
        break;
      default:
        System.out.println("Invalid command!");
        break;
    }
  }
}
