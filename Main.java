class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 1;

        int a = x + y;
        System.out.println("Result: " + a); // Expecting 15

        int b = z - y;
        System.out.println("Result: " + b); // Expecting -4

        int c = x * y;
        System.out.println("Result: " + c); // Expecting 50

        int d = x / y;
        System.out.println("Result: " + d); // Expecting 2

        int e = 10 % 3;
        System.out.println("Result: " + e); // Expecting 1 ... remainder of 1
        z++;
        System.out.println("Z: " + z); // Z is now 2

        z--;
        System.out.println("Z: " + z); // Z is now back to 1
    }
}