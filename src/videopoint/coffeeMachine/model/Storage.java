package videopoint.coffeeMachine.model;

import videopoint.coffeeMachine.model.exceptions.EmptyBoxException;

public class Storage { //api
    CoffeeBox coffeeBox;
    MilkBox milkBox;
    ChocolateBox chocolateBox;

    private Storage() { //inicjalizacja w konstruktorze
        coffeeBox = new CoffeeBox();
        milkBox = new MilkBox();
        chocolateBox = new ChocolateBox();
        fillAll();
    }

    public void fillAll() {
        milkBox.fillIt();
        coffeeBox.fillIt();
        chocolateBox.fillIt();
    }

    public void getCoffee() throws EmptyBoxException {
        if (!coffeeBox.takeProduct()) {
            throw new EmptyBoxException("kawa");//wyrzucamy wlasny wyjatek, nalezy zdefiniowac taka klase
        }
    }

    public void getMilk() throws EmptyBoxException {
        if (!milkBox.takeProduct()) {
            throw new EmptyBoxException("mleko");//wyrzucamy wlasny wyjatek, nalezy zdefiniowac taka klase
        }
    }

    public void getChocolate() throws EmptyBoxException {
        if (!chocolateBox.takeProduct()) {
            throw new EmptyBoxException("czekolada");//wyrzucamy wlasny wyjatek, nalezy zdefiniowac taka klase
        }
    }
}
