package ge.ufc.main;
import ge.ufc.main.Rectangle;
public class Comparearea {
    public static int Comparea(Rectangle Rec1, Rectangle Rec2) {
        if (Rec1.Area() < Rec2.Area()) return -1;
        else if (Rec1.Area() > Rec2.Area()) return 1;
        else return 0;



    }

}
