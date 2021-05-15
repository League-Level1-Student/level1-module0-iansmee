 int randomNumber = (int) random(500);
 int score = 0;
      void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
   
void setup(){
  size(500,500);
  height = 0;
   
}
void draw(){
  background(100,100,100);
  fill(0,0,0);
  rect(mouseX -50, 400, 100, 100);
     fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 50, 50);
  for(int i = 0;i<100; i++);{
  if(height == 500){
    checkCatch(randomNumber);
  height = 0;
  randomNumber = (int) random(500);
  }
  height +=10;
  fill(0,0,100);
  stroke(0,0,100);
  ellipse(randomNumber,height,50,50);
  
}
}
