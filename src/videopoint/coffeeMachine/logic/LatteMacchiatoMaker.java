package videopoint.coffeeMachine.logic;

import videopoint.coffeeMachine.logic.view.UserInterface;

public class LatteMacchiatoMaker extends Maker{
    public LatteMacchiatoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee () {
        super.makeCoffee(); //super - inicjalizacja wszystkich pol
        boolean status = milkComponent.addComponent() && chocolateComponent.addComponent() && coffeeComponent.addComponent();

        if(status) {
            userInterface.showCoffeeReady("Latte Macchiato gotowe");
        }
    }
}
