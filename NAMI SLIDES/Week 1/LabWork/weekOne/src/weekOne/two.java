package weekOne;

public class two {
    static one One = new one();

    public static void main(String[] args) {
        printAttribute();
    }

    public static void printAttribute() {
        System.out.println(One.printQuote());
        System.out.println("-Albert Einstein");
    }
}
