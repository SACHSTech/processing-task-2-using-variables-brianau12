import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(52, 186, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(0);  
    fill(268, 168, 52);
    rect((float) width/4, (float) height/2, (float) width/2, (float) height/(400/150));
    triangle(width/2, height/4, (float) width/(400/300), (float) height/2, (float) width/4, (float) height/2);

    stroke(0);
    fill(255, 255, 255);
    rect((float) width/(400/163), (float) height/(400/260), (float) width/(400/75), (float) height/(400/90));
    line((float) width/2, (float) height/(400/260), (float) width/2, (float) height/(400/350));

    stroke(0);
    fill(200, 200, 200);
    ellipse((float) width/(400/207), (float) height/(400/310), (float) width/(400/7), (float) height/(400/7)); 

    stroke(0);
    fill(40, 176, 59);
    rect((float) 0, (float) height/(400/350), (float) width, (float) height/4);

    stroke(0);
    fill(240, 252, 61);
    ellipse((float) width/(400/330), (float) height/(400/60), (float) width/8, (float) height/8);

    stroke(0);
    fill(255, 255, 255);
    rect((float) width/(400/177), (float) height/(400/139), (float) width/(80/9), (float) height/8);
    line((float) width/(400/177), (float) height/(80/33), (float) width/(200/111), (float) height/(80/33));
    line((float)  width/2, (float) height/(20/7), (float) width/2, (float) height/(100/47));
  }
  
  // define other methods down here.
}