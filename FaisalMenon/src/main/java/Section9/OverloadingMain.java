package Section9;

import lombok.Data;

// Method Overloading, Constructor Overloading, Operator Overloading
@Data
public class OverloadingMain {

    // Constructor Overloading
    public String name;
    public int age;

    public OverloadingMain() { }
    public OverloadingMain(String name) { this.name = name; }
    public OverloadingMain(int age) { this.age = age; }
    public OverloadingMain(String name, int age) { this.name = name; this.age = age; }

    // Method Overloading - CompileTime Polymorphism / Static Binding / Early Binding
    public void m1(){ System.out.println("m1"); }
    public int m1(int a){ return a; }
    public double m1(double a, double b){ return a + b; }
    public int m1(int a, int b){ return a + b; }

    // toString Method
    @Override
    public String toString() {
        return "OverloadingMain{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        OverloadingMain o = new OverloadingMain("Nikesh", 25);
        System.out.println(o);
        o.m1(); System.out.println(o.m1(7) + ", " + o.m1(13,7) + ", " + o.m1(13.3,7.8) );
    }
}
