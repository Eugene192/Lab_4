package exceptions;

// Checked исключение. Нужно для того чтобы обработать несуществующий метод.
public class Impossible_action extends NoSuchMethodException{
    private final String message;
    public Impossible_action(String message) {
        this.message = message;

    }

    public String get_message() {
        return this.message;
    }
}