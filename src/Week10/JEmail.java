package Week10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JEmail extends JFrame implements ActionListener
{
    JTextArea ta = new JTextArea( 10 , 60);
    JLabel companylogo = new JLabel("We Buy Company");
    JLabel to = new JLabel("To: ");
    JLabel subject = new JLabel("Subject: ");
    JLabel confirmation = new JLabel(" ");
    JLabel message = new JLabel("Message:");
    JTextField toTextField = new JTextField(15);
    JTextField subjectTextField = new JTextField(15);
    JButton send = new JButton("Send");
    JButton clear = new JButton("Clear");
    Container con = getContentPane();

    public JEmail()
    {
        setLayout(new FlowLayout());
        con.add(companylogo);
        companylogo.setFont(new Font("Monaco", Font.BOLD,18));
        con.add(to);
        con.add(toTextField);
        con.add(subject);
        con.add(subjectTextField);
        con.add(message);
        con.add(ta);
        con.add(send);
        con.add(clear);
        send.addActionListener(this);
        clear.addActionListener(this);
    }

    public static void main(String[] args)
    {
        JEmail myMail = new JEmail();
        myMail.setVisible(true);
        myMail.setSize( 800,270);
        myMail.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if( source == send )
        {
            confirmation.setText("Message has been sent !! ");
            con.add(confirmation);
            send.setEnabled(false);
            con.validate();

        }
        if ( source == clear )
        {
            toTextField.setText(null);
            subjectTextField.setText(null);
            ta.setText(null);
            con.validate();
        }
    }


}