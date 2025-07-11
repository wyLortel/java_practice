package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 8;
        rectangle.width = 5;

        rectangle.calculateArea(rectangle.width, rectangle.height);

        rectangle.calculatePerimeter(rectangle.width, rectangle.height);

        rectangle.isSquare(rectangle.width, rectangle.height);

    }
}
