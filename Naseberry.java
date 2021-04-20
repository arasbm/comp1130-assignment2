public class Naseberry{

    private String color= "";
    private static int count=0;
    private float weight;

    public Naseberry(String color, float weight){
        this.color= color;
        this.weight= weight;
        count++;
        
    }
    public String toString(){
        return " This instance of Naseberry is " + color + " color and it is " + weight + " lb " + " so far you have created " + count + " Naseberry.";
    }
}