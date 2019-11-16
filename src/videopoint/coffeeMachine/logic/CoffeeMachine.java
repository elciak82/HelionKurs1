package videopoint.coffeeMachine.logic;

import videopoint.coffeeMachine.logic.view.UserInterface; //logika, która user bedzie mogł realizowac

public interface CoffeeMachine { //zawiera listę metod dostępnych z poziomu UI - LOGIKA

    void makeCoffee();

    void addSugar();

    void setUserInterface(UserInterface userInterface); //stworzenie UI interface, którym bedziemy komunikowac sie z uzytkownikiem wyzej. Jego implementacje pozostawimy UI
}
