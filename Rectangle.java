import java.awt.*;

public class Rectangle extends Figure{

    protected int length;
    protected int width;

    public  Rectangle(int length, int width, Color color){

        super(new Point(0,0),color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(int i, int j){
        super();
    }
    public Rectangle(){
    }

    public double getPerimeter(){
        return 2*length+2*width;
    }
    public double getSurface(){
        return length*width;
    }

    @Override
    public void setBoundingBox(int widthb, int heightb){
        length = widthb;
        width = heightb;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(origin.x,origin.y,length,width);
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public String toString(){
        String out = "+";

        for(int i=0;i<length;i++){
            out+="--";
        }
        out+="+\n";

        for(int i=0;i<width;i++){
            out+="|";

            for(int j=0;j<length;j++){
                out+="  ";
            }
            out+="|\n";
        }
        out+="+";
        for(int i=0;i<length;i++){
            out+="--";
        }
        out+="+";
        return out;
    }

}
