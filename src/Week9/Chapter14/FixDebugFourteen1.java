package Week9.Chapter14;
// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument

import javax.swing.*;

public class FixDebugFourteen1 extends JFrame {
    public FixDebugFourteen1(int size) {
        super("This is my frame");
        setSize(size, size * 2);
        setVisible(true);
        setDefaultCloseOperation(FixDebugFourteen1.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FixDebugFourteen1 frame = new FixDebugFourteen1(200);
    }
}