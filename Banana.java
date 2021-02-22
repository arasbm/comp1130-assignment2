
public class Banana {
    private String color = "";
    private static int count = 0;
    private float weight=0;
    
    public  Banana(String input_color, float input_weight){
        color=input_color;
        weight=input_weight;
        count++;
    }
    public String toString(){
        return "This instance of Banana is "+color+" and it's "+weight+"lb. So far you have created "+count+" Banana/s";
    }
    
    

    
}
