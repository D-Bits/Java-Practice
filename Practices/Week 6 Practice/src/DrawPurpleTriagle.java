//Draw a purple triangle using drawing panel method(s)

import java.awt.*; //Java library for graphical interfaces

public class DrawPurpleTriagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawingPanel panel = new DrawingPanel(300, 200);
		
		Color[][] pixels = panel.getPixels();
		for(int row = 50; row <=150; row++){
			for (int col = 50; col <= row; col++){
				pixels[row][col] = Color.MAGENTA;
				
			}
		}
		
		panel.setPixels(pixels);
		
	}

}
