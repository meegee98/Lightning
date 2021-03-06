int startX=150;
int startY=60;
int endX=150;
int endY=0;
int cloudX= 100;
int cloudY= 50;
void setup()
{
  size(500, 400);
  strokeWeight(3);
  background(0,0,0);
}

void draw()
{

	cloud();
	house();
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

void cloud()
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

void house()
{
	fill(0);
	stroke(139, 130, 120);
	rect(350, 300, 100, 100);
	triangle(325, 300, 400, 250, 475, 300);
	rect(385, 350, 25, 50);
}

void mousePressed()
{
	startX=(int)(Math.random()*500);
	startY=60;
	endX=150;
	endY=0;
	background((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
	
}

