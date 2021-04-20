public class TomatoDriver {
    public static void main(String[] args){
        Tomato firstInstance = new Tomato("red", 0.30);
        System.out.println(firstInstance.toString());
        Tomato secondInstance = new Tomato("green", 0.35);
        Toamto thirdInstance = new Tomato("yellow", 0.40);
        System.out.println(thirdInstance.toString());
    }
}