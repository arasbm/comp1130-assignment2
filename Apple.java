public class Apple
{
    private String color = ""; //Sets the color variavle
    private static int count = 0; //Sets the count Variable
    private float weight = 0.0f; //Sets the weight variable
    
    //Creating a constructor that accepts color and weight
    public Apple(String color, float weight)
    {
        this.color = color;
        this.weight = weight;
        count++;
    }

    //Creating a toString method to return the variables
    public String toString()
    {
        return "This instance of Apple is "+color+" and it is "+weight+"lb. So far you have created "+count+" apple(s).";
    }
}