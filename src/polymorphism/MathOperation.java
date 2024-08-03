package polymorphism;
class MathOperation {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        System.out.println(operation.add(2, 3)); // Output: 5
        System.out.println(operation.add(2, 3, 4)); // Output: 9
        System.out.println(operation.add(2.5, 3.5)); // Output: 6.0
    }
}
