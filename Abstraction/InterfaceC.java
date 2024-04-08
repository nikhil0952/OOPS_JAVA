package Abstraction;

public class InterfaceC {

    static  interface A {
        public void fun();   
        default void fun2(){
            System.out.println("Class A");
        } 
    }
    static class B implements A{
        public void fun(){
            System.out.println("Class B");
        }
    }
    public static void main(String[] args) {
        B b = new B();
        b.fun();
        b.fun2();
    }
}
