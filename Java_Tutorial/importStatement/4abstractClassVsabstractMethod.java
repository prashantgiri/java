abstract class abstractClassVsabstractMethod {
    public abstract void m1();

    public abstract void m2();
}

// child class should provide implementation of abstract class
// if we want to child class to compulsion on implementation there we declare
// class as abstract
class abstractClassVsabstract extends abstractClassVsabstractMethod {

    public void m1() {
    };

    public void m2() {
    };

}