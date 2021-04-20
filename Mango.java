/**
 * Auto Generated Java Class.
 */
public class Mango 
{
  private String color = "";
  private static int count = 0; 
  private float weight = 0.0f;
  
  
  public Mango(String colour, float lb) 
  { 
    color = colour;
    weight = lb;
    count++;
  }
  
  public String toString()
  {
    return("This instance of mango is " + color + " and it is "+ weight + " So far you have created "+ count +" mango");
  }
  
  /* ADD YOUR CODE HERE */
  
}
