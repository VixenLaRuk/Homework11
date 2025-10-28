public class ComplexNumber {

    private double real;
    private double imag;

    ComplexNumber() { // default constructor
        real = 0.0;
        imag = 0.0;
    }

    ComplexNumber(double real, double imag) { // overloaded constructor
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return String.format("%.1f + %.1fi", this.real, this.imag);
    }

    public ComplexNumber add(ComplexNumber other) {

        ComplexNumber newNumber = new ComplexNumber(this.real + other.real, this.imag + other.imag);
        return newNumber;
    }

    public ComplexNumber multiply(ComplexNumber other) {

        double real = (this.real * other.real) + (this.imag * other.imag * -1);
        double imag = this.real * other.imag + this.imag * other.real;
        ComplexNumber newNumber = new ComplexNumber(real, imag);
        return newNumber;
    }

}
