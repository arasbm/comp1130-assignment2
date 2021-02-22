public class Peaches{
    private String color ="";
    private static int count = 0;
    private float weight = 0.0f;

    public Peaches (String newColor, float newWeight) {
        color = newColor;
        weight = newWeight;
        count++;
    }

    public String toString(){
        return "This instance of peach is " + color + " and the weight is " + weight + " lb. So far you have created " + count + " peaches.";
        
    }
}