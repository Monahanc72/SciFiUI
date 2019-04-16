package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private float diameter = 1;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;
    private float opacity = 0;
    private float opacity2 = 0;
    private float opacity3 = 0;
    private float i = 255;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
    }

    public void render()
    {
    
        ui.noFill();
        ui.stroke(0,204,0);
        ui.ellipse(pos.x + 320, pos.y -350, radius * (float) 2, radius * (float) 2);
        float x2 = (pos.x + 320)+ (float) Math.sin(theta) * radius;
        float y2 = (pos.y -350) - (float) Math.cos(theta) * radius;
        ui.line(pos.x +320, pos.y -350, x2, y2);


        ui.ellipse(pos.x + 320, pos.y -350, radius * (float) 1.50, radius * (float) 1.50);
        ui.ellipse(pos.x + 320, pos.y -350, radius * (float) 1, radius * (float) 1);
        ui.ellipse(pos.x + 320, pos.y -350, radius * (float) .50, radius * (float) .50);
        // ui.stroke(opacity,opacity,opacity);
        // ui.fill(opacity);
        // ui.ellipse((pos.x - 280) + (radius * 1), pos.y -300, diameter, diameter);
        // ui.stroke(opacity2,opacity2,opacity2);
        // ui.fill(opacity2);
        // ui.ellipse((pos.x - 250) -(radius * 1), pos.y -300, diameter, diameter);
        // ui.fill(255);
        //opacity --;
        //ui.fill(opacity);
        //ui.stroke(255,255,255,opacity);
        //ui.ellipse(ui.width/5, ui.height /5, diameter, diameter);

        // if( opacity == 0)
        // {
        //     opacity ++;
        // }

        // if( opacity == 255)
        // {
        //     opacity --;
        // }

        // for(i=255; i>0;i--)
        // {
        //     opacity --;
        // }


        // for(i=0; i< 255;i++)
        // {
        //     opacity ++;
        // }


    if(x2 == (pos.x + 320) + (radius * 1))
    {
        opacity = 255;
    }
    else{
        opacity--;
    }

    // if(y2 == (pos.y - 300) + (radius * 1))
    // {
    //     opacity -= 255;
    // }

    if(x2 == (pos.x + 320) - (radius * 1))
    {
        opacity2 = 255;
    }
    else {
        opacity2 --;
    }



    ui.stroke(opacity,opacity,opacity);
    ui.fill(opacity);
    ui.ellipse((pos.x + 315) + (radius * 1), pos.y -350, diameter, diameter);
    ui.stroke(opacity2,opacity2,opacity2);
    ui.fill(opacity2);
    ui.ellipse((pos.x + 325) -(radius * 1), pos.y -340, diameter, diameter);
    ui.fill(255);
    ui.stroke(opacity3,opacity3,opacity3);
    ui.fill(opacity3);
    ui.ellipse((pos.x - 250) -(radius * 1), pos.y -300, diameter, diameter);
    ui.fill(255);

    // if(y2 == (pos.y - 300) - (radius * 1))
    // {
    //     opacity2 -= 255;
    // }

    //System.out.println("yes");
    }

    float timeDelta = 1.0f / 300.0f;
    //float timeDot = 1.0f / 300.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
        //theta2 += timeDot * frequency;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    
}