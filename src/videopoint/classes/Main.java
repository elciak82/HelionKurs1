package videopoint.classes;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.StaticInnerclass staticInnerclass = new OuterClass.StaticInnerclass();//nie potrzebujemy instancji naszej klasy, wystarczy że odwiłamy sie do naszej klasy statycznej
    }
}
