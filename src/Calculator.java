class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int c, int d) {
        return c - d;}
    int multiply(int e, int f) {
        return e * f;
    }
    int divide(int g, int h) {
        try {
            if ( h==0) {
            return g / h;
        }
        }catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero is not allowed.");
        } return 0;
    }
}
