


//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 0,191,255 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* tree */
  fill(139,69,19);//color of tree bark
  rect(horizon-10,horizon-30,20,30);//bark of tree
  fill(34,139,34);//color of leaves
  ellipse( horizon,horizon-50, 100,horizon-50  );  // leaves
  
                                            // house

  fill(0);
  text( "My name is Rocky", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  


  /* Creature */
  fill(245,222,179); //color of face
  ellipse(x, y, 80, 80);//face
  fill(176,224,230);//color of eyes
  ellipse(x,y,10,10);//eye
  ellipse(x+40,y,10,10);//eye
  fill(220,20,60);//color of mouth
  rect(x+10,y+10,30,10); //mouth    
 fill(75,0,130);  //color of name
  text( "Rocky", x-10,y-40 );//creatures name

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}


