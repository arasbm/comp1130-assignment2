public class Black_currant{
    private String initial_color="";
    private static int count=0;
    private float initial_weight=0.0f;

    public Black_currant(String colour, float weight){
        initial_color=colour;
        initial_weight=weight;
        count++;
    }
    public String toString()
    {
        return "this instance of black currant is " + initial_color +" and it is " + initial_weight + "Kg and so far you have created " + count +" black currant" ;
    }
}