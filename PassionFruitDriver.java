public class PassionFruitDriver{
  
  public static void main (String []args){
    
    System.out.println(" ");
    
    //Creating instances and printing the result
    PassionFruit firstInstance = new PassionFruit("purple",0.07f);
    System.out.println(firstInstance.toString());
    
    PassionFruit secondInstance = new PassionFruit("red plum",0.11f);
    
    PassionFruit thirdInstance = new PassionFruit("yellow",0.17f);
    System.out.println(thirdInstance.toString());
    
  }
  
}