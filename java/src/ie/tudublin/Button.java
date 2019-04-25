package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private float d;
    
    public Button(UI ui, float x, float y, float width, float height, String text,float d)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render()
    {
       // ui.noFill();
        // ui.stroke(255);
        // ui.rect(270, 130, 40, 40);


       if(ui.mousePressed)
        {
           // if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
           if(ui.mouseX == 300 && ui.mouseX == 140 && ui.mouseY == 30 && ui.mouseY == 30)
            {
               // i += 1;
                //System.out.println(i);
                ui.fill(255);
                ui.rect(250, 100, 200, 400);

                //ui.delay(200);//delays the button so that it cannot increment by more than one
            }
          //   if((i % 2) == 0)
          // {
          //   //ui.ellipse(337, 325, 30, 30);
          //   ui.fill(255);
          //   ui.rect(250, 100, 200, 400);

          // }
        }




        // if(ui.mousePressed)
        // {
        //     if(ui.mouseX == 300  && ui.mouseY == 140)
        //     {
        //         i += 1;
        //         //System.out.println(i);
        //         //ui.delay(200);//delays the button so that it cannot increment by more than one
        //     }

        //     if((i % 2) == 0)
        //   {
        //     //ui.ellipse(337, 325, 30, 30);
        //     ui.fill(255);
        //     ui.rect(250, 100, 200, 400);

        //   }
        // }
        //if((i % 2) == 0) //and if((i % 2) != 0) 

    }


    public void mouseClicked() {
        if (d < 160) {
          System.out.println("Hi");
        } 
      }
}