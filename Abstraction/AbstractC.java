package Abstraction;

public class AbstractC {

    static abstract class A{
        abstract void fun();
        public void fun2(){
            System.out.println("Class A");
        }
    }

    static class B extends A{
         void fun(){
            System.out.println("Class B");
        }
    }
    public static void main(String[] args) {
        // A a = new A(); // error cannot be initialized
        B b = new B();
        b.fun();
        b.fun2();
    }
}
