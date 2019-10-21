package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton clickButton;
    private JLabel favSentance, title;


    public static void main(String[] args) {
        new JBookQuote();
    }

    public JBookQuote(){
        super("Question 1");
        setSize(300,300);
        mainPanel = new JPanel();
        getContentPane().add(mainPanel);
        clickButton = new JButton("Title");
        favSentance = new JLabel("Hello sir");
        title = new JLabel("Lion King");
        mainPanel.setLayout(new GridLayout(3, 1));
        title.setVisible(false);
        mainPanel.add(favSentance);
        clickButton.addActionListener(this);
        mainPanel.add(clickButton);
        mainPanel.add(title);


        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == clickButton){
            title.setVisible(true);
        }
    }
}
