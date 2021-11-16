import java.awt.*;

public class Square extends Rectangle{

    public Square(int length,Color color){
        super(length,length,color);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        super.setLength(width);
        super.setWidth(width);
    }
    @Override
    public void setBoundingBox(int widthb, int heightb){
        length = width = widthb;
    }

}