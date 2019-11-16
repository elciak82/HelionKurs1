package videopoint.coffeeMachine.logic.components;

import videopoint.coffeeMachine.logic.view.UserInterface;
import videopoint.coffeeMachine.model.Storage;
import videopoint.coffeeMachine.model.exceptions.EmptyBoxException;

public class CoffeeComponent extends Component { //dostarcza implementacje dla naszego rozwiazania
    public CoffeeComponent(String storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        userInterface.showStep("Kawa");
        Storage storage = new Storage();
        storage.getCoffee(); //kurde dlaczego u mnie nie działa?
    }
}
