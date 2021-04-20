public class AvocadoDriver {

    public static void main(String[] args) {
        
        Avocado firstInstance = new Avocado("green", 0.33f);
        System.out.println(firstInstance.toString());

        Avocado secondInstance = new Avocado("yellow", 0.45f);
        Avocado thirdInstance = new Avocado("brown", 0.38f);

        System.out.println(thirdInstance.toString());

    }

}

