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
    private float x1 = x;
    private int j = 1;
    private float y;
    private float y1 = y;
    private float width = 2;
    private float height = 2;
    private float  border;
    private float gap;
    private String text;
    private float dx = 1;
    private float radius =50;

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
        ui.rect(x1 +400, y1 +550, 80, 40);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, (x1 +421) + 40 * 0.5f, (y1 + 550) + 20 * 0.5f);

    } 


    public void Eoe()
    {
        ui.stroke(255);
        ui.fill(255,0,0);
        ui.ellipse(x +55, y + 50, 10, 10);
        ui.ellipse(x +50, y + 100, 10, 10);
        ui.ellipse(x +45, y + 150, 10, 10);

    }

    public void ArekIsGay()
    {

        x += dx;
        y +=dx;
        if ((x > ui.width) || (x < 0 ) || (y > ui.width) || (y < 0 ))
        {
            dx *= -2.10;
        }
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
                if (ui.mouseX > x1 +400 && ui.mouseX < x1 +400 + 40  && ui.mouseY > y1 +550 && ui.mouseY < y1 +550 + 20)

                {
                
                    j+=1;
                   ui.delay(200);
                   System.out.println(j);
                }
        }
        

        if(j % 2 == 0)
        {
            //System.out.println("ArekIsGay");
            // ui.fill(255);
            // ui.rect(100, 100, 30, 30);
            Eoe();
            //ArekIsGay();
        }
    }

}