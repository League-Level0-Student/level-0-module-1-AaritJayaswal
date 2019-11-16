
void setup() {
PImage face = loadImage("zombieEyes.png");
image(face,0,0);
size(600,800);
face.resize(600, 800);
}
void draw() {
  
  fill(mouseX, 100, mouseY);
ellipse(372, 211, 100, 100);
ellipse(248, 202, 125, 125);
fill(0,0,0);
  ellipse(372, 211, 25, 25);
ellipse(248, 202, 30, 30);
}
