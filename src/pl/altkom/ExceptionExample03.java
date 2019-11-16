package pl.altkom;

import java.util.Random;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}


class A {
    Random r = new Random();

    public void a() throws MyException {
        if (r.nextBoolean()) {
            throw new MyException(":(");
        }
    }

    public void b() throws MyException {
        System.out.println("Jestem sobie metodą b");
        a();
        System.out.println("Udało mi się wykonać metodę a");
    }
}

public class ExceptionExample03 {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.b();
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("Jestem na końcu programu");
    }
}
