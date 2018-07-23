package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TFDemo implements ActionListener{
    private JTextField jtf;
    private JLabel jlabPrompt, jlabContents;

    private TFDemo(){

        JFrame jfrm = new JFrame("Use a text Field");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(240, 120);

        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtf = new JTextField(10);

        jtf.setActionCommand("myTF");

        JButton jbtnRev = new JButton("Reverse");

        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        jlabPrompt = new JLabel ("Enter text: ");
        jlabContents = new JLabel("");


        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Reverse")) {
            StringBuilder result = new StringBuilder(jtf.getText());
            jlabContents.setText(result.reverse().toString());
        }
    }

    public static void main (String args []){
        SwingUtilities.invokeLater(TFDemo::new);
    }
}
