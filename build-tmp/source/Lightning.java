import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=0;
int startY=150;
int endX=0;
int endY=150;
int colorRed= (int)(Math.random()*256);
int colorGreen= (int)(Math.random()*256);
int colorBLue= (int)(Math.random()*256);
int randX= (int)(Math.random()*10);
int randY= (int)(Math.random()*18)-9;
public void setup()
{
  size(300, 300);
  strokeWeight(3);
  background(0,0,0);
}
public void draw()
{
	stroke(colorRed, colorBLue, colorGreen);
	while(endX<300)
	{
		endX= startX+ randX;
		endY=startY+ randY;
		line(startX, startY,endX, endY);
		//startX=endX;
		//startY=endY;

	}

}
public void mousePressed()
{
	int startX=0;
	int startY=150;
	int endX=0;
	int endY=150;


}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
