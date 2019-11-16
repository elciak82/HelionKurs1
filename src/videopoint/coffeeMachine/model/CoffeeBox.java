package videopoint.coffeeMachine.model;

class CoffeeBox extends Box {

    private static final int MAX_COFFEE = 30; // jakas stała

    @Override
    void fillIt() {
        numberOfProduct = MAX_COFFEE;
    }
}
