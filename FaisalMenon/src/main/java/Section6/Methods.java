package Section6;

public class Methods {
    public int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static void print(int count, String name){
        for(int i = 0; i < count; i++){
            System.out.print( (i + 1) + " " + name + ", ");
        }
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        System.out.println("a + b = " + m.add(21,13));
        System.out.println("a + b = " + m.add(13,7));
        System.out.println("a - b = " + m.sub(13,7) + ", Static Method: a - b = " + sub(13,7));
        print(10, "Nikesh");
    }
}
