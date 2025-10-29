/**
 * This program contructs a complex number calculator and runs using the main
 * method in the App.java file.
 * @author Vixen La Ruk
 * @since 10/28/2025
 */
public class ComplexNumber {

    private double real; // The real part of the complex number
    private double imag; // The imaginary part of the complex number

    ComplexNumber() { // default constructor
        real = 0.0;
        imag = 0.0;
    }

    /**
     * Overloaded constructor that initializes the complex number with given
     * real and imaginary parts.
     * @param real The real part of the complex number.
     * @param imag The imaginary part of the complex number.
     */
    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    /**
     * Returns a string representation of the complex number in the format "a.b + c.di".
     * @return A string representing the complex number.
     */
    public String toString() {
        return String.format("%.1f + %.1fi", this.real, this.imag);
    }

    /**
     * Adds this complex number to another complex number.
     * @param other The other complex number to add.
     * @return A new ComplexNumber representing the sum.
     */
    public ComplexNumber add(ComplexNumber other) {

        ComplexNumber newNumber = new ComplexNumber(this.real + other.real, this.imag + other.imag);
        return newNumber;
    }

    /**
     * Subtracts another complex number from this complex number.
     * @param other The other complex number to subtract.
     * @return A ComplexNumber representing the difference.
     */
    public ComplexNumber subtract(ComplexNumber other) {
        ComplexNumber newNumber = new ComplexNumber(this.real - other.real, this.imag - other.imag);
        return newNumber;
    }

    /**
     * Multiplies this complex number by another complex number.
     * @param other The other complex number to multiply by.
     * @return A new ComplexNumber representing the product.
     */
    public ComplexNumber multiply(ComplexNumber other) {

        double real = (this.real * other.real) + (this.imag * other.imag * -1);
        double imag = this.real * other.imag + this.imag * other.real;
        ComplexNumber newNumber = new ComplexNumber(real, imag);
        return newNumber;
    }

    /**
     * Divides this complex number by another complex number.
     * @param other The other complex number to divide by.
     * @return A new ComplexNumber representing the quotient.
     */
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double real = (this.real * other.real + this.imag * other.imag) / denominator;
        double imag = (this.imag * other.real - this.real * other.imag) / denominator;
        ComplexNumber newNumber = new ComplexNumber(real, imag);
        return newNumber;
    }

}