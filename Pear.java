public class Pear{

    private String color = "";
    private static int count = 0;
    private float weight = 0;

    public Pear(String color, float weight) {
        
        this.color = color;
        this.weight = weight;
        count = count +1; 
    }

    public String toString(){

        return "This instance of Pear is color "+color+" and it is "+weight+"lb. So far you have created "+count+" pears";
    }



}