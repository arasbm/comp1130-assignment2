public class WatermelonDriver {
    public static void main(String args[]){  

        Watermelon firstInstance = new Watermelon("green", 0.55f);
        System.out.println(firstInstance.toString()); 

        Watermelon secondInstance = new Watermelon("green", 0.75f);
        

        Watermelon thirdInstance = new Watermelon("green", 2f);
        System.out.println(thirdInstance.toString());
        
      }  
    
}
