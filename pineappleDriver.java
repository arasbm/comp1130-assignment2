import org.graalvm.compiler.lir.Variable;

public class pineappleDriver {  // Class name

    public static void main(String[] args) { // runs the program

        Pineapple firstInstance = new Pineapple("orange", 0.35f); 
        
        System.out.println("Let's creat some pineapples"); // display's "Let's creat some pineapples" 
        
        System.out.println(""); // display blank line
        
        System.out.println(firstInstance.toString());
        
        System.out.println(""); // display blank line
       
        Pineapple secondInstance = new Pineapple("green", 0.45f);
        Pineapple thirdInstance = new Pineapple("yellow", 0.55f); 
        
        System.out.println(thirdInstance.toString());

    }

}