package exception;

import java.io.IOException;

public class CheckedExceptionTryOuts1 {

    private static void method1() throws IOException {

        method2();
    }

    private static void method2() throws IOException {

        throw new IOException("IOException Exception from method2");
    }

    public static void main(String[] args) {

        try {
            method1();
        } catch (IOException e) {
            System.out.println("Inside main IOException");
        }

    }
}
