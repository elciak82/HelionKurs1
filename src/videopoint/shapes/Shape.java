package videopoint.shapes;

//final - słówko blokujące np klasę (nie można po niej dziedziczyć
//, lub np metodę - nie można jej modyfikować

//wspólne implementacje
// metody które klasy implementujące mają zawierach
//konstruktor, który jest wykorzystywany przez obiekty - inicjalizuje wszystkie zalezności
//daje mozliwość separacji kodu
public abstract class Shape {

//    Shape(){
//        System.out.println("Konstruktor Shape");
//    }

    abstract int countPerimeter(); //klasy abstrakcyjne nie mają ciała - tego co metoda ma robić
    // to jak metody mają działaćspoczywa na implementacji klas dziedziczących

    abstract int countArea();

    public String getname() {
        return getClass().getSimpleName(); //wspólny kod
    }
}
