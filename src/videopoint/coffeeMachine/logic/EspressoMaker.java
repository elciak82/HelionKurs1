package videopoint.coffeeMachine.logic;

import videopoint.coffeeMachine.logic.view.UserInterface;

public class EspressoMaker extends Maker{
    public EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee () {
        super.makeCoffee(); //super - inicjalizacja wszystkich pol
        boolean status = coffeeComponent.addComponent();
        if(status) {
            userInterface.showCoffeeReady("Espresso gotowe");
        }
    }
}
