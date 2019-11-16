package videopoint.shapes;

public final class Rectangle implements IShape { //klasa zamknięta bo final
    private int height;
    private int width;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    int getWidth() {
        return width;
    }

    Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    public int countPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public int countArea() {
        return width * height;
    }

//    @Override
//    public int countPerimeter() {
//        return width * height;
//    }
}
