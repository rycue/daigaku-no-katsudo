public class test {
    // Helper method
    public static int printAndReturn(String message) {
        System.out.println(message);
        return 0;
    }

    public static void main(String[] args) {
        // In your main code:
        int x = 0;
        int y = (x > 5) ? printAndReturn("X is large") : printAndReturn("X is small");
        // The output will be: X is large
        // And the value of y will be: 1
    }
}