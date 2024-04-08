package constructor;

public class CopyC {

    static class A{
        public int data;
        A(int a){
            data = a;
            System.out.println(data);
        }

        // copy constructor method
        A(A b){
            data = b.data;
            System.out.println("Copy value : " + data);
        }
    }
    public static void main(String[] args) {
        A a = new A(3);
        A b = new A(a);
    }
}
