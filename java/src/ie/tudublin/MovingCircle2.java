package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class MovingCircle2
{
    private float x = 1;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    private float width;
    private float height;
    private float PI = 3;
    UI ui;
    private PVector pos;

    public MovingCircle2(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x - 250;
        this.y = y -35 ;
        this.diameter = diameter;
        pos = new PVector(x, y);
        radius = diameter / 2;
    }
    
    public void render()
    {

    
            //    ui.translate(width/2, height/2);
            //    ui.rotate(PI/3);   
            //    ui.fill(255);
            //    ui.noStroke();
            //    ui.rect(100,100,20,20); 
            ui.fill(255,200,12);
            ui.ellipse(270, 160, 80, 80);  // White rectangle

            ui.pushMatrix();
            ui.translate(30, 20);
            ui.fill(0,0,100);  
            ui.ellipse(180, 200, 90, 90);  // neptune
            ui.popMatrix();

            ui.fill(100,0,0);  
            ui.ellipse(150, 300, 120, 120);  // Mars


    }
    public void keychk()
    {
            ui.stroke(255);
            ui.fill(255,30,10);
            ui.ellipse(x + 100, y - 300, diameter, diameter);
            dx += x;
            if ((x > ui.width - radius -400) || (x < radius +80 ))
            {
                dx *= 1;
            }
    }
}
