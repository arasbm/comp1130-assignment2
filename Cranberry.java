public class Cranberry {

    private String color ="";
    private static int count = 0;
    private float weight = 0.0f;

    public Cranberry (String newColor, float newWeight) {
        color = newColor;
        weight = newWeight;
        count++;
    }

    public String toString() {
        return "This instance of Cranberry is " + color + " and the weight is " + weight + " lb. So far you have generated " + count + " Cranberry. ";
    }
}