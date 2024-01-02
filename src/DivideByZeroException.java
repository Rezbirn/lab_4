public class DivideByZeroException extends ArithmeticException{
    public DivideByZeroException(String text) {
        super(text);
    }
    public DivideByZeroException() {
        super();
    }
}
