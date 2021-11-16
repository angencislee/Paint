import java.awt.*;
public class Ellipse extends Figure{

    protected int VerticalAxis;
    protected int HorizontalAxis;
    final double pi=Math.PI;

    public Ellipse(int VerticalAxis, int HorizontalAxis, Color color){
        super(new Point(0,0),color);
        this.VerticalAxis = VerticalAxis;
        this.HorizontalAxis = HorizontalAxis;
    }


    public void setVerticalAxis(int VerticalAxis) {
        this.VerticalAxis = VerticalAxis;
    }

    public void setHorizontalAxis(int HorizontalAxis) {
        this.HorizontalAxis = HorizontalAxis;
    }

    public double getPerimeter(){
        return 2*pi*Math.sqrt((Math.pow(VerticalAxis,2)+Math.pow(HorizontalAxis,2))/2);
    }

    public double getSurface(){
        return pi*VerticalAxis*HorizontalAxis/4;
    }

    @Override
    public void setBoundingBox(int widthb, int heightb){
        VerticalAxis = widthb;
        HorizontalAxis = heightb;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(origin.x,origin.y,VerticalAxis,HorizontalAxis);
    }

    public int getVerticalAxis() {
        return VerticalAxis;
    }

    public int getHorizontalAxis() {
        return HorizontalAxis;
    }
}
