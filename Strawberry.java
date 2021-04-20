public class Strawberry {

    private String color ="";
    private static int count = 0;
    private float weight = 0.0f;

    public Strawberry (String newColor, float newWeight) {
        color = newColor;
        weight = newWeight;
        count++;
    }

    public String toString() {
        return "This instance of Strawberry is " + color + " and the weight is " + weight + " lb. So far you have generated " + count + " Strawberry.";
    }
}