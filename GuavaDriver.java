public class GuavaDriver{
    public static void main(String[] args){
        Guava firstInstance = new Guava("Green" , 0.33f);
        System.out.println(firstInstance.toString());
        Guava secondInstance = new Guava("Green" , 0.66f);
        Guava thirdInstance = new Guava("Green" , 0.99f);
        System.out.println(thirdInstance.toString());
    }
}