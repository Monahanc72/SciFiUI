
package ie.tudublin;

import processing.core.PApplet;

public class Stars extends PApplet
{
        public static void main(String []args){
           System.out.println("Hello World");
           //declaring and initializing 2D array  
           int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
           int starz[] = new int[5];
           int[] colors = new int[starz.length];
           starz[0] = 4;
           starz[1] = 10;
           starz[2] = 10;
           starz[3] = 10;
           starz[4] = 10;

             // Assign the color array
        // for(int i = 0 ; i < starz.length ; i ++)        
        // {
        //     colors[i] =(int) random(0, 255);
        // }

           //printing 2D array  
           for(int i=0;i<3;i++)
           {    
               for(int j=0;j<3;j++)
               {  	
                   System.out.print(arr[i][j]+" ");  
               }				
                   System.out.println();  
           }  

           for( float f:starz)
           {
            //System.out.println(f);
            System.out.println("*");
           }
       }
    }