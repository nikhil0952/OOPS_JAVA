package constructor;

public class ParameterC {

    static class A{
        A(int a){
            System.out.println("Parameter : " + a);
        }
    }
    public static void main(String[] args) {
       A a = new A(1);
    }
}
