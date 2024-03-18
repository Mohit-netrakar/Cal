public class Cal {

    // Constructor name should match the class name
    public Cal() {
    }

    // Method to perform addition
    public float addition(float a, float b) {
        return a + b; // No need for parentheses
    }

    // Method to perform subtraction
    public float subtraction(float a, float b) {
        return a - b; // No need for parentheses
    }

    // Method to perform multiplication
    public float multiplication(float a, float b) {
        return a * b; // No need for parentheses
    }

    // Method to perform division
    public float division(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Float.NaN;
        }
    }
}
