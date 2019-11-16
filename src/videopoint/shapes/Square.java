package videopoint.shapes;

public final class Square extends Shape { //mozna dziedziczyć tylko po 1 klasie
    private int size;

    Square(int size) {
        this.size = size;
    }

    public Square(){ //konstruktor domyślny
        super();
        //gdy bedziemy wywoływac konstruktos Square, wywoła sie konstruktor (lub inne metody) Shape (bazowej)
        System.out.println("Konstruktor Square");
    }

    int getSize() {
        return size;
    }

    Square setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    int countPerimeter() {
        return 4* size;
    }

    @Override
    public int countArea() {
        return size * size;
    }
}
