public class Guava{
    private String colour = "";
    private static int count = 0;
    private float weight = 0.0f;

    public Guava(String colour, float weight){
        this.colour = colour;
        this.weight = weight;
        count++;
    }
    
    public String toString() {
        return "This instance of Guava is " + colour + " and it is " + weight + " lb. So far you have created " + count + " Guavas. ";
    }
}