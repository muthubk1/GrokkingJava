package exception;

public class ExceptionTryOuts1 {

    private static void method1(){

        method2();
    }

    private static void method2(){

        throw new ArithmeticException("Arithmetic Exception from method2");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Raja Maha Ganapathi Namaha");
            method1();
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception handled");
        }
    }
}
