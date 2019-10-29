  PImage backgroundImage;
 import ddf.minim.*;
  Minim minim;
  AudioSample sound;
int x =10;
int xspeed = 5;
int hspeed = 5;
int h = 20;
void setup(){
  
   backgroundImage = loadImage("pew.jpg");minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  size(900,900);
  background(#00FFDF);
}
void draw(){
   image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);
rect(mouseX, 890, 70, 30);
  fill(#FF0307);
  stroke(#FF0307);
ellipse(x,h,20, 20);
  if(x <=0){
     
     
   xspeed=-xspeed;
    
    
       
  }
else if(x>width) {

   xspeed=-xspeed ;
       
 } if(x <=0){
     
     
   hspeed=-hspeed;
    
    
       
  }
else if(h>=height) {

   hspeed=-hspeed ;
       sound.trigger();
 }
  
  x+=xspeed;
  h+=hspeed;
  
  
  
  

  
}
