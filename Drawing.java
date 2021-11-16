import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


public class Drawing extends JPanel implements MouseMotionListener,MouseListener{
    private static final long seriaVersionUID = 1L;
    ArrayList<Figure> list = new ArrayList<Figure>();
    protected Color color;
    protected String figureName;
    protected int x;
    protected int y;

    public Drawing(){
        super();
        this.list = new ArrayList<Figure>();
        this.color=Color.BLACK;
        this.figureName = "Rectangle";
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void setColor(Color color){
        this.color= color;
    }

    public void setFigureName(String figureName){
        this.figureName = figureName;
    }

    public ArrayList<Figure> getList(){
        return this.list;
    }

    public void setList(ArrayList<Figure> list){
        this.list = list;
    }


    public int sizeList(){
        int i;
        i = list.size();
        return i;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Figure f : list){
            f.draw(g);
        }
    }


    public void mouseDragged(MouseEvent mouseEvent){

        int x0=list.get(list.size()-1).origin.getX();
        int y0=list.get(list.size()-1).origin.getY();
        list.get(list.size()-1).setBoundingBox(mouseEvent.getX() - x0, mouseEvent.getY() -y0);

        repaint();
    }
    public void mouseMoved(MouseEvent mouseEvent){
    }
    public void mouseClicked(MouseEvent mouseEvent){
    }
    public void mouseEntered(MouseEvent mouseEvent){
    }
    public void mouseExited(MouseEvent mouseEvent){
    }


    public void mousePressed(MouseEvent mouseEvent){
        x = mouseEvent.getX();
        y = mouseEvent.getY();

        Point p = new Point(x,y);
        System.out.println(figureName+" "+color+" "+x+" "+y);
        Figure f;

        if(figureName.equals("Rectangle")){
            f = new Rectangle(0,0,color);
            f.setOrigin(p);
            list.add(f);
        }
        else if(figureName.equals("Square")){
            f = new Square(0,color);
            f.setOrigin(p);
            list.add(f);
        }
        else if(figureName.equals("Ellipse")){
            f = new Ellipse(0,0,color);
            f.setOrigin(p);
            list.add(f);
        }
        else if(figureName.equals("Circle")){
            f = new Circle(0,color);
            f.setOrigin(p);
            list.add(f);
        }
    }


    public void mouseReleased(MouseEvent mouseEvent){
        x = mouseEvent.getX();
        y = mouseEvent.getY();

        int x0 = list.get(list.size()-1).origin.getX();
        int y0 = list.get(list.size()-1).origin.getY();

        list.get(list.size()-1).setBoundingBox(x-x0,y-y0);
        System.out.println(x0+" "+y0+" "+x+" "+y);
        repaint();
    }
}


