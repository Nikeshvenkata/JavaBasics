package Section9;

class A{
    private int var = 50;
    public int getVar() {
        return var;
    }
    public void setVar(int var) {
        this.var = var;
    }
}

public class EncapsulationMain {
    public static void main(String[] args) {
        A a = new A(); System.out.println(a.getVar());
        a.setVar(13); System.out.println(a.getVar());
    }
}
