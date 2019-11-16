package videopoint.classes;

public class OuterClass {

    public interface Greeting {
        void sayHello();
    }
    public class InnerClass { //klasa wewnętrzna
    }

    public static class StaticInnerclass{ //klasa wewnętrzna

    }

    public void method(){
        class LocalClass { //klasa lokalna, tylko wew. metody. Można sie w nich odwolywać do pól klasy

        }
    }

    public InnerClass instattiate() {
        return new InnerClass(); //tworzymy gdy klasa zewnętrzna jest bardzo zależna od klasy wewnęrznej
    }

    public void secondMethod () {
        Greeting greeting = new Greeting() { //tworzenie klasy anonimowej z wykorzystaniem interfejsu
            @Override
            public void sayHello() {

            }
        };
    }
}
