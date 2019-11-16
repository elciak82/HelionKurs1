package videopoint;

//final - słówko blokujące np klasę (nie można po niej dziedziczyć
//, lub np metodę - nie można jej modyfikować
public class Shape {

    Shape(){
        System.out.println("Konstruktor Shape");
    }

    int countPerimeter(){
        return 0;
    }

    int countArea(){
        return 0;
    }

    String getname() {
        return getClass().getSimpleName(); //wspólny kod
    }
}
