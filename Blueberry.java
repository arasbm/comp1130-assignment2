/*
 *   Copyright (c) 2021 
 *   All rights reserved.
 */

public class Blueberry {

    private String color = " ";
    private static int count = 0;
    private float weight = 0.0F;

    public Blueberry(String bcolor, float bweight){

        color = bcolor;
        weight = bweight;
        count++;

    }
public String toString(){
    return "This instance of Blueberry is " + color + " and it is " + weight + "lb. So far you have created " + count + "blueberries.";
}
    
}
