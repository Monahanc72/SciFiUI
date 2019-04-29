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
    private float y;
    private float width = 2;
    private float height = 2;
    private float  border = height;
    private float gap = width;
    private String text;

    public void loadProducts()
    {
        Table table = loadTable("cafe.csv", "header");
        for(TableRow tr:table.rows())
        {
            Button b = new Button(tr);
            buttons.add(b);
        }        
    }


    private Table loadTable(String string, String string2) {
        return null;
    }

    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public Button(TableRow tr) {
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
          int which = -1;

          // The best way!!
          if ((ui.mouseX > border && ui.mouseX < border + width))
          {
              if ((ui.mouseY - border) % (height + gap) < height)
              {
                  which = (int)((ui.mouseY - border) / (height + gap));
              }
              //which++;
          }
          if (which != -1)
           {
               //System.out.println("cheese");
               System.out.println(buttons.get(which));
           }
      }
    }