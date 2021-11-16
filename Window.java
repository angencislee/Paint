import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    Drawing mydrawing;
    Window (String title,int x,int y) {
        /* set  Window */
        super(title);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(10, 10);
        setSize(x,y);

        Container contentPane = getContentPane();
        /* set  Menu */
        JMenuBar pan1 = new JMenuBar();
        JMenu File = new JMenu("File");
        pan1.add(File);
        //separe d’un trait
        JMenuItem New = new JMenuItem("New");

        File.add(New);

        JMenuItem Open = new JMenuItem("Open");
        File.add(Open);

        JMenuItem Save = new JMenuItem("Save");
        File.add(Save);
        //shortcut
        Save.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask(), false));

        File.addSeparator();
        JMenuItem Quit = new JMenuItem("Quit");
        File.add(Quit);

        JMenu APropos = new JMenu("A propos");
        pan1.add(APropos);
        JMenuItem Others = new JMenuItem("Others");
        APropos.add(Others);
        //

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Quit.addActionListener(this);
        Others.addActionListener(this);

        mydrawing = new Drawing();
        contentPane.add(mydrawing);
        /* set  bouton color*/

        JPanel panne = new JPanel();

        JPanel pancolor = new JPanel();
        pancolor.setLayout(new GridLayout(2, 4));
        JButton Black = new JButton("Black");
        Black.setBackground(Color.BLACK);             pancolor.add(Black);
        JButton Red = new JButton("Red");
        Red.setBackground(Color.RED);              pancolor.add(Red);
        JButton Green = new JButton("Green");
        Green.setBackground(Color.GREEN);             pancolor.add(Green);
        JButton Blue = new JButton("Blue");
        Blue.setBackground(Color.BLUE);              pancolor.add(Blue);
        JButton Yellow = new JButton("Yellow");
        Yellow.setBackground(Color.YELLOW);           pancolor.add(Yellow);
        JButton Pink = new JButton("Pink");
        Pink.setBackground(Color.PINK);               pancolor.add(Pink);
        JButton Magenta = new JButton("Magenta");
        Magenta.setBackground(Color.MAGENTA);        pancolor.add(Magenta);
        JButton Orange = new JButton("Orange");
        Orange.setBackground(Color.ORANGE);          pancolor.add(Orange);

        Red.addActionListener(this);
        Green.addActionListener(this);
        Blue.addActionListener(this);
        Yellow.addActionListener(this);
        Pink.addActionListener(this);
        Magenta.addActionListener(this);
        Orange.addActionListener(this);
        Black.addActionListener(this);
        /* set buttons*/

        JPanel pantool = new JPanel();
        pantool.setLayout(new GridLayout(2, 2));
        JButton Ellipse = new JButton("Ellipse");
        JButton Circle = new JButton("Circle");
        JButton Square = new JButton("Square");
        JButton Rectangle = new JButton("Rectangle");
        pantool.add(Rectangle);
        pantool.add(Ellipse);
        pantool.add(Circle);
        pantool.add(Square);

        Rectangle.addActionListener(this);
        Ellipse.addActionListener(this);
        Circle.addActionListener(this);
        Square.addActionListener(this);

        contentPane.add(panne, "South");
        panne.add(pancolor);
        panne.add(pantool);
        setJMenuBar(pan1);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();

        /* to create the shape */
        if (com.equals("Quit")) {
            System.exit(0);
        } else if (com.equals("Ellipse")) {
            mydrawing.setFigureName("Ellipse");
            System.out.println("You clicked " + com);
        } else if (com.equals("Rectangle")) {
            mydrawing.setFigureName("Rectangle");
        } else if (com.equals("Circle")) {
            mydrawing.setFigureName("Circle");
        } else if (com.equals("Square")) {
            mydrawing.setFigureName("Square");
        } else if (com.equals("New")) {
            mydrawing.list.clear();
            repaint();
        } else if (com.equals("Others")) {
            JOptionPane others = new JOptionPane();

            /* to choose the colors */
        } else if (com.equals("Black")) {
            mydrawing.setColor(Color.BLACK);
            System.out.println("You clicked " + com);

        } else if (com.equals("Red")) {
            mydrawing.setColor(Color.RED);
        } else if (com.equals("Yellow")) {
            mydrawing.setColor(Color.YELLOW);
        } else if (com.equals("Blue")) {
            mydrawing.setColor(Color.BLUE);
        } else if (com.equals("Green")) {
            mydrawing.setColor(Color.GREEN);
        } else if (com.equals("Magenta")) {
            mydrawing.setColor(Color.MAGENTA);
        } else if (com.equals("Orange")) {
            mydrawing.setColor(Color.ORANGE);
        } else if (com.equals("Pink")) {
            mydrawing.setColor(Color.PINK);
        } else {
            System.out.println("You clicked " + com);
        }
    }


}