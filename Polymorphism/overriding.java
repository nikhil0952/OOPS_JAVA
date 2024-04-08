package Polymorphism;

// Overriding : check at run time and according to the type of object

public class overriding {
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
        
        A a = new A();

        B b = new B();

      

        a.fun();
        b.fun();
        
    }
}
