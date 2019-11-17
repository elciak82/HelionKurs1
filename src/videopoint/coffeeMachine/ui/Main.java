package videopoint.coffeeMachine.ui;

import videopoint.coffeeMachine.logic.CoffeeMachine;
import videopoint.coffeeMachine.logic.EspressoMaker;
import videopoint.coffeeMachine.logic.LatteMacchiatoMaker;
import videopoint.coffeeMachine.logic.view.UserInterface;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //main wyświetla info uzytkownikowi (print)
        String coffeeType;
        String exit = "X";
        do {
            System.out.println("Wybierz kawę: \n [E] - Espresso\n [L] = Latte Macchiato\n [X] - Exit");
            coffeeType = getUserInput();
            String latte = "L";
            CoffeeMachine coffeeMachine;
            if (coffeeType.equalsIgnoreCase(latte)) {
                coffeeMachine = new LatteMacchiatoMaker(new AdvanceUi());
                coffeeMachine.makeCoffee();
            }
            String espresso = "E";
            if (coffeeType.equalsIgnoreCase(espresso)) {
                coffeeMachine = new EspressoMaker(new AdvanceUi());
                coffeeMachine.makeCoffee();
            }
            if (coffeeType.equalsIgnoreCase(exit)) {
                System.out.println("Zapraszamy ponownie!");
            }
        } while (!coffeeType.equalsIgnoreCase(exit));
    }

    static class AdvanceUi implements UserInterface {

        @Override
        public void showStep(String msg) {
            System.out.println("-" + msg);
        }

        @Override
        public void showError(String msg) {
            System.out.println("##" + msg + "##");
        }

        @Override
        public void showCoffeeReady(String msg) {
            System.out.println("==" + msg + "==");
        }

        @Override
        public void playSound() {
            System.out.println("BIEP! BIEP!");
        }
    }

    private static String getUserInput() {
        return scanner.nextLine();
    }

}
