public class Fig {
     private String color = "";
     static private int count = 0;
     private float weight = 0;
     public Fig(String input_color, float input_weight){
          color = input_color;
          weight = input_weight;
          count = count + 1;
     }
     public String toString(){
          return "This instance of Fig is " + color + " and it is " + weight + "lb, So far you have created " + count + " figs.";
     }

}
