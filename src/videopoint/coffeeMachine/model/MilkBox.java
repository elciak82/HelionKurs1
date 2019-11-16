package videopoint.coffeeMachine.model;

class MilkBox extends Box {

    private static final int MAX_MILK = 15; // jakas stała

    @Override
    void fillIt() {
        numberOfProduct = MAX_MILK;
    }
}
