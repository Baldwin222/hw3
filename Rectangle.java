package ge.ufc.Main;



public class Rectangle {
    private int height;
    private int width;

    private static final int MaxHeight;
    private static final int  MaxWidth;


    static {
        MaxWidth=20;
        MaxHeight=25;
    }

    public Rectangle(int width){
        setWidth(width);
    }
    public Rectangle(int width,int height) {
        setHeight(height);
        setWidth(width);

    }
    public Rectangle (){

    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        if(this.height>MaxHeight){
            this.height=MaxHeight;
        }
    }

    public void setVals (int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        if (this.width>MaxWidth){
            this.width=MaxWidth;
        }
    }

    private int getArea(){
     return width*height;
    }

    public static Rectangle MaxArea(Rectangle[] recs){
        int maxVal=-99999;
        Rectangle maxRec = new Rectangle();

        for(int i=0; i < recs.length; i++){
            if (recs[i].getArea()>maxVal){
                maxVal=recs[i].getArea();
                maxRec = recs[i];
            }
        }
        return maxRec;
    }
    @Override
    public String toString (){
        return "Rectangle width = " + width + " , height = " + height;
    }
}













