public class Apricot {

    private String color="";
    static private int count=0; 
    private float weight=0.0f;
    public Apricot (Float InWeight, String InColor)
        {color=InColor;
        weight=InWeight;
        count++;

    } 
    public String toString()
    {
        return "This instance of Apricot is " + color + " and it is " + weight + "lb. So far you have created " + count + " Apricots";
        }

}
