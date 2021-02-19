public class Grapefruit{
    private String color = "";
    private static int count = 0;
    private float weight = 0.0f;
    public Grapefruit(String color, float weight){
        this.color = color;
        this.weight = weight;
        count ++;
    }
    public String toString(){
        return "This instance of Graprfruit is " + color + " and it is " + weight + "lb. Now you have created " + count + " Grapefruit.";
    }
}