import java.awt.*;
import java.io.Serializable;


//Create a coordinate point(0,0)
public class Point implements Serializable{
    int x;
    int y;

    //Create a coordinate point(a,b)
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        x=0;
        y=0;
    }

    //Return the coordinates of this point
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
