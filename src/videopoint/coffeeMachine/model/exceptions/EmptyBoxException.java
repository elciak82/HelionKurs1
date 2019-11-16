package videopoint.coffeeMachine.model.exceptions;

public class EmptyBoxException extends Throwable {

    public EmptyBoxException(String nameOfProduct) {
        super("Brak porduktu: " + nameOfProduct); //bedziemy wiedziec i wymuszac info jakiego porduktu brakuje
    }
}
