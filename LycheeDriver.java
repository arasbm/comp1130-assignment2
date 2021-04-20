public class LycheeDriver {
    public static void main(String[] args) {
        Lychee firstInstance = new Lychee("red", 0.23f);
        System.out.println(firstInstance.toString());

        Lychee secondInstance = new Lychee("white", 0.55f);
        System.out.println(secondInstance.toString());
        
        Lychee thirdInstance = new Lychee("black", 0.47f);
        System.out.println(thirdInstance.toString());
    }
}