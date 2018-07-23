package swing;

import javax.swing.*;
import java.awt.*;

/*
<applet code = "swing.Swing_Applet" width=220 height=90>
</applet>
 */
public class Swing_Applet extends JApplet {
    private JLabel jlab;
    public void init() {
        try {
            SwingUtilities.invokeAndWait(this::makeGUI);
        } catch (Exception exc) {
            System.out.println("Error " + exc);
        }
    }
    private void makeGUI(){
        setLayout(new FlowLayout());

        JButton left = new JButton("left");
        JButton right = new JButton("right");

        left.addActionListener(e -> jlab.setText("LEFT"));
        right.addActionListener(e -> jlab.setText("RIGHT"));

        add(left);
        add(right);

        jlab = new JLabel("Press button", JLabel.CENTER);
        add(jlab,BorderLayout.CENTER);
    }
}