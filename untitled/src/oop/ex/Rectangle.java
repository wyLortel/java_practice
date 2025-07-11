package oop.ex;

public class Rectangle {
    int width;
    int height;


    int calculateArea(int width , int height) {
        int area = width * height;
        System.out.println("넓이: " + area);
        return area;

    }

    int calculatePerimeter(int width, int height) {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
        return perimeter;
    }

    boolean isSquare(int width, int height) {
        boolean square = width == height;
        System.out.println("정사각형 여부: " + square);
        return square;
    }

}
