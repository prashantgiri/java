class A {
    public void add(int... i) {
        System.out.println("No of arguements    : " + i.length);
        System.out.print("No of arguement     : ");
        for (int val : i) {
            System.out.print(val + "  ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }
}

public class test {
    public static void main(String[] args) {
        A a = new A();
        a.add();
        a.add(10);
        a.add(10, 20);
        a.add(10, 20, 30);
    }
}