class AddThread extends Thread {    double a, b;
    AddThread(double a, double b) {        this.a = a;        this.b = b;    }
    public void run() {        System.out.println(a + " + " + b + " = " +(a + b));    }
}

class SubThread extends Thread {    double a, b;
    SubThread(double a, double b) {        this.a = a;        this.b = b;    }
    public void run() {        System.out.println(a + " - " + b + " = " +(a - b));      }
}

class MulThread extends Thread {    double a, b;
    MulThread(double a, double b) {        this.a = a;        this.b = b;    }
    public void run() {        System.out.println(a + " * " + b + " = " +(a * b));         }
}

class DivThread extends Thread {    double a, b;
    DivThread(double a, double b) {        this.a = a;        this.b = b;    }
    public void run() {        System.out.println(a + " / " + b + " = " +(a / b));      }
}

public class Q2 {
    public static void main(String[] args) {
        new AddThread(12, 5).start();
        new SubThread(12, 5).start();
        new MulThread(12, 5).start();
        new DivThread(12, 5).start();
    }
}