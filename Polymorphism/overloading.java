package Polymorphism;

// method overloading : same name but differnet parameters
// Compile time polymorphism


public class overloading {
    static class A{
        public void fun(){
            System.out.println("Class A");
        }
        public void fun(int a){
            System.out.println("Class A "+a);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.fun();
        a.fun(1);
    }
}
