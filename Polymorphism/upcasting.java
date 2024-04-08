package Polymorphism;

public class upcasting {
    static class A{
        public void fun(){
            System.out.println("Class A");
        }
    }

    static class B extends A{

        @Override
        public void fun(){
            System.out.println("Class B");
        }

    }
    public static void main(String[] args) {
        
        

        A a = new B();
        a.fun();
        
    }
}
