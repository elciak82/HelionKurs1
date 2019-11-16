package videopoint.shapes;

public interface IShape { //zewnętrzne api (kontrakt), które bedzie wykorzystywane przez nasze klasy na zewnątrz

    default int countArea() {
        return 0;
    }

    int countPerimeter();

}
