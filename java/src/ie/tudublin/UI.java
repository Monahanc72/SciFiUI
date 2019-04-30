//Conor Monahan C16475956 Dt282/2

package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    private float x;
    private float y;
    Button b;
    MovingCircle mc;
    MovingCircle2 mc2;
    Radar radar;
    Frame fr;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
       size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
        b = new Button(this, x, y, width, height, "MeteorShower"); //x,y,w,h
        mc = new MovingCircle(this, width / 2, height * .75f, 20);
        mc2 = new MovingCircle2(this,width /2, height * .75f, 20);
        radar = new Radar(this, 1, width / 2, height / 2, 35);
        fr = new Frame(this, x,y,width,height);
    }

    public void draw()
    {
        background(0);
       mc.render2();
        mc.update();
        mc.render();
        mc2.render();
        radar.render();
        radar.update(); 
        radar.keychk();
        fr.Eoe();
        b.render();
        b.mouseClicked();
        b.MoveMeteors();

       if (keyCode == ' ')
       {
           mc2.keychk();
       }
    }

	public char[] get(int which) {
		return null;
	}

}

