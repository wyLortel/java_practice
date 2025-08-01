package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public boolean equals(Object object) {
        Rectangle rec = (Rectangle) object;
        return this.width == rec.width && this.height == rec.height;
    }


}
