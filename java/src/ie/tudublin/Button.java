/* OOP Assignment 2018-2019
    Conor Monahan C16475956 DT282/2
    Button class. This class draws and displays buttons which appear near the bottom of the screen.
    Two buttons, one will change the colour of the 'speed bar' which indicates how fast the spaceship is going by using a moving ball. The second button enables to user to encounter a meteor shower in space. The meteors travel diagonally from left to right of the screen, then come back and forth.

*/

package ie.tudublin;
import java.util.ArrayList;
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

    }


    public void Eoe2()
    {
        ui.stroke(255);
        ui.fill(0,255,0);
        ui.rect(70, 553, 230, 25);
        ui.fill(255);

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
                }
        }


        

        if(j % 2 == 0)
        {
            Shower();
        }


        if(k % 2 == 0)
        {
            Eoe2();
        }



    }

}