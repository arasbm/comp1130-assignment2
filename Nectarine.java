public class Nectarine{

    private String color = "";
    private static int count = 0;
    private float weight = 0.0f;  

public Nectarine(String colour, float mass)
{
    color = colour;
    weight = mass;
    count = count + 1;
}

public String toString(){
    return "This instance of Nectarine is " + color + " and it is " + weight + "lbs. So far you have created " + count +" Nectarines";
}

}