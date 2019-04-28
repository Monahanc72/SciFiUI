package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
//import processing.core.PImage;

public class UI extends PApplet
{
    private float x;
    private float y;
    Button b, z;
    MovingCircle mc;
    MovingCircle2 mc2;
    Hud hud;
    Radar radar;
    Shapes sh;
    Frame fr;
    Stars str;

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
        b = new Button(this, 100, 550, 50, 30, "",0); //x,y,w,h
        z = new Button(this,600,550,100,50, "Warning",0);
        mc = new MovingCircle(this, width / 2, height * .75f, 20);
        mc2 = new MovingCircle2(this,width /2, height * .75f, 20);
        radar = new Radar(this, 1, width / 2, height / 2, 35);
        hud = new Hud(this, 20, 20, 100, 100, "April 3rd 2019 \n Antartica ");
        sh = new Shapes(this,100,550,5,3);
        fr = new Frame(this, x,y,width,height);
        str = new Stars(this,x,y,width,height);
    }

    public void draw()
    {
        background(0);
       // hud.render();
        b.render();
        b.mouseClicked();
        //z.render();
        mc.update();
        mc.render();
        mc2.render();
        //mc.keychk();
        //sh.render();
        radar.render();
        radar.update();
        //hud.render();   
        
        fr.Eoe();
        radar.keychk();
       // str.Eoe();

       if (keyCode == LEFT)
       {
           mc2.keychk();
       }
    }

	public char[] get(int which) {
		return null;
	}

}

