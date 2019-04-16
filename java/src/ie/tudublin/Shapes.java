package ie.tudublin;

import processing.core.PApplet;

public class Shapes
{
    private float x;
    private float y;
    private float diameter;
    private float radius;
    //private float radius;


    UI ui;

    public Shapes(UI ui, float x, float y, float diameter, float radius)
    {
        this.ui = ui;
        this.x = x;
        this.y = y -250 ;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.fill(255);
        ui.ellipse(x, y, diameter,diameter);
        ui.fill(255);
        ui.beginShape();
        ui.vertex(400,100);
        ui.vertex(250,170);
        ui.vertex(300,107);
        ui.vertex(410,100);
        ui.vertex(250,420);
        ui.endShape();
    }
    // public void beginShape()
    // {
    //     ui.vertex(135,133);
    //     ui.vertex(364,157);
    //     ui.vertex(130,310);
    //     ui.endShape();
    // }
}
