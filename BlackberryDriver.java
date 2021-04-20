public class BlackberryDriver {
    public static void main(String args[]){
        Blackberry firstInstance = new Blackberry("black", 0.21f);
        System.out.println(firstInstance.toString());

        Blackberry secondInstance = new Blackberry("blue", 0.27f);
        Blackberry thirdInstance = new Blackberry("pink", 0.33f);
        System.out.println(thirdInstance.toString());
    }
}
