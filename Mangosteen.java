

public class Mangosteen {

	    private String Color = "";
	    private static int Count = 0;
	    private float Weight = 0.0f;

	    public Mangosteen (String updatedColor, float updatedWeight) {
	        Color = updatedColor;
	        Weight = updatedWeight;
	        Count++;
	    }

	    public String toString(){
	        return "This instance of Mangosteen is " + Color + " in color and the weight of it is " + Weight + " lb. So far you have created " + Count + " mangosteen.";

	    }
	} 

