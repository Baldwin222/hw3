package Guga;

public class Rectangle {
    private int length;
    private int width;

    public void SetLength ( int length){
        this.length = length;

    }
    public void SetWidth ( int width){
        this.width = width;

    }
    public int GetLength () {
        return this.length;
    }
    public int GetWidth () {
        return this.width;
    }
    private int Perimeter () {
        return (this.length + this.width) * 2;
    }
    public int compareP (Rectangle rec1){
        if (this.Perimeter()>rec1.Perimeter()) return 1;
        else if (this.Perimeter()<rec1.Perimeter()) return -1;
        else return 0;
    }

}
