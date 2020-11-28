package sugam;

interface Person {
   stati String name = "sugam";
    int age = 19;

    void printNameAge();

}

public class interfacial implements Person {
   static Person person = new interfacial();
    public static void main(String[] args) {
        
        person.printNameAge();
    }

    @Override
    public static void printNameAge() {
        System.out.println("my name is "+person.n);

    }

}
