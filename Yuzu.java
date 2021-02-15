public class Yuzu {

    private String color = "";
    private static int count = 0;
    private float weight = 0.0f;
    private String fruit = "Yuzu";
    private String message = "";

    public Yuzu (String newColor, float newWeight) {
        color = newColor;
        weight = newWeight;
        count++;
    }

    public Yuzu (String newMessage) {
        message = newMessage;
    }

    public String toString() {
        return "This instance of " + fruit + " is " + color + " and the weight is " + weight + " Ounces. Currently, You have generated " + count + " Yuzus.";
    }

    public String toMessage() {
        return message;
    }

}
