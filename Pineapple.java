public class Pineapple {  

    private String color = "";
    private static int count = 0; // value
    private float weight = 0.0f; // value

    public Pineapple(String Color, float Weight) { // String for "Pineapple"
         this.color = Color; 
         this.weight = Weight;
        count ++;
    }

    public String toString() { 
        return "This instance of Pineapple is " + color +  " and it is " +  weight + " lb. So far you have created " + count +  " Pineapples"; 
    }

  


} 