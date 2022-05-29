package ge.ufc.main;
import  ge.ufc.main.Rectangle;
public class HelloWorld {
    public static void main(String[] args) {
Rectangle rectangle1= new Rectangle();
Rectangle rectangle2= new Rectangle();
rectangle2.SetLength(13);
rectangle2.SetWidth(15);
rectangle1.SetWidth(14);
rectangle1.SetLength(16);
System.out.println(rectangle1.compareato(rectangle2));
System.out.println(rectangle2.compareato(rectangle1));

    }
}
