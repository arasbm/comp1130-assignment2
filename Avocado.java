public class Avocado {
    
    private String color = "";
    private static int count = 0;
    private float weight = 0.0f;

    public Avocado(String color, float weight) {
        this.color = color;
        this.weight = weight;
        count ++;
    }

    public String toString() {
        return "This instance of Avocado is " + color +  " and it is " +  weight + " lb. So far you have created " + count +  " avocados";
    }
}