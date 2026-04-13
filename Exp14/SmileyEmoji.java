import java.awt.*;
import java.awt.event.*;

class Smiley extends Frame
{
    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(100,100,300,300);

        g.setColor(Color.BLACK);
        g.fillOval(155,170,60,60);
        g.fillOval(285,170,60,60);

        g.setColor(Color.RED);
        g.fillArc(175,210,150,150,180,180);
    }
}

public class SmileyEmoji
{
    public static void main(String[] args)
    {
        Smiley s = new Smiley();
        s.setSize(500,500);
        s.setLayout(null);
        s.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                s.dispose();
            }
        });
        s.setTitle("Smiley");
        s.setVisible(true);
    }
}