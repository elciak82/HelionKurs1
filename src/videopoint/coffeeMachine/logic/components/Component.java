package videopoint.coffeeMachine.logic.components;

import videopoint.coffeeMachine.logic.view.UserInterface;

abstract class Component {
    private String storage;
    private UserInterface userInterface;

    public Component(String storage, UserInterface userInterface) {
        this.storage = storage;
        this.userInterface = userInterface;
    }
}
