package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Hud
{
    private static final int RECT_X = 20;
    private static final int RECT_Y = RECT_X;
    private static final int RECT_WIDTH = 100;
    private static final int RECT_HEIGHT = RECT_WIDTH; 
    private float x = 20;
    private float y = x;
    private float width= 100;
    private float height= width;
    private float hud;
    private String text;
    private String text2;
    private float i = 0;
    private float j = 0;
    private float number = 0;
    //private long timeoutMillis = 5;
    UI ui;

    public Hud(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.hud = hud;
        this.text = text;
        this.text2 = text2;
    }


    public void Wait() //throws InterruptedException 
    {

        for(i= 0; i<5; i++)
        {
           long timeoutMillis = 5;
           int nanos = 5;
            System.out.println(number);
            number ++;
           //this.Sleep(timeoutMillis * nanos);
           //System.out.println(number);


        }
        if(number == 100)
        {
            number =0;
        }
    }



    // private void Sleep(long l) {
    // }

    public void render()
    {
        float i = 0;
        float j =0;
         // draw the rectangle here
         ui.noFill();
    //   ui.line(x + 520, y - 30, width + 170, height + 10);
         ui.line(100, 100, 720, 99);//top centre
         ui.line(100, 100, 720, 99);//top centre
         ui.line(100, 500, 720, 501); //bottom centre
         ui.line(100, 500, 720, 501); //bottom centre
         ui.line(-100, 300, 100, 500); //bottom left
         ui.line(-100, 300, 100, 500); //bottom left
         ui.line(1000, 80, 720, 500); //bottom right
         ui.line(1000, 80, 720, 500); //bottom right
         ui.line(1000, 500, 720, 100); //top right
         ui.line(1000, 500, 720, 100); //top right
         ui.line(-100, 300, 100, 100); //top left
         ui.line(-100, 300, 100, 100); //top left

         ui.textAlign(PApplet.CENTER, PApplet.CENTER);
         ui.text(text, (x + 570)+ width * 0.5f, y + height * 0.5f);
      //ui.text(text2, (x + 570)+ width * 0.5f, y + height * 0.5f);

    
    }

    
    
}