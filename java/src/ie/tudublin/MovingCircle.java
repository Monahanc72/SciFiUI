//Conor Monahan C16475956 Dt282/2

package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class MovingCircle
{
    private float x;
    private float dx = 1;
    private float dy;
    private float x2 =1;
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
        ui.stroke(255);
        ui.fill(255);
        ui.ellipse(x, y, diameter, diameter);
        ui.stroke(255);
        ui.fill(51, 191, 88);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    }

//second circle
    public void render2()
    {
        ui.noStroke();
        ui.fill(0,0,0);
        ui.rect(1, 553, 70, 25);
        ui.stroke(255);
        ui.fill(0,255,0);
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
        ui.noStroke();
        ui.fill(0,0,0);
        ui.rect(1, 553, 70, 25);
        x += dx;
        if ((x > ui.width - radius -500) || (x < radius +80 ))
        {
            dx *= -1.15;
        }
         if(dx > 1.2)
            {
                //stars
               ui.fill(255);
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
               ui.rect(226,79,3,3);
               ui.rect(323,39,3,3);
               ui.rect(419,110,3,3);
               ui.rect(750,320,3,3);
               ui.rect(750,280,3,3);
               ui.rect(750,380,3,3);
               ui.rect(750,220,3,3);
               ui.rect(550,220,3,3);
               //

            }
            //more stars
            if(dx < 0)
        {
            ui.fill(255);
            ui.rect(120,190,3,3);
            ui.rect(220,170,3,3);
            ui.rect(346,165,3,3);
            ui.rect(405,123,3,3);
            ui.rect(505,450,3,3);
            ui.rect(523,250,3,3);
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
            ui.rect(209,30,3,3);
            ui.rect(6015,309,3,3);
            ui.rect(600,366,3,3);
            ui.rect(59,309,3,3);
            ui.rect(89,339,3,3);
            ui.rect(19,29,3,3);
            ui.rect(269,29,3,3);
            ui.rect(319,29,3,3);
            ui.rect(419,29,3,3);
            ui.rect(519,29,3,3);
            ui.rect(19,250,3,3);
            ui.rect(19,350,3,3);
            ui.rect(50,250,3,3);
            ui.rect(700,30,3,3);
            ui.rect(706,70,3,3);
            ui.rect(702,150,3,3);
            ui.rect(720,50,3,3);
            ui.rect(500,400,3,3);
            ui.rect(400,351,3,3);
            ui.rect(380,422,3,3);
            ui.rect(450,433,3,3);
            ui.rect(680,320,3,3);
            ui.rect(720,320,3,3);
            ui.rect(520,190,3,3);
            ui.rect(590,180,3,3);

        }

        if(dx > 7)
        {
            dx = 1; //resets circle when reaches a certain speed.
        }
    }

    public void keychk()
    {
            ui.stroke(255);
            ui.fill(255,30,10);
            ui.ellipse(x2  + 100, y - 300, diameter, diameter);
            dy += x2;
            if ((x2 > ui.width - radius -400) || (x2 < radius +80 ))
            {
                dy *= 1;
            }
    }
}
