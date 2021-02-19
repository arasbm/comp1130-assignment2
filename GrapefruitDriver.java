public class GrapefruitDriver{
    public static void main(String[] args){
        Grapefruit firstInstance = new Grapefruit("purple", 0.22f);
        System.out.println(firstInstance.toString());
        Grapefruit secondInstance = new Grapefruit("red", 0.66f);
        Grapefruit thirdInstance = new Grapefruit("green", 0.77f);
        System.out.println(thirdInstance.toString());
    }
}