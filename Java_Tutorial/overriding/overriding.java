/**
 * overriding
 */
class parent {

    public void m1() {
        System.out.println("m1 method");
    }

    public void m2() {
        System.out.println("m2 method : overriden method");
    }
}

// overloading parent method in child
class child extends parent {

    // overriding method
    public void m2() {
        System.out.println("child m2 method : overloaded method");
    }

    public static void main(String[] args) {
        child c = new child();
        parent p = new parent();
        // p.m1();
        // p.m2();
        // c.m1();
        // c.m2();

        // special case :
        // In overriding method resolutions always taken care by JVM, based on runtime
        // object hence it is called as "Runtime polymorphism" or "Dynamic polymorphism"
        // or "Late binding"

        // Reference type = Runtime object
        parent p1 = new child();
        p1.m2();
    }
}