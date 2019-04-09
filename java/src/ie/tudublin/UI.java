package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
//import processing.core.PImage;

public class UI extends PApplet
{
    Button b, z;
    MovingCircle mc;
    Hud hud, wait;

    //Wait wait;

    //PImage img;

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
      // img = loadImage("images/antartica4.png");
        //img = loadImage("images/navy.png");
    }

    public void setup()
    {
        b = new Button(this, 100, 550, 50, 30, ""); //x,y,w,h
        mc = new MovingCircle(this, width / 2, height * .75f, 20);
        radar = new Radar(this, 1, width / 2, height / 2, 35);
        hud = new Hud(this, 20, 20, 100, 100, "April 3rd 2019 \n Antartica ");
        wait = new Hud(this,0,0,100,100, "");
       // z = new Button(this,100,550,50,30, "");
    }

    Radar radar;

    public void draw()
    {
        background(0);
        b.render();

        mc.update();
        mc.render();

        hud.render();

        wait.Wait();

        //radar.update();
        //radar.render();


         if (checkKey(LEFT))
         {
             radar.update();
             radar.render();
        }
        
        mouseClicked();
    }

}

