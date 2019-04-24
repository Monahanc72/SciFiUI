package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;


public class Frame
{
    private float x = 20;
    private float y = x;
    private float width= 100;
    private float height= width;
    private float PI = 3;
    UI ui;

    public Frame(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
    }

    public void Eoe()
    {
         // draw the rectangle here
          ui.stroke(255);
          ui.fill(255);
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

          ui.translate(width/2, height/2);
          ui.rotate(PI/3);
          ui.rect(-26, -26, 3,3); 

    
    }

    
    
}