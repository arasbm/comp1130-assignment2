public class Rasberry{

    private String colour = "";
    private static int count = 0;
    private float weight = 0.0;
    private String Name = "Rasberry";
    private String message = "";

    public Rasberry(String newColour,float newWeight){
        colour = newcolour;
        weight = newWeight;
        count++;
    }

    public Rasberry (String newMessage){
        message = newMessage;
    }

    public String toString(){
        return "This " + fruit " is " + colour + " in colour and the weight of this" + fruit + " is " + weight + " Kilograms. Currently, You have ordered " + count + " Rasberries."
    }
        public String toMessage(){
            return message;
        }
    }