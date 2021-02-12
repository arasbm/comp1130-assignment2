public class Mulberries{

    private String color = "";
    private float weight = 0.0F;
    private static int count = 0; 

    public Mulberries(String color, int weight){
        this.color = color;
        this.weight = weight;
        count += 1;
    }

    public String toString(){
        return "This instance of Mulberries is " + color +" and it is " + weight +"lb. So far you have created "+ count +" apples";
    }
}