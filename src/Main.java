public class Main {
public static void main(String[] args) {
   Calculator calc = new Calculator();

   int sum = calc.add(5, 3);
   int difference = calc.subtract(5, 3);
   int multiply = calc.multiply(5, 3);
   int divide = calc.divide(5, 0);
   int divide2 = calc.divide(6, 3);

   System.out.println("Multiply: " + multiply);
   System.out.println("Divide (by zero): " + divide);
   System.out.println("Divide2 (normal): " + divide2);
   System.out.println("Sum: " + sum);
   System.out.println("Difference: " + difference);

        }
    }
