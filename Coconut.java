public class Coconut {
    private String color = "";
    private static int count = 0;
    private float weight = 0.0f;
    
    public Coconut(String color, float weight) {
        this.color = color;
        this.weight = weight;
        count ++;

    }

    public String toString() {
        return " This instance of Coconut is " + color + " and it is " + weight + "lbs. So far you have created " + count + " Coconuts ";
    }

}
