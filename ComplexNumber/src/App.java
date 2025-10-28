 public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ComplexNumber number1 = new ComplexNumber(1, 2);
        ComplexNumber number2 = new ComplexNumber(2, 3);
        System.out.println("First number: " + number1);
        System.out.println("second number: " + number2);
        System.out.println("Sum: " + number1.add(number2));
        System.out.println("Multiplication: " + number1.multiply(number2));
    }
}
