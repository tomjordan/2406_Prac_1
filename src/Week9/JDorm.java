package Week9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JDorm extends JFrame implements ItemListener

    {
        FlowLayout flow = new FlowLayout();
        JCheckBox privateRm = new JCheckBox("Private");
        JCheckBox internet = new JCheckBox("Internet");
        JCheckBox cable = new JCheckBox("Cable TV");
        JCheckBox microwave = new JCheckBox("Microwave");
        JCheckBox refrigerator = new JCheckBox("Refrigerator");
        JTextArea outArea = new JTextArea(5, 10);
        String[] dormOption = {"Shared room",
                "", "", "",
                ""};
        String output;
        int x;
    public JDorm()
        {
            super("Dorm Room Options");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(flow);
            add(privateRm);
            privateRm.addItemListener(this);
            add(internet);
            internet.addItemListener(this);
            add(cable);
            cable.addItemListener(this);
            add(microwave);
            microwave.addItemListener(this);
            add(refrigerator);
            refrigerator.addItemListener(this);
            for(x = 0; x < dormOption.length; ++x)
                outArea.append(dormOption[x]);
            add(outArea);
        }
        public static void main(String[] args)
        {
            JDorm dFrame = new JDorm();
            dFrame.setSize(450,300);
            dFrame.setVisible(true);
        }
        @Override
        public void itemStateChanged(ItemEvent check)
        {
            Object source = check.getItem();
            if(source == privateRm)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    dormOption[0] = "Private room";
                else
                    dormOption[0] = "Shared room";
            }
            if(source == cable)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    dormOption[1] = "\nCable TV";
                else
                    dormOption[1] = "";
            }
            if(source == internet)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    dormOption[2] = "\nInternet Connection";
                else
                    dormOption[2] = "";
            }
            if(source == microwave)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    dormOption[3] = "\nMicrowave";
                else
                    dormOption[3] = "";
            }
            if(source == refrigerator)
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    dormOption[4] = "\nRefrigerator";
                else
                    dormOption[4] = "";
            }
            //   for(x = 0; x < dormOption.length; ++x)
            //       outArea.remove(dormOption[x]);
            outArea.setText(dormOption[0]);
            for(x = 1; x < dormOption.length; ++x)
                outArea.append(dormOption[x]);
        }
    }