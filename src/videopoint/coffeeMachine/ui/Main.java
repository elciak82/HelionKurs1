package videopoint.coffeeMachine.ui;

import videopoint.coffeeMachine.logic.CoffeeMachine;
import videopoint.coffeeMachine.logic.LatteMacchiatoMaker;
import videopoint.coffeeMachine.logic.view.UserInterface;

public class Main {
    public static void main(String[] args) { //main wyświetla info uzytkownikowi (print)
        System.out.println("Wybierz kawę: \n [E] - espresso\n [L] = Latte Macchiato");
        CoffeeMachine coffeeMachine;
        coffeeMachine = new LatteMacchiatoMaker(new AdvanceUi());
        coffeeMachine.makeCoffee();
    }

    private static class AdvanceUi implements UserInterface {

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

}
