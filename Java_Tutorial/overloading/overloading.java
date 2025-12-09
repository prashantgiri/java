/**
 * overloading method execution resolutions taken care by compiler at runtime
 * hence it is also known as "Compile time polymorphism" or "Static
 * polymorphism" or "Early binding"
 */
public class overloading {

    public void m1() {
        System.out.println("NO args method");
    }

    public void m1(int a) {
        System.out.println("int args method" + a);
    }

    public void m1(double a) {
        System.out.println("double args method" + a);
    }

    public static void main(String[] args) {
        overloading v = new overloading();
        v.m1();
        v.m1(10);
        v.m1(10.5);
    }
}