package oop;

public class RectangleOopMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5;
        rectangle1.height = 8;

        int area = rectangle1.calculateArea();
        System.out.println("넓이:" + area);

        int perimeter = rectangle1.calculatePerimeter();
        System.out.println("둘레 길이:" + perimeter);

        boolean square = rectangle1.isSquare();
        System.out.println("정삼각형 여부:" + square);

    }

}
