package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float border = 20;
    private float gap = 20;
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
        ui.noFill();
        ui.stroke(255);
        ui.rect(x + 100, y - 50, width,height);
        
    }


    public void mouseClicked()
  {
         int which = -1;

         // The best way!!
         if ((ui.mouseX > border && ui.mouseX < border + width))
         {
             if ((ui.mouseY - border) % (height + gap) < height)
             {
                 which = (int) ((ui.mouseY - border) / (height + gap));
             }
         }
         if (which != -1)
          {
                  ui.rect(100,50,100,100);
                   
          }
      }
}