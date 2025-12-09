package pack1;

public class B implements interfaces {
    // can be accessible within package child class as well as outside package only
    // by child class refernce
    public void m1() {
        System.out.println("protected m1 method called");
    }

    public void name() {
        System.out.println("packag pack1 class B name cllaed");
    }

    public void m2() {
        System.out.println("protected m2 method called");
    }
}
