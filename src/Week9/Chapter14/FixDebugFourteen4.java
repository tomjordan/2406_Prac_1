package Week9.Chapter14;

// Beverage selector
// Milk and cola are $3
// all other drinks are $2


import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FixDebugFourteen4 extends JFrame implements ItemListener {
    final int HIGH_PRICE = 3;
    final int LOW_PRICE = 2;
    FlowLayout flow = new FlowLayout();
    String title = "Beverage Selector";
    Font bigFont = new Font("Arial", Font.BOLD, 24);
    ButtonGroup drinkGrp = new ButtonGroup();
    JCheckBox cola = new JCheckBox("Cola");
    JCheckBox lemon = new JCheckBox("Lemon");
    JCheckBox tea = new JCheckBox("Iced tea");
    JCheckBox milk = new JCheckBox("Milk");
    JCheckBox coffee = new JCheckBox("Coffee");
    JTextField totPrice = new JTextField(10);
    String output;
    int totalPrice = 0;

    public FixDebugFourteen4() {
        super("Beverage Selector");
        setFont(bigFont);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(cola);
        cola.addItemListener(this);
        add(lemon);
        lemon.addItemListener(this);
        add(tea);
        tea.addItemListener(this);
        add(coffee);
        coffee.addItemListener(this);
        add(milk);
        milk.addItemListener(this);
        add(totPrice);

        drinkGrp.add(cola);
        drinkGrp.add(lemon);
        drinkGrp.add(tea);
        drinkGrp.add(coffee);
        totPrice.setText("0");
    }

    public static void main(String[] arguments) {
        JFrame bFrame = new FixDebugFourteen4();
        bFrame.setSize(350, 100);
        bFrame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        if (cola.isSelected() && milk.isSelected()) {
            totPrice.setText("$" + HIGH_PRICE);
        } else {
            totPrice.setText("$" + LOW_PRICE);
        }
    }
}