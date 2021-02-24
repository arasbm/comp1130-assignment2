public class OrangeDriver{ 

    public static void main (String[] Args) {

        Orange firstInstance = new Orange("yellow", 0.22f);

        System.out.println(firstInstance.toString());

        Orange secondInstance = new Orange("yellow", 0.44f);
        Orange thirdInstance = new Orange("yellow", 0.66f);

        System.out.println(thirdInstance.toString());

    
    }


}