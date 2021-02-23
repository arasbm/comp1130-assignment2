public class Tomato {

    private String color = "";
    private static int count = 0;
    private float weight = 0;

        public Tomato(String input_color, float input_weight){
            this.color = color;
            this.weight = weight;
            count++;
        }

        public String toString(){
            return "This instance of Tomato is "+color+" and it is "+weight+"lb. So far you have created "+count+" tomato/es"; 
        }
} 