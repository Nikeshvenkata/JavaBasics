package Section8;

public class Pet {
    public String name;
    public int age;
    public String type;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void printPetInfo(){
        System.out.println(name + " is a " + age + " year old " + type);
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("Bobby", 2, "Dog");
        myPet.printPetInfo();
    }
}
