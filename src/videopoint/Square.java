package videopoint;

public final class Square extends Shape{ //mozna dziedziczyć tylko po 1 klasie
    int size;

    public Square(int size) {
        this.size = size;
    }

    public Square(){ //konstruktor domyślny
        super();
        //gdy bedziemy wywoływac konstruktos Square, wywoła sie konstruktor (lub inne metody) Shape (bazowej)
        System.out.println("Konstruktor Square");
    }

    public int getSize() {
        return size;
    }

    public Square setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    int countArea() {
        return 4 * size;
    }
}
