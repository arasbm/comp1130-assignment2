public class StrawberryDriver {
    public static void main(String[] args) {

        Strawberry instance1 = new Strawberry("Red", 1f);
        System.out.println(instance1.toString());
        
        Strawberry instance2 = new Strawberry("Red", 1.50f);
        Strawberry instance3 = new Strawberry("Red", 1.75f);
        System.out.println(instance3.toString());
    }
}