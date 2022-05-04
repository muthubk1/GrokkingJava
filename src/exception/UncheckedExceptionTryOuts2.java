package exception;

public class UncheckedExceptionTryOuts2 {

    private static void method1(){ // UnChecked exception are by default propagated.

        int a = 10/0;
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {

            System.out.println("Exception Handled");
        }
    }
}
