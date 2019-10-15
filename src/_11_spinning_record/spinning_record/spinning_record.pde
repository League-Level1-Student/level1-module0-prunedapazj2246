import ddf.minim.*;
int imageAngle = 0;
PImage record;
Minim minim;
AudioPlayer song;
void setup(){
  size(600,600);
  record=loadImage("record.jpg");
  record.resize(600,600);
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512); 
}
void draw(){
 if(mousePressed){
   song.play();
  imageAngle+=10000;
 rotateImage(record,imageAngle);
 image(record, 0, 0);
 song.pause();
 }
 
}

 void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
