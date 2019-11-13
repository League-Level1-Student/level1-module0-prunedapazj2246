//int x = 0;
//int y=1000;

void setup(){
  size(1000,1000);
  background(#67431E);
}
void draw(){
  makeMagical();
    

        for(int i =0;i<300;i++){
         float x = getWormX(i);
float y = getWormY(i);
      fill(#FF05A8);
    ellipse(x,y,35,35);
            if(mousePressed){
         ellipse(x,y,35,35);
        }
    }
}
 float frequency = .01;
    float noiseInterval = 1000;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
