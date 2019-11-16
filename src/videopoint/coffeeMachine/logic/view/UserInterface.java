package videopoint.coffeeMachine.logic.view;

public interface UserInterface {

    void showStep(String msg);//kolejne stepy realizacji kawy - te elementy ktore User zobaczy

    void showError(String msg);

    void showCoffeeReady(String msg);

    void playSound();
}
