package recursivePractice;

import java.util.ArrayList;

public class listAllPresents {
	public static void main(String[] args)
	  {
		//listAllPresents();
	  }
	public static void listAllPresents(Thing thing){
		ArrayList<Thing> myThings = new ArrayList<Thing>();
		if (thing.isPresent()){
			System.out.println(thing.getDescription());
		}
		else{
			myThings = thing.getContents();
			for (int i = 0; i<myThings.size(); i++){
				listAllPresents(myThings.get(i));
				
			}
		}
	}
}
