package lesson12.prob2;

public class AccountException extends RuntimeException{
    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}
