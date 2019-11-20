package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JColorFrame extends JFrame implements ActionListener {
    Button colorButton = new Button("Change");
    JPanel centre = new JPanel();
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel east = new JPanel();
    JPanel west = new JPanel();
    int count = 0;

    public JColorFrame() {
        super("JColorFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        centre.add(colorButton);
        con.add(north, BorderLayout.NORTH);
        con.add(south, BorderLayout.SOUTH);
        con.add(east, BorderLayout.EAST);
        con.add(west, BorderLayout.WEST);
        con.add(centre, BorderLayout.CENTER);
        colorButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JColorFrame cFrame = new JColorFrame();
        cFrame.setSize(350, 250);
        cFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (count % 5 == 0)
            north.setBackground(Color.BLUE);
        else if (count % 5 == 1)
            east.setBackground(Color.RED);
        else if (count % 5 == 2)
            west.setBackground(Color.PINK);
        else if (count % 5 == 3)
            south.setBackground(Color.GREEN);
        else {
            east.setBackground(Color.WHITE);
            south.setBackground(Color.WHITE);
            north.setBackground(Color.WHITE);
            west.setBackground(Color.WHITE);
        }
        ++count;
    }
}

