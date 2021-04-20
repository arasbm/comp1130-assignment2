public class OrangeDriver{
    public static void main(String[] args){
    Orange firstInstance = new Orange("Orange", 0.50f);
    System.out.println(firstInstance.toString());
    Orange secondInstance = new Orange("Less Orange", 0.25f);
    Orange thirdInstance = new Orange("More Orange", 0.75f);
    System.out.println(thirdInstance.toString2());
    }
}