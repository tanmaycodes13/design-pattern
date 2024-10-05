// Java code snippet
public class StackMemoryExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Calling a method that involves stack memory
        int sum = addNumbers(a, b);

        System.out.println("Sum: " + sum);
    }

    // A method that uses stack memory
    public static int addNumbers(int x, int y) {
        // Local variables a and b are stored in stack memory
        int result = x + y;
        return result;
    }
}
