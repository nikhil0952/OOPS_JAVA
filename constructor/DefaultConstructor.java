package constructor;


// default constructor without any parameter and java has default constructor if we donot create it



public class DefaultConstructor {
    static class A{
        A(){
            System.out.println("Default constructor");
        }
    }
    public static void main(String[] args) {
        A a = new A();
    }
}
