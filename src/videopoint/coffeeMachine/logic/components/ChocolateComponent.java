package videopoint.coffeeMachine.logic.components;

import videopoint.coffeeMachine.logic.view.UserInterface;
import videopoint.coffeeMachine.model.Storage;
import videopoint.coffeeMachine.model.exceptions.EmptyBoxException;

public class ChocolateComponent extends Component { //dostarcza implementacje dla naszego rozwiazania
//    public ChocolateComponent(String storage, UserInterface userInterface) {
//        super(storage, userInterface);
//    }

    public ChocolateComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        userInterface.showStep("Czekolada");
//        Storage storage = new Storage();
        storage.getCoffee(); //kurde dlaczego u mnie nie działa?
    }
}
