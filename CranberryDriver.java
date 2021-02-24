public class CranberryDriver {
    public static void main (String[] args) {
        Cranberry instance1 = new Cranberry("Burgundy", 1f);
        System.out.println(instance1.toString());

        Cranberry instance2 = new Cranberry("Burgundy", 1.50f);
        Cranberry instance3 = new Cranberry("Burgundy", 1.75f);
        System.out.println(instance3.toString());
    }
}