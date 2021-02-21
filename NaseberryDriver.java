public class NaseberryDriver{
    public static void main(String[] args){

        Naseberry firstinstance = new Naseberry("brownest", 3);
        System.out.println(firstinstance.toString());

        Naseberry secondinstance = new Naseberry("green", 2);
        Naseberry thirdinstance = new Naseberry("white" , 4);
        System.out.println(thirdinstance.toString());
    }

}