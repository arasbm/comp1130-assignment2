public class Orange{
    private String colour = "";
    private static int count = 0;
    private float weight = 0.0f;

    public Orange(String colour, float weight){
        this.colour = colour;
        this.weight = weight;
        count ++;
    }

    public String toString() {
    return "This instance of Orange is " + colour + " and it is " + weight + "lb. So far you have created " + count + " orange.";// This is for singular orange
    }
    public String toString2() {
        return "This instance of Orange is " + colour + " and it is " + weight + "lb. So far you have created " + count + " oranges.";// this is for plural oranges
        }
}

