import java.awt.*;
import java.awt.event.*;

public class Experiment15 extends Frame implements ItemListener {
    String clr = "";
    
    Experiment15() {
        Checkbox red, green, yellow;
        CheckboxGroup cbg = new CheckboxGroup();
        red = new Checkbox("red", true, cbg);
        green = new Checkbox("green", true, cbg);
        yellow = new Checkbox("yellow", true, cbg);
        setSize(300, 300);
        setTitle("Traffic Signal");
        setVisible(true);
        setLayout(null);
        add(red);
        add(green);
        add(yellow);
        red.setBounds(10,25,100,100);
        green.setBounds(10,100,100,100);
        yellow.setBounds(10,175,100,100);
        red.addItemListener(this);
        green.addItemListener(this);
        yellow.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Experiment15();
    }

    public void itemStateChanged(ItemEvent e) {
        clr = (String)(e.getItem());
        repaint();
    }

    public void paint(Graphics g) {
        g.drawOval(200, 50, 50, 50);
        g.drawOval(200, 125, 50, 50);
        g.drawOval(200, 200, 50, 50);
       
        if (clr.equals("red")) {
            g.setColor(Color.red);
            g.fillOval(200, 50, 50, 50);
        }
        if (clr.equals("green")) {
            g.setColor(Color.green);
            g.fillOval(200, 125, 50, 50);
        }
        if (clr.equals("yellow")) {
            g.setColor(Color.yellow);
            g.fillOval(200, 200, 50, 50);
        }
    }
}