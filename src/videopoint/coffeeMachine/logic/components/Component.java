package videopoint.coffeeMachine.logic.components;

import videopoint.coffeeMachine.logic.view.UserInterface;
import videopoint.coffeeMachine.model.Storage;
import videopoint.coffeeMachine.model.exceptions.EmptyBoxException;

abstract class Component {
    Storage storage;
    UserInterface userInterface;

    public Component(Storage storage, UserInterface userInterface) {
        this.storage = storage;
        this.userInterface = userInterface;
    }
    public final boolean addComponent(){ //zawiera logike związana z pobraniem komponentu
        boolean status = false;
        try {
            tryAddComponent();
            status = true;
        }catch (EmptyBoxException ebe) {
            userInterface.showError("Brak porduktu " + ebe.getMessage());
        } finally {
            userInterface.playSound(); //wywolujemy userInterface - informujemy usera ze wykonalismy kolejny krok
        }
        return status;
    }

    abstract void tryAddComponent() throws EmptyBoxException;
}
