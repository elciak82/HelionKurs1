package videopoint.coffeeMachine.logic.components;

import videopoint.coffeeMachine.logic.view.UserInterface;
import videopoint.coffeeMachine.model.Storage;
import videopoint.coffeeMachine.model.exceptions.EmptyBoxException;

public class MilkComponent extends Component { //dostarcza implementacje dla naszego rozwiazania
    public MilkComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        userInterface.showStep("Mleko");
        storage.getCoffee();
    }
}
