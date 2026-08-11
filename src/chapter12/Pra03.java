package chapter12;

final class A extends Y {
    public void a() { System.out.println("Aa"); }
    public void b() { System.out.println("Ab"); }
    public void c() { System.out.println("Ac"); }
}

class B extends Y {
    public void a() { System.out.println("Ba"); }
    public void b() { System.out.println("Bb"); }
    public void c() { System.out.println("Cc"); }
}

interface X { void a(); }

abstract class Y implements X {
    public abstract void a();
    public abstract void b();
}

public class Pra03 {
    public static void main(String[] args) {
        Y[] arr = new Y[2];
        arr[0] = new A();
        arr[1] = new B();

        for (Y e : arr) {
            e.b();
        }
    }
}