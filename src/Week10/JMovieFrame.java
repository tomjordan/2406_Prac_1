package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame
{
    JButton leftMov = new JButton("Left Movie");
    JButton northMov = new JButton("North");
    JButton eastMov = new JButton("East Movie");
    JButton southMov = new JButton("South Movie");
    JLabel movieArt = new JLabel();
    Container con = getContentPane();

    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        movieArt.setFont(new Font("Arial", Font.BOLD, 18));
        movieArt.setHorizontalAlignment(SwingConstants.CENTER);
        con.setLayout(new BorderLayout());
        con.add(leftMov, BorderLayout.WEST);
        con.add(northMov, BorderLayout.NORTH);
        con.add(eastMov, BorderLayout.EAST);
        con.add(southMov, BorderLayout.SOUTH);
        con.add(movieArt, BorderLayout.CENTER);

        leftMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("left movie actor");
                movieArt.repaint();
            }
        });

        northMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("Elijah Wood");
                movieArt.repaint();
            }
        });

        eastMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("East actor here");
                movieArt.repaint();
            }
        });

        southMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("This is a south movie actor");
                movieArt.repaint();
            }
        });
    }

    public static void main(String[] args)
    {
        JMovieFrame add = new JMovieFrame();
        add.setDefaultCloseOperation(3);
        add.setSize(500,300);
        add.setVisible(true);
    }
}