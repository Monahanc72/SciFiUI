package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;


public class Hud
{
    private static final int RECT_X = 20;
    private static final int RECT_Y = RECT_X;
    private static final int RECT_WIDTH = 100;
    private static final int RECT_HEIGHT = RECT_WIDTH; 
    private float x = 20;
    private float y = x;
    private float width= 100;
    private float height= width;
   // private float hud;
    private String text;
    private String text2;

    private float number = 0;
    //private long timeoutMillis = 5;
    UI ui;

    public Hud(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
       // this.hud = hud;
        this.text = text;
    }

    public void render()
    {
         // draw the rectangle here
          ui.fill(255);
         // ui.line(x + 520, y - 30, width + 170, height + 10);
          ui.line(100, 100, 720, 99);//top centre
          ui.line(100, 100, 720, 99);//top centre
          ui.line(100, 500, 720, 501); //bottom centre
          ui.line(100, 500, 720, 501); //bottom centre
          ui.line(-100, 300, 100, 500); //bottom left
          ui.line(-100, 300, 100, 500); //bottom left
          ui.line(1000, 80, 720, 500); //bottom right
          ui.line(1000, 80, 720, 500); //bottom right
          ui.line(1000, 500, 720, 100); //top right
          ui.line(1000, 500, 720, 100); //top right
          ui.line(-100, 300, 100, 100); //top left
          ui.line(-100, 300, 100, 100); //top left

        //inner screen
        // ui.line(450, 500, 250, 500); //bottom
        // ui.line(450, 100, 250, 100); //top
        // ui.line(450, 500, 450, 100); //right side
        // ui.line(250, 500, 250, 100); //left side
        // ui.fill(105);
        // ui.rect(250,100,200,20); //time bar
        // ui.rect(250,450,200,50); //lower bar
        // //outter screen 
        // ui.noFill();
        // ui.line(450, 550, 250, 550); //bottom
        // ui.line(450, 50, 250, 50); //top
        // ui.line(480, 500, 480, 100); //right side
        // ui.line(220, 500, 220, 100); //left side
        // ui.ellipse(337, 525, 30, 30); //circle
        // ui.beginShape();
        // ui.curveVertex(220,0);
        // ui.curveVertex(20,200);
        // ui.curveVertex(220,200);
        // ui.curveVertex(240,200);
        // ui.curveVertex(450,0);
        // ui.endShape();

         

         ui.textAlign(PApplet.CENTER, PApplet.CENTER);
         ui.text(text, (x + 570)+ width * 0.5f, y + height * 0.5f);
      //ui.text(text2, (x + 570)+ width * 0.5f, y + height * 0.5f);

    
    }

    
    
}