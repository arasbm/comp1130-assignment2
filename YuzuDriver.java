public class YuzuDriver {

    public static void main (String[] args) {

        Yuzu intro = new Yuzu("Loading instances of Yuzu...");
        printMessage(intro.toMessage());

        Yuzu instance1 = new Yuzu("Yellow", 1.54f);
        printMessage(instance1.toString());

        Yuzu instance2 = new Yuzu("Yellow", 1.62f);
        Yuzu instance3 = new Yuzu("Yellow", 1.75f);
        printMessage(instance3.toString());
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
