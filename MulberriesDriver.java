public class MulberriesDriver{


    public static void main(String[] args){
    
        var firstInstance = new Mulberries("red", 5);
        var secondInstance = new Mulberries("black", 10);
        var thirdInstance = new Mulberries("black", 22);

        System.out.println(firstInstance.toString());
        System.out.println(thirdInstance.toString());
       
    }
}