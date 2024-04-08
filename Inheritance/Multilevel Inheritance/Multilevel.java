public class Multilevel {
    static class A{
        public void funA(){
            System.out.println("Class A");
        }
    }
    static class B extends A{
        public void funB(){
            System.out.println("class B");
        }
    } 
    static class C extends B{
        public void funC(){
            System.out.println("class C");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        c.funA();
        c.funB();
        c.funC();
    }
}
