//Write a Java program to display the default value of all primitive data types of Java
public class DefaultValues {
    static boolean boolValue;
    static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue;

    public static void main(String[] args) {
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("boolean: " + boolValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
    }
}