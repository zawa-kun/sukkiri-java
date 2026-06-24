package chapter05;

public class Practice03 {
    public static void main(String[] args) {
        System.out.println(calcTriangleArea(10,5));
        System.out.println(calcCircleArea(5));

    }

    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom*height/2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = radius*radius*3.14;
        return area;
    }
}
