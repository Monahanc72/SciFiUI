package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;



    // public static void arek(UI ui,String[] args)
    // {
    //     ArrayList listTest = new ArrayList( );
    //     listTest.add( "first item" );
    //     listTest.add( "second item" );
    //     listTest.add( "third item" );
    //     listTest.add( 7 );
    //     System.out.println("whole chatski is =" + listTest);
    
    public Button(UI ui, float x, float y, float width, float height, String text)
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
        ui.noFill();
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);



        ArrayList listTest = new ArrayList( );
        listTest.add( "first item" );
        listTest.add( "second item" );
        listTest.add( "third item" );
        listTest.add( 7 );
        System.out.println("whole chatski is =" + listTest);
    }
}