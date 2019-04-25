package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class MovingCircle
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    private float i;
    private PVector pos;
    UI ui;

    public MovingCircle(UI ui, float x, float y, float diameter)
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
        ui.fill(200,21,50);
        ui.rect(70, 553, 230, 25);
        ui.stroke(255);
        ui.fill(255);
        ui.ellipse(x, y, diameter, diameter);
        ui.stroke(255);
        ui.fill(51, 191, 88);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    }

    public void update()
    {
        x += dx;
        if ((x > ui.width - radius -500) || (x < radius +80 ))
        {
            dx *= -1.05;
            
            //if(dx > 1.2 || dx < 0)
            if(dx > 49)
            {
               // System.out.println("Hi");
                 ui.fill(25, 96, 21);
                 ui.rect(70, 503, 230, 25);
                dx = 0;
            }
        }

       //System.out.println(x);
        System.out.println(dx);
    }
}
