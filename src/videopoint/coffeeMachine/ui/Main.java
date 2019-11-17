package videopoint.coffeeMachine.ui;

import videopoint.coffeeMachine.logic.CoffeeMachine;
import videopoint.coffeeMachine.logic.EspressoMaker;
import videopoint.coffeeMachine.logic.LatteMacchiatoMaker;
import videopoint.coffeeMachine.logic.view.UserInterface;

import java.util.Scanner;

public class Main {
    private static String latte = "L";
    private static String espresso = "E";
    private static Scanner scanner = new Scanner(System.in);
    private static CoffeeMachine coffeeMachine;


    public static void main(String[] args) { //main wyświetla info uzytkownikowi (print)
        System.out.println("Wybierz kawę: \n [E] - espresso\n [L] = Latte Macchiato");
        String coffeeType = getUserInput();
        if (coffeeType.equals(latte)) {
            coffeeMachine = new LatteMacchiatoMaker(new AdvanceUi());
            coffeeMachine.makeCoffee();
        }
        if (coffeeType.equals(espresso)) {
            coffeeMachine = new EspressoMaker(new AdvanceUi());
            coffeeMachine.makeCoffee();
        }
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
