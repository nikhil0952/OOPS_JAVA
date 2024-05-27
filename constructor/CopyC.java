/*
There is no copy constructor in java. But, we can copy the values of one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in java. They are:
o By constructor
o By assigning the values of one object into another 
o By clone() method of Object class

*/


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
