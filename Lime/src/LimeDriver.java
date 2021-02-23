public class LimeDriver {
    public static void main (String[] args ) {
        Lime firstInsatnce = new Lime ("green", 0.27f);
        System.out.println(firstInsatnce.toString());
        Lime secondInstance = new Lime("orange", 0.44f);
        Lime thirdInstance = new Lime("yellow", 0.67f);
        System.out.println(thirdInstance.toString());
    }
}
