package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLeftOrRight extends JFrame implements MouseListener
{

    private JLabel click = new JLabel("Right, left, or center click your mouse");

    String msg = "";


    public JLeftOrRight()
    {
        super("Mouse Click");
        setLayout(new FlowLayout());
        add(click);
        setSize(300, 300);
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void mouseClicked(MouseEvent e)
    {
        int x = e.getModifiers();
        int whichButton = e.getButton();

        if(whichButton == MouseEvent.BUTTON1)
            click.setText(x + " = Left Button");
        else if(whichButton == MouseEvent.BUTTON2)
            click.setText(x + " = Scroll Button");
        else if(whichButton == MouseEvent.BUTTON3)
            click.setText(x + " = Right Button");
    }

    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
        msg = "Click";
        click.setText(msg);
    }
    public void mouseReleased(MouseEvent e)
    {
        msg = "Release";
        click.setText(msg);
    }

    public static void main(String[] args)
    {
        JLeftOrRight frame = new JLeftOrRight();
    }
}