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

int startX=150;
int startY=60;
int endX=150;
int endY=0;
int cloudX= 100;
int cloudY= 50;
public void setup()
{
  size(500, 400);
  strokeWeight(3);
  background(0,0,0);
}

public void draw()
{

	cloud();
	stroke((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
	while(endY<500)
	{
		endY= startY+ (int)(Math.random()*9);
		endX = startX + (int)(Math.random()*18)-9;
		line(startX, startY,endX, endY);
		startY=endY;
		startX=endX;

	}
}

public void cloud()
{
	stroke(139, 131, 120);
	fill(139, 131, 120);
	ellipse (cloudX+15, cloudY-15, 175, 70);
	ellipse(cloudX-30, cloudY+15, 175, 50);
	ellipse(cloudX+60, cloudY+15, 175, 50);
	ellipse (cloudX+15, cloudY+25, 175, 70);
	//second cloud
	ellipse (cloudX+270, cloudY-15, 175, 70);
	ellipse(cloudX+235, cloudY+15, 175, 50);
	ellipse(cloudX+315, cloudY+15, 175, 50);
	ellipse (cloudX+270, cloudY+25, 175, 70);
}
public void mousePressed()
{
	startX=(int)(Math.random()*500);
	startY=60;
	endX=150;
	endY=0;
	background((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
	


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
