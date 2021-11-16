import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int x, Color color) {
        super(x, x, color);
    }

    public void setVerticalAxis(int diameter){
        super.setVerticalAxis(diameter);
        super.setHorizontalAxis(diameter);
    }

    public void setHorizontalAxis(int diameter){
        super.setVerticalAxis(diameter);
        super.setHorizontalAxis(diameter);
    }
    public void setBoundingBox(int widthb, int heightb){
        VerticalAxis = HorizontalAxis = heightb;
    }
}