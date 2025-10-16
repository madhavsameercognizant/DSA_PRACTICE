public class Basic {
    public static void main(String[] args) {
        // Primitive Data Types

        // byte: 8-bit integer (-128 to 127)
        byte b = 100;

        // short: 16-bit integer (-32,768 to 32,767)
        short s = 20000;

        // int: 32-bit integer (-2,147,483,648 to 2,147,483,647)
        int i = 500000;

        // long: 64-bit integer (very large range)
        long l = 10000000000L; // 'L' suffix for long

        // float: 32-bit floating point (up to 7 decimal digits)
        float f = 3.14f; // 'f' suffix for float

        // double: 64-bit floating point (up to 16 decimal digits)
        double d = 3.14159265359;

        // char: 16-bit Unicode character
        char c = 'A';

        // boolean: true or false
        boolean flag = true;

        // Non-Primitive Data Types

        // String: sequence of characters
        String name = "Sameer";

        // Array: collection of similar data types
        int[] numbers = {1, 2, 3, 4, 5};

        // Printing all values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
        System.out.println("String: " + name);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}