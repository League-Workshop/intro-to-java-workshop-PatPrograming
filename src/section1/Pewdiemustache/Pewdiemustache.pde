PImage mustache;
PImage friend;
void setup(){
friend=loadImage("friend.jpg");
mustache=loadImage("mustache.png");
size(600,600);
friend.resize(600,600);
mustache.resize(150,100);
}
void draw(){
  background(friend);

 if (mousePressed) {
    image(mustache, 160, 200);

 }
}
