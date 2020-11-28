package sugam;

interface Person {
    String name = "sugam";
    int age = 19;

    void printNameAge();

}

public class interfacial implements Person {
    Person person = new interfacial();
    public static void main(String[] args) {
        
        person.printNameAge();
    }

    @Override
    public void printNameAge() {
        System.out.println("my name is " +   " and my age is " );

    }

}
