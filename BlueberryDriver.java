/*
 *   Copyright (c) 2021 
 *   All rights reserved.
 */

public class BlueberryDriver {
    public static void main(String args []){

    Blueberry FirstInstance = new Blueberry("purple", 0.001F);
    System.out.println(FirstInstance.toString());
    
    Blueberry SecondInstance = new Blueberry("purple", 0.002F);

    Blueberry ThirdInstance = new Blueberry("purple", 0.005F);
    System.out.println(ThirdInstance.toString());
    
    }
}
