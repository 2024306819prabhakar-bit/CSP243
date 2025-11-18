package classCode;
class A {
    void showA() { System.out.println("Class A"); }
}

class B extends A {
    void showB() { System.out.println("Class B"); }
}

class C extends B {
    void showC() { System.out.println("Class C"); }
}

public class Code8  {
    public static void main(String[] args) {
        C c1 = new C();
        c1.showA();
        c1.showB();
        c1.showC();
    }
}




