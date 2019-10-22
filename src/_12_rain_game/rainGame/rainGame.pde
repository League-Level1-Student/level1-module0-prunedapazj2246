int score=0;
int randomNumber;
int y = 10;
int x= 50;
void setup(){
  size(600,600);
  randomNumber = (int) random(width);
}
void draw(){
   
  background(#199800);
  if(y==550 && randomNumber > mouseX && randomNumber < mouseX+50 ){
 y=10; 
 randomNumber = (int) random(width);
}
else if(y ==575){
   y=10; 
 randomNumber = (int) random(width);}
  fill(#0543E8);
    stroke(#0543E8);
    ellipse(randomNumber, y, 15, 30);
y+=5;
fill(#6C6C6C);
 rect(mouseX, 550, 50, 50);
 checkCatch(randomNumber);
  
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+50 && y==550){
            score++;
            println("Your score is now: " + score);
         }
          if (y ==575) {
            score--;
        println("Your score is now: " + score);
         }else if (score == -1){
          score =0; 
         }
         fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    }
