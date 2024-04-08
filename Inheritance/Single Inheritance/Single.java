public class Single {

    static class A{
        public void funA(){
            System.out.println("Class A");
        }
    }
    static class B extends A{
        public void funB(){
            System.out.println("Class B");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.funA();
        b.funB();
    }
}
