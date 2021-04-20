public class RaspberryDriver {

    public static void main(String[] args) {

        Raspberry introduction = new Raspberry("Please wait while we are loading the instances of Raspberry...");
        printMessage(introduction.toMessage());

        Raspberry instance1 = new Raspberry("Red", 3.05f);
        printMessage(instance1.toString());

        Raspberry instance2 = new Raspberry("Red", 4.40f);
        printMessage(instance2.toString());

        Raspberry instance3 = new Raspberry("Red", 5.00f);
        printMessage(instance3.toString());
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}