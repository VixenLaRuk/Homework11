 public class App {

    /**
     * The main method that creates ComplexNumber instances and preforms
     * arithmetic operations, printing the results as an output.
     * @param args Command-Line arguments (not used).
     * @throws Exception If an error occurs during execution.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ComplexNumber number1 = new ComplexNumber(1, 2);
        ComplexNumber number2 = new ComplexNumber(2, 3);
        System.out.println("First number: " + number1);
        System.out.println("second number: " + number2);
        System.out.println("Sum: " + number1.add(number2));
        System.out.println("Multiplication: " + number1.multiply(number2));
        System.out.println("Subtraction: " + number1.subtract(number2));
        System.out.println("Division: " + number1.divide(number2));
    }
}
