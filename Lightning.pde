int startX=0;
int startY=150;
int endX=0;
int endY=150;
int colorRed= (int)(Math.random()*256);
int colorGreen= (int)(Math.random()*256);
int colorBLue= (int)(Math.random()*256);
int randX= (int)(Math.random()*10);
int randY= (int)(Math.random()*18)-9;
void setup()
{
  size(300, 300);
  strokeWeight(3);
  background(0,0,0);
}
void draw()
{
	stroke(colorRed, colorBLue, colorGreen);
	while(endX<300)
	{
		endX= startX+ randX;
		endY=startY+ randY;
		line(startX, startY,endX, endY);
		startX=endX;
		startY=endY;

	}

}
void mousePressed()
{
	int startX=0;
	int startY=150;
	int endX=0;
	int endY=150;


}

