package videopoint;

public final class Rectangle extends Shape { //klasa zamknięta bo final
    int height;
    int width;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Rectangle setWidth(int width) {
        this.width = width;
        return this;
    }

    @Override
    int countPerimeter() {
        return width * height;
    }
}
