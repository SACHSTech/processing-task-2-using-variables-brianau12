import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(200, 200);
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
    rect((float) (width/4), (float) (height/2), (float) (width/2), (float) (height/(400.0/150.0)));
    triangle((width/2), (height/4), (float) (width/(400.0/300.0)), (float) (height/2), (float) (width/4), (float) (height/2));

    stroke(0);
    fill(255, 255, 255);
    rect((float) (width/(400.0/163.0)), (float) (height/(400.0/260.0)), (float) (width/(400.0/75.0)), (float) (height/(400.0/90.0)));
    line((float) (width/2), (float) (height/(400.0/260.0)), (float) (width/2), (float) (height/(400.0/350.0)));

    stroke(0);
    fill(200, 200, 200);
    ellipse((float) (width/(400.0/207.0)), (float) (height/(400.0/310.0)), (float) (width/(400.0/7)), (float) (height/(400.0/7))); 

    stroke(0);
    fill(40, 176, 59);
    rect((float) (0), (float) (height/(400.0/350.0)), (float) (width), (float) (height/4));

    stroke(0);
    fill(240, 252, 61);
    ellipse((float) (width/(400.0/330.0)), (float) (height/(400.0/60.0)), (float) (width/8), (float) (height/8));

    stroke(0);
    fill(255, 255, 255);
    rect((float) (width/(400.0/177.0)), (float) (height/(400.0/139.0)), (float) (width/(80.0/9)), (float) (height/8));
    line((float) (width/(400.0/177.0)), (float) (height/(80.0/33.0)), (float) (width/(200.0/111.0)), (float) (height/(80.0/33.0)));
    line((float)  (width/2), (float) (height/(20.0/7)), (float) (width/2), (float) (height/(100.0/47.0)));
  }
  
  // define other methods down here.
}