package videopoint;

import videopoint.shapes.Rectangle;
import videopoint.shapes.Square;
import videopoint.shapes.Shape;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(4,6);
        Square mySquare = new Square();

        System.out.println(myRectangle.countPerimeter());
        System.out.println(mySquare.countArea());

        System.out.println("mySquare.getname() = " + mySquare.getname());
    }
}
