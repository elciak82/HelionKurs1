package videopoint.coffeeMachine.model;

class ChocolateBox extends Box {

    private static final int MAX_CHOCOLATE = 10; // jakas stała

    @Override
    void fillIt() {
        numberOfProduct = MAX_CHOCOLATE;
    }
}
