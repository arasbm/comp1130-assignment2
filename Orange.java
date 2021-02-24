public class Orange
{
    
    private String colour = "";
    private static int count = 0;
    private float weight = 0.0f; 

    public Orange (String colour, float weight) {

    this.colour = colour;
    this.weight = weight;
    count++;

    }

public String toString() { 
    return "This instance of Orange is " + colour + " and the weight is " + weight + "lbs. so far that you have created" + count + "Orange.";
}
}
