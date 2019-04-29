package ie.tudublin;
import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
import processing.core.PApplet;

public class Button
{
    ArrayList<Button> buttons = new ArrayList<Button>();
    UI ui;
    private float x;
    private int j = 0;
    private float y;
    private float width = 2;
    private float height = 2;
    private float  border;
    private float gap;
    private String text;

    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        gap = width;
        border = height;
    }

    public void render()
    {
        ui.noFill();
        ui.stroke(255);
        ui.rect(x +100, y +200, 40, 20);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, (x +100) + 40 * 0.5f, (y + 200) + 20 * 0.5f);
    } 


    public void mouseClicked()
   {

        //   // The best way!!
        //   if ((ui.mouseX > border && ui.mouseX < border + width))
        //   {
        //       if ((ui.mouseY - border) % (height + gap) < height)
        //       {
        //           which = (int)((ui.mouseY - border) / (height + gap));
        //       }
        //       //which++;
        //   }
        //   if (which != -1)
        //    {
        //        //System.out.println("cheese");
        //        System.out.println(buttons.get(which));
        //    }
            
        // This also works
        
        if (ui.mousePressed)
        {
                if (ui.mouseX > x +100 && ui.mouseX < x +100 + 40  && ui.mouseY > y +200 && ui.mouseY < y +200 + 20)

                {
                
                    j+=1;
                   ui.delay(200);
                   System.out.println(j);
                }
        }
        

        if(j % 2 == 0)
        {
            System.out.println("ArekIsGay");
            ui.fill(255);
            ui.rect(100, 100, 30, 30);
        }
    }

}