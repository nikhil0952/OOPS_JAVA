// Private constructor : if we have private constructor then we can create instance of that class outside the class

package constructor;

private class A{
    private A(){
        System.out.println("Private constructor");
    }
}
public class privateC {

    public static void main(String[] args) {
        A a = new A();
        
    }
}
