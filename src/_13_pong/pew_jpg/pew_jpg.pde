   PImage backgroundImage;
 import ddf.minim.*;
  Minim minim;
  AudioSample sound;
  int x = 10;
  int y = 10;
int xspeed = 20;
int yspeed = 20;

void setup(){
  
   backgroundImage = loadImage("pong.png");
   minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  size(900,900);
  background(#00FFDF);
}
void draw(){

   image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);
   //background(#034CFF);
rect(mouseX, 890, 70, 30);
  fill(#FF0307);
  stroke(#FF0307);
ellipse(x,y,20, 20);
x+=5;
y+=10;
  if(x <=0){
     
     x+=5;
   xspeed=-xspeed;
    
    
       
  }
else if(x>=width-5) {

   xspeed=-xspeed ;
    x-=5;   
 } if(y <=0){
    y+=10;
     
   yspeed=-yspeed;
    
    
       
  }
else if(y>=height) {
y-=5;
   sound.trigger();
       
 }
if(intersects(x,y,mouseX,890,70)== true){
  yspeed=-yspeed ;
  y-=50;
  x-=25;
}
 if(y>height){
  System.exit(0); 
 }
  x+=xspeed;
  y+=yspeed;
  
  
  
  

  
}
     boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
        }
