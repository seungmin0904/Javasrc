package oop;

public class TriangleEx1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.baseLine = 7;
        triangle.height = 7;

        System.out.println("면적은: " + triangle.getArea());

        triangle = new Triangle(20, 10);
        System.out.println("면적은: " + triangle.getArea());

    }
}
