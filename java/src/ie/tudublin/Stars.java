package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;


public class Stars
{
    
    private float x = 20;
    private float y = x;
    private float width= 450;
    private float height= 450;
    private float PI = 3;
    UI ui;

    public Stars(UI ui, float x, float y, float width, float height)
    {
        this.ui = ui;
    }

    public void Eoe()
    {
         // draw the rectangle here

         // ui.translate(width/2, height/2);
          //ui.rotate(PI/3);
          //ui.rect(322, 52, 3,3); 
        //ui.background(0);
        //ui.fill(0,10);
       // ui.rect(0,0,width,height);

        //ui.fill(255);
       // ui.ellipse(ui.random(width), ui.random(height), 20, 20);
       ui.fill(255);
       ui.rect(146, ui.random(height), 2,2);
       ui.rect(156, ui.random(height), 2,2);
      // ui.rect(146, 26, 2,2);
    }

    
    
}