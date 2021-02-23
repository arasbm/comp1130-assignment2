public class Raspberry {

    private String colour = "";
    private static int count = 0;
    private float weight = 0.0f;
    private String Name = "Raspberry";
    private String message = "";

    public Raspberry(String newColour, float newWeight) {
        colour = newColour;
        weight = newWeight;
        count++;
    }

    public Raspberry(String newMessage) {
        message = newMessage;
    }

    public String toString() {
        return "This " + Name + " is " + colour + " in colour and the weight of this" + Name + " is " + weight
                + " grams. You have ordered " + count + " Raspberries.";
    }

    public String toMessage() {
        return message;
    }
}