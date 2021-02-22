public class PeachesDriver{
    public static void main (String[] args){

        Peaches instance1 = new Peaches("orange", 0.75f);
        System.out.println(instance1.toString());

        Peaches instance2 = new Peaches("yellow", 0.90f);

        Peaches instance3 = new Peaches("yellow", 1.0f);
        System.out.println(instance3.toString());
    }
}