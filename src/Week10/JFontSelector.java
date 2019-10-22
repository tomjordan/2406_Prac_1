package Week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame
{
    int FONTSIZE = 10;

    JButton font1 = new JButton("Arial");
    JButton font2 = new JButton("Times");
    JButton font3 = new JButton("Verdana");
    JButton font4 = new JButton("Courier New");
    JButton font5 = new JButton("Wingdings");
    JLabel fontdisp = new JLabel("Sample TEXT");
    JButton fontSmall = new JButton("-");
    JButton fontBig = new JButton("+");
    Container con = getContentPane();


    public JFontSelector()
    {
        fontdisp.setFont(new Font("Bank Gothic", Font.PLAIN, 16));
        con.setLayout(new FlowLayout(FlowLayout.CENTER));
        con.add(font1);
        con.add(font2);
        con.add(font3);
        con.add(font4);
        con.add(font5);
        add(fontdisp);
        add(fontSmall);
        add(fontBig);
        String curFont = fontdisp.getFont().toString();
        font1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontdisp.setFont(new Font("Arial", Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });

        font2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontdisp.setFont(new Font("Verdana", Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });

        font3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontdisp.setFont(new Font("Times New Roman", Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });

        font4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontdisp.setFont(new Font("Courier New", Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });

        font5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fontdisp.setFont(new Font("Wingdings", Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });
        fontBig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FONTSIZE = FONTSIZE +1;
                String curFont = fontdisp.getFont().toString();
                fontdisp.setFont(new Font(curFont, Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });
        fontSmall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FONTSIZE = FONTSIZE - 1;
                String curFont = fontdisp.getFont().toString();
                fontdisp.setFont(new Font(curFont, Font.PLAIN, FONTSIZE));
                fontdisp.repaint();
            }
        });




    }

    public static void main(String[] args)
    {
        JFontSelector mainFrame = new JFontSelector();
        mainFrame.setSize(300,200);
        mainFrame.setDefaultCloseOperation(3);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
    }
}