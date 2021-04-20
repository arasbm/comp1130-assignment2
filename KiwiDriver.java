public class KiwiDriver{
    
    public static void main(String[] args){

        var first = new Kiwi("Green", 1);
        var second = new Kiwi("Blue", 5);
        var third = new Kiwi("Brown", 0.8);

        System.out.println(first.toString());
        
        System.out.println(third.toString());
    }
}