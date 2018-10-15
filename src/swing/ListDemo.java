package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener{
    private JList<String>jlst;
    private JLabel jlab;
    private JScrollPane jscrlp;

    private String names[] = {"Sasha", "Luba", "Sofiya", "Kirill"};

    private ListDemo(){

        JFrame jfrm = new JFrame("Who is who in our family");

        jfrm.setLayout(new GridLayout());

        jfrm.setSize(400, 300);

        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jlst = new JList<>(names);


        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(jlst);

        jscrlp.setPreferredSize(new Dimension(200, 150));

        jlab = new JLabel ("Please choose a name");

        jlst.addListSelectionListener (this);

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged (ListSelectionEvent le){

        int idx = jlst.getSelectedIndex();

        if(idx != -1){
            jlab.setText("Current selection: " + names[idx]);
            switch (names[idx]) {
                case "Sasha":
                    jlab.setText("Daddy");
                    break;
                case "Luba":
                    jlab.setText("Mom");
                    break;
                case "Sofiya":
                    jlab.setText("Daughter");
                    break;
                case "Kirill":
                    jlab.setText("Son");
                    break;
            }
        }else jlab.setText("Please choose a name");

    }

    public static void main (String args []){
        SwingUtilities.invokeLater(ListDemo::new);
    }
}
