public class Calculation {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int add = sum(a, b);

        System.out.println("Sum is : " + add);
        System.out.println("Multiplication is : " + mul(add, b));
        System.out.println("Division is : " + divide(add, b));

    }
}