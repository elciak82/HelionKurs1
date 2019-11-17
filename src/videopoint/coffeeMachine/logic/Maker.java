package videopoint.coffeeMachine.logic;

import videopoint.coffeeMachine.logic.components.ChocolateComponent;
import videopoint.coffeeMachine.logic.components.CoffeeComponent;
import videopoint.coffeeMachine.logic.components.MilkComponent;
import videopoint.coffeeMachine.logic.view.UserInterface;
import videopoint.coffeeMachine.model.Storage;

abstract class Maker implements CoffeeMachine {
    UserInterface userInterface;
    CoffeeComponent coffeeComponent;
    MilkComponent milkComponent;
    ChocolateComponent chocolateComponent;
    private boolean sugar;

    Maker(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void makeCoffee() {
        Storage storage = Storage.getInstance(); //singleton - utworzymy w nim metodę statyczna getInstance, która utworzy nam storage
        coffeeComponent = new CoffeeComponent(storage, userInterface);
        milkComponent = new MilkComponent(storage, userInterface);
        chocolateComponent = new ChocolateComponent(storage, userInterface);

    }

    @Override
    public void addSugar() {
        sugar = true;
        userInterface.showStep("Dodano cukier");
    }

    @Override
    public void setUserInterface(UserInterface userInterface) {
        userInterface = userInterface;

    }
}
