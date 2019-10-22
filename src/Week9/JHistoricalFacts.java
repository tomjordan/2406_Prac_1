package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener{
    JLabel mainFrame = new JLabel();
    JButton b = new JButton("Press to change fact");
    JLabel f1 = new JLabel("In 1926, Arctic explorer Peter Freuchen was trapped under an avalanche while on an expedition. He escaped from death by fashioning a shiv out of his own feces and amputating his foot.");
    JLabel f2 = new JLabel("In ancient Egypt, servants were smeared with honey to attract flies away from the pharaoh.");
    JLabel f3 = new JLabel("Roman Catholics in Bavaria founded a secret society in 1740 called the Order of the Pug. New members had to wear dog collars and scratch at the door to get in.");
    JLabel f4 = new JLabel("The first fax was sent while people were still traveling the Oregon Trail.");
    JLabel f5 = new JLabel("Henry VIII of England had people who were called 'Grooms of Stool' whose job it was to wipe his bottom. During his reign, he had four such people, all of whom were knighted.");
    JLabel f6 = new JLabel("Before Abraham Lincoln became a politician, he was a champion wrestler. With more than 300 bouts under his belt, Lincoln only lost one match in his career and was inducted into the National Wrestling Hall Of Fame in 1992.");
    int counter = 0;

    public JHistoricalFacts() {
        super("Historical Facts");
        mainFrame.setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainFrame);
        mainFrame.add(b);
        mainFrame.add(f1);
        b.addActionListener(this);

    }
    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setSize(800,200);
        frame.setLocation(600,500);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(counter == 6)
            counter = 0;
        if(counter == 0){
            mainFrame.remove(f1);
            mainFrame.add(f2);
        }else if (counter == 1){
            mainFrame.remove(f2);
            mainFrame.add(f3);
        }else if (counter == 2){
            mainFrame.remove(f3);
            mainFrame.add(f4);
        }else if (counter == 3){
            mainFrame.remove(f4);
            mainFrame.add(f5);
        }else if (counter == 4){
            mainFrame.remove(f5);
            mainFrame.add(f6);
        }else{
            mainFrame.remove(f6);
            mainFrame.add(f1);
        }
        counter ++;
        mainFrame.validate();
        mainFrame.repaint();
    }
}