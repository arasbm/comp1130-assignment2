public class Lemon{

    private String color = "";
    private static int count = 0;
    private float weight = (float)0.0;

    public Lemon(String input_color, float input_weight) {
        color = input_color;
        weight = input_weight;
        count++;
    }
    public String toString(){
        return "This instance of Lemon is " + color + " and it is "+ weight + "lb. So far you have created " + count + " lemons.";
    }    
}