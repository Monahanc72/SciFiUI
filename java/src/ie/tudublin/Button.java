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
    private float x2 = x;
    private int j = 1;
    private float y;
    private float y1 = y;
    private float y2 = y;
    private float width = 2;
    private float height = 2;
    private float  border;
    private float k;
    private float gap;
    private String text;
    private float dx = 1;
    private float radius =50;
    private float diameter = 10;

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
        //2
        ui.rect(x2 +500, y2 +550, 80, 40);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, (x2 +421) + 40 * 0.5f, (y2 + 550) + 20 * 0.5f);

    } 


    public void Shower()
    {
        ui.stroke(255);
        ui.fill(255,0,0);
        ui.ellipse(x +175, y + 50, 10, 10);
        ui.ellipse(x +150, y + 100, 10, 10);
        ui.ellipse(x +125, y + 150, 10, 10);
        ui.ellipse(x +100, y + 200, 10, 10);
        ui.ellipse(x +75, y + 250, 10, 10);
        ui.ellipse(x +50, y + 300, 10, 10);
        ui.ellipse(x +25, y + 350, 10, 10);
        ui.ellipse(x +0, y + 400, 10, 10);
        // ui.ellipse(x  -50, y + 200, 10, 10);
        // ui.ellipse(x - 25, y + 250, 10, 10);

    }


    public void Eoe2()
    {
        ui.stroke(255);
        ui.fill(0,255,0);
        ui.rect(70, 553, 230, 25);
        ui.fill(255);
        ui.ellipse(x + 100, y + 100, diameter, diameter);
       // ui.text("Hi");

    }
    

    public void ArekIsGay()
    {

        x += dx;
        y +=dx;
        if ((x > ui.width) || (x < 0 ) || (y > ui.width) || (y < 0 ))
        {
            dx *= -1.00;
            System.out.println(dx);
        }

        if(dx > 50)
        {
            dx = 1;
        }

    }

    // public void ArekIsGay2()
    // {

    //     x += dx;
    //     y +=dx;
    //     if ((x > ui.width) || (x < 0 ) || (y > ui.width) || (y < 0 ))
    //     {
    //         dx *= -2.10;
    //     }
    // }


    public void mouseClicked()
   {
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


//2
        if (ui.mousePressed)
        {
                if (ui.mouseX > x2 +500 && ui.mouseX < x2 +500 + 40  && ui.mouseY > y2 +550 && ui.mouseY < y2 +550 + 20)

                {
                
                    k+=1;
                   ui.delay(200);
                   //System.out.println(j);
                }
        }


        

        if(j % 2 == 0)
        {
            //System.out.println("ArekIsGay");
            // ui.fill(255);
            // ui.rect(100, 100, 30, 30);
            Shower();
           //Eoe2();
            //ArekIsGay();
        }


        if(k % 2 == 0)
        {
            //System.out.println("ArekIsGay");
            // ui.fill(255);
            // ui.rect(100, 100, 30, 30);
          //  Eoe();
            Eoe2();
            //ArekIsGay();
        }



    }

}