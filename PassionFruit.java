public class PassionFruit{
  
  //Declaring variables
  private String color = "";
  private static int count = 0;
  private float weight = 0.0f;
  
  //Constructing a constructor
  public PassionFruit(String color, float weight){
    this.color = color;
    this.weight = weight;
    count++;
  }
  
  //Statement that will be returned in driver
  public String toString(){
    return "This instance of Passion Fruit is " + color + " and it is " + weight + "lb. So far you have created " + count + " passion fruits.";
  }
  
}