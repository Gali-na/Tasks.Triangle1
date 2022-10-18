package org.example;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSideA(6);
        triangle.setSideB(7);
        triangle.setSideC(8);
        System.out.println(triangle.getSquare());
        Triangle triangle1 = new Triangle();
        triangle1.setSideA(1);
        triangle1.setSideC(0);
        System.out.println(+triangle1.getSideC());
        triangle1.setSideB(2);
        System.out.println(triangle1.getSquare());
        Triangle triangle2 = new Triangle();
        System.out.println(triangle2.getSideA());
    }
}
