

public class Watermelon {

    private String color = "";
    private static int count = 0; 
    private float weight = 0.0f;

    public Watermelon(String input_color, float input_weight){

        color = input_color;
        weight = input_weight;
        count++;
    }
    public String toString(){
        return "This instance of Watermelon is " + color + " and it is " + weight + "lb. So far you have created " + count + " Watermelons.";
       }  
    
}
