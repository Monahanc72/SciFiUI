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
    private float PI = 3;
    private float height;
    private float width;
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
        // ui.rect(200,150,10,10);
        // ui.rect(218,250,10,10);
        // ui.rect(270,250,10,10);
        // ui.rect(255,273,10,10);
        // ui.rect(325,129,10,10);
        // ui.rect(290,218,10,10);
        // ui.rect(305,249,10,10);
        // ui.rect(315,196,10,10);
        // ui.rect(325,237,10,10);
        // ui.rect(335,210,10,10);
        // ui.rect(345,250,10,10);
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
        }
         //if(dx > 1.2 || dx < 0)
         if(dx > 1.2)
           // if(dx > 49)
            {
               // System.out.println("Hi");
                // ui.fill(25, 96, 21);
                 //ui.rect(70, 503, 230, 25);
               // dx = 0;
               ui.fill(255);
               //ui.translate(width/2, height/2);
               //ui.rotate(PI/3);
               ui.rect(100,200,3,3);
               ui.rect(200,110,3,3);
               ui.rect(300,130,3,3);
               ui.rect(400,180,3,3);
               ui.rect(100,450,3,3);
               ui.rect(618,250,3,3);
               ui.rect(550,110,3,3);
               ui.rect(200,313,3,3);
               ui.rect(300,229,3,3);
               ui.rect(400,248,3,3);
               ui.rect(500,279,3,3);
               ui.rect(618,492,3,3);
               ui.rect(500,476,3,3);
               ui.rect(400,489,3,3);
               ui.rect(300,433,3,3);
               ui.rect(700,474,3,3);
               ui.rect(120,484,3,3);
               ui.rect(160,434,3,3);
               ui.rect(700,414,3,3);
               ui.rect(650,385,3,3);

               ui.rect(119,55,3,3);
               ui.rect(219,79,3,3);
               ui.rect(319,39,3,3);
               ui.rect(419,110,3,3);
               //

            }

            if(dx < 0)
        {
            ui.fill(255);
            ui.rect(120,190,3,3);
            ui.rect(220,170,3,3);
            ui.rect(346,165,3,3);
            ui.rect(405,123,3,3);
            ui.rect(505,450,3,3);
            ui.rect(518,250,3,3);
            ui.rect(496,270,3,3);
            ui.rect(234,313,3,3);
            ui.rect(372,229,3,3);
            ui.rect(472,248,3,3);
            ui.rect(572,279,3,3);
            ui.rect(672,490,3,3);
            ui.rect(172,470,3,3);
            ui.rect(113,480,3,3);
            ui.rect(213,309,3,3);
            ui.rect(313,366,3,3);
            ui.rect(413,462,3,3);
            ui.rect(513,472,3,3);
            ui.rect(109,409,3,3);
            ui.rect(209,309,3,3);
            ui.rect(609,309,3,3);
            ui.rect(600,366,3,3);
            ui.rect(59,309,3,3);
            ui.rect(89,339,3,3);
            ui.rect(19,29,3,3);
            ui.rect(269,29,3,3);
            ui.rect(319,29,3,3);
            ui.rect(419,29,3,3);
            ui.rect(519,29,3,3);
        }





        //}

       //System.out.println(x);
        //System.out.println(dx);
    }
}
