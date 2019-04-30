/* OOP Assignment 2018-2019
    Conor Monahan C16475956 DT282/2
    Radar class. This class draws and displays a radar which appears in the lower corner of the screen.
    A line iterates around the radar and displays 3 points on the circle to in coming space crafts.

*/

package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private float diameter = 5;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;
    private float opacity = 0;
    private float opacity2 = 0;
    private float opacity3 = 0;

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
        ui.ellipse(pos.x + 300, pos.y +150, radius * (float) 2.50, radius * (float) 2.50);
        float x2 = (pos.x + 300)+ (float) Math.sin(theta) * radius;
        float y2 = (pos.y +150) - (float) Math.cos(theta) * radius;
        ui.line(pos.x +300, pos.y +150, x2 +10, y2);


        ui.ellipse(pos.x + 300, pos.y +150, radius * (float) 1.75, radius * (float) 1.75);
        ui.ellipse(pos.x + 300, pos.y +150, radius * (float) 1.0, radius * (float) 1.0);
        ui.ellipse(pos.x + 300, pos.y +150, radius * (float) 0.25, radius * (float) 0.25);


    if(x2 == (pos.x + 300) + (radius * 1))
    {
        opacity = 255;
    }
    else{
        opacity--;
    }


    if(x2 == (pos.x + 300) - (radius * 1))
    {
        opacity2 = 255;
    }
    else {
        opacity2 --;
    }

    if(x2 == (pos.x + 300) + (radius * 1))
    {
        opacity3 = 255;
    }
    else{
        opacity3--;
    }


    ui.stroke(opacity,opacity,opacity);
    ui.fill(opacity);
    ui.ellipse((pos.x + 290) + (radius * (float)1), pos.y +150, diameter, diameter);
    ui.stroke(opacity2,opacity2,opacity2);
    ui.fill(opacity2);
    ui.ellipse((pos.x + 305) -(radius * 1), pos.y +132, diameter, diameter);
    ui.fill(255);
    ui.stroke(opacity3,opacity3,opacity3);
    ui.fill(opacity3);
    ui.ellipse((pos.x + 322) -(radius * 1), pos.y +185, diameter, diameter);
    ui.fill(255);
    }

    float timeDelta = 1.f / 300.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
        //crosshair for aiming
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(ui.mouseX, ui.mouseY, 50, 50);
        ui.stroke(255,0,0);
        ui.line(ui.mouseX, ui.mouseY, ui.mouseX + 25, ui.mouseY);
        ui.line(ui.mouseX, ui.mouseY, ui.mouseX - 25, ui.mouseY);
        ui.line(ui.mouseX, ui.mouseY, ui.mouseX, ui.mouseY + 25);
        ui.line(ui.mouseX, ui.mouseY, ui.mouseX, ui.mouseY - 25);

    }

    public void keychk()
    {
        if (ui.mousePressed)
		{
            ui.stroke(255,0,0);
            ui.noFill();
            ui.line(400, 500, ui.mouseX, ui.mouseY);
        }
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