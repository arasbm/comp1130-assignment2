public class Cherry {
    
    private String color ="";
    private static int count = 0;
    private float weight = 0.0f;

    public Cherry(String newColor, float newWeight) {
        color = newColor;
        weight = newWeight;
        count++;
        }

public String toString() {
    return "This intances of Cherry is " + color +" and the weight is " + weight + "lb. So far you generated " + count + "Cherry";

}
}

