PImage catPic;
int x=310;
int y=384;
int acceleration=5;
void setup(){
size(700,700);
catPic=loadImage("cat.jpeg");
catPic.resize(700,700);
background(catPic);

}
void draw(){
    if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
noStroke();
ellipse(x+78,y+33, 15,15);
ellipse(x,y,15,15);
fill(5000,0,0);
if (x>width){
  background(catPic);
  x=310;
 y=384;
 acceleration=1;
}
}

void keyPressed(){
  x-=.3*acceleration;
  x-=.3*acceleration;
}
