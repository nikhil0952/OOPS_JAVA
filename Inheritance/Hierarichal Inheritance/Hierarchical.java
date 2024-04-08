
// public class Hierarchical {
//     static class A{
//         public void funA(){
//             System.out.println("Class A");
//         }
//     }
//     static class B extends A{
//         public void funB(){
//             System.out.println("Class B");
//         }
//     }
//     static class C extends A{
//         public void funC(){
//             System.out.println("Class C");
//         }
//     }
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         C c = new C();

//         b.funA();
//         b.funB();
//         c.funA();
//         c.funC();
//     }
// }


// constructor calls parent -> child follow
public class Hierarchical {
    static class A{
        A(){
            System.out.println("Class A");
        }
        
    }
    static class B extends A{
        B(){
            System.out.println("Class B");
        }
    }
    static class C extends A{
        C(){
            System.out.println("Class C");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        
    }
}

