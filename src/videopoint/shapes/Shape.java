package videopoint.shapes;

//final - słówko blokujące np klasę (nie można po niej dziedziczyć
//, lub np metodę - nie można jej modyfikować
class Shape {

    Shape(){
        System.out.println("Konstruktor Shape");
    }

    int countPerimeter(){
        return 0;
    }

    int countArea(){
        return 0;
    }

    public String getname() {
        return getClass().getSimpleName(); //wspólny kod
    }
}
