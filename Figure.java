import java.awt.*;
import java.io.Serializable;



public abstract class Figure implements Serializable{

    protected Point origin;
    protected Color color;

    public Figure(Point p,Color color){
        origin = p;
        this.color = color;
    }
    public Figure(){

    }

    public void setOrigin(Point origin){

        this.origin = origin;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract double getPerimeter();

    public abstract double getSurface();

    public abstract void setBoundingBox(int widthb, int heightb);

    public abstract void draw(Graphics g);
}