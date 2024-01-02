import java.io.Console;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------");

        try {
            task1_1();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------");

        try {
            task1_2(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------");

        try {
            System.out.println(task1_3(2,0));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(task1_3(2,1));
        }

        System.out.println("---------------");

        try {
            System.out.println(task4(2,0));
        }
        catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

    }
    private static void task1_1() throws IOException {
        throw new IOException("disk full");
    }
    private static void task1_2(Object obj){
        if(obj == null){
            throw new IllegalArgumentException("obj is null");
        }
        System.out.println(obj.toString());
    }
    private static int task1_3(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("divide by zero");
        }
        return num1 / num2;
    }
    private static int task4(int num1, int num2){
        if(num2 == 0){
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }
}