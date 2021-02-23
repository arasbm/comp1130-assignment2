public class CherryDriver {
    public static void main(String[] args) {

        Cherry instance1 = new Cherry("Red", 1f);
        System.out.println(instance1.toString());

        Cherry instance2 = new Cherry("Red", 1.50f);
        Cherry instance3 = new Cherry("Red", 1.75f);
        System.out.println(instance3.toString());
        }
    }