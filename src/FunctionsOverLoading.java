import java.lang.Math;
public class FunctionsOverLoading {
    public static void main(String[] args) {
        int radius = 7;
        int length = 10, width = 12;
        int a = 8, b = 9, c = 3;
        System.out.println("the area of circle is :  " + area(radius));
        System.out.println("the area of rectangular is : " + area(length, width));
        System.out.println("the area of triangle is : " + area(a, b, c));
    }
    static float area(int r) {
        return 22/7 * r * r;
    }
    static float area(int length, int width) {
        return length * width;
    }
    static float area(int a, int b, int c) {
        float s = (float)(a+b+c)/2.0f;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}




