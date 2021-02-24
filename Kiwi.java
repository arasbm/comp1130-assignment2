public class Kiwi{

    private String color = "";
    private static int count = 0;
    private double weight = 0.0;

    public Kiwi(String color, double weight) {

        this.color = color;
        this.weight = weight;
        count = count +1; 
    }

    public String toString(){

        return "This instance of Kiwi is color "+color+" and it is "+weight+"lb. So far you have created "+count+" pears";
    }



}