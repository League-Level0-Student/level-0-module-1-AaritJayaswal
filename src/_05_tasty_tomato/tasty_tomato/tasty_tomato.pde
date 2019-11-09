void setup() {
    size(750, 750);
}
void draw() {
    fill(100,55,0);
ellipse(375, 375, 500, 500);
fill(255,50,0);
ellipse(375,375,470,470);
fill(255,150,0);
ellipse(375,375,450,450);

PImage pepperoni = loadImage("pepperoni2.png");
pepperoni.resize(75, 150);
image(pepperoni, 375, 375);
PImage mushroom = loadImage("mushroom5.png");
mushroom.resize(75, 150);
image(mushroom, 375, 375);
}
