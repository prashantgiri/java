import pack1.B;

//private member -- CLASS LEVEL
//public member -- GLOBAL LEVEL
//default member -- package level
//protected -- like default + can be used in child class in same package 
//+ can be acess outside package but only with the helpe of child refernce 
public class A extends B {
    public static void main(String[] args) {
        B b = new B();
        // B class object can not acess A class object protected member
        // error :m1() has protected access in B
        // b.m1();

        // A class can acess protected member of B outside package
        A a = new A();
        a.m1();
        a.m2();
    }
}
