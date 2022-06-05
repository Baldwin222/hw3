package ge.ufc.Main;

import java.util.Arrays;

import static ge.ufc.Main.Rectangle.*;


public class Main {
    public static void main(String[] args) {
        Rectangle R1= new Rectangle(17,50);
        System.out.println(R1.getHeight()+" "+R1.getWidth());



        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(3,7),
                new Rectangle(4,5),
                new Rectangle(6,7),
                new Rectangle(33,8),
                new Rectangle(2,7)
        };


        System.out.println(MaxArea(rectangles));


    }

}


