// chain constructor : calling constructor within a class

package constructor;

public class Chain {
    static class A{
        A(){
            this(1);
            System.out.println("Constructor 1 ");
        }
        A(int a){
            this(1,2);
            System.out.println("Constructor 2");
        }
        A(int a , int b){
            System.out.println("Constructor 3");
        }
    }
    public static void main(String[] args) {
        A a = new A();
    }
}
