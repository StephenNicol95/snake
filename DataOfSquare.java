package snake;

import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {
	//ArrayList that'll contain the colors
	private ArrayList<Color> C =new ArrayList<Color>();
	private int color; //2:background, 1:food, 0:snake 
	protected SquarePanel square;
	
	public DataOfSquare(int col){
		//Lets add the color to the arrayList
		C.add(Color.GREEN);//0
		C.add(Color.RED);//1
		C.add(Color.white);//2
		color=col;
		square = new SquarePanel(C.get(color));
    	}
	
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
