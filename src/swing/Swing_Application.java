package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Swing_Application implements ActionListener {
    private JLabel jlabel;
    private JPopupMenu popupMenu;

    private Swing_Application() {
        JFrame jframe = new JFrame("Menu Demo");
        jframe.setSize(220, 200);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlabel = new JLabel();
        JMenuBar jmb = new JMenuBar();//create string of menu

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        file.setToolTipText("Time, Date, Save, Exit");
        JMenuItem time = new JMenuItem("Time",KeyEvent.VK_T);
        time.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        JMenuItem date = new JMenuItem("Date",KeyEvent.VK_D);
        date.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        JMenuItem save = new JMenuItem("Save",KeyEvent.VK_S);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem exit = new JMenuItem("Exit",KeyEvent.VK_E);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        file.add(time);
        file.add(date);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        jmb.add(file);

        JMenu Options = new JMenu("Options");
        Options.setMnemonic(KeyEvent.VK_O);
        Options.setToolTipText("Colors, Priority, Reset");
        JMenu Colors = new JMenu("Colors");
        Colors.setMnemonic(KeyEvent.VK_C);
        JCheckBoxMenuItem Red = new JCheckBoxMenuItem("Red");
        Red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        JCheckBoxMenuItem Green = new JCheckBoxMenuItem("Green");
        Green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
        JCheckBoxMenuItem Blue = new JCheckBoxMenuItem("Blue");
        Blue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        Colors.add(Red);
        Colors.add(Green);
        Colors.add(Blue);
        Options.add(Colors);

        JMenu Priority = new JMenu("Priority");
        Priority.setMnemonic(KeyEvent.VK_P);
        JRadioButtonMenuItem High = new JRadioButtonMenuItem("High", true);//set default value
        High.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
        JRadioButtonMenuItem Low = new JRadioButtonMenuItem("Low");
        Low.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        Priority.add(High);
        Priority.add(Low);
        Options.add(Priority);
        ButtonGroup bg = new ButtonGroup();//in this group can will be selected only one button
        bg.add(High);
        bg.add(Low);
        JMenuItem Reset = new JMenuItem("Reset",KeyEvent.VK_R);
        Reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        Options.addSeparator();
        Options.add(Reset);
        jmb.add(Options);

        JMenu Help = new JMenu("Help");
        Help.setMnemonic(KeyEvent.VK_H);
        Help.setToolTipText("About");
        JMenuItem About = new JMenuItem("About",KeyEvent.VK_A);
        About.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        Help.add(About);
        jmb.add(Help);

        time.addActionListener(this);
        date.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);
        Red.addActionListener(this);
        Green.addActionListener(this);
        Blue.addActionListener(this);
        High.addActionListener(this);
        Low.addActionListener(this);
        Reset.addActionListener(this);
        About.addActionListener(this);

        jframe.add(jlabel, BorderLayout.AFTER_LAST_LINE);
        jframe.setJMenuBar(jmb);
        jframe.setVisible(true);

        popupMenu = new JPopupMenu(); //create popup-menu
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);

        jframe.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                if(me.isPopupTrigger()) popupMenu.show(me.getComponent(), me.getX(), me.getY());
            }
            public void mouseReleased(MouseEvent me){
                if(me.isPopupTrigger()) popupMenu.show(me.getComponent(), me.getX(), me.getY());
            }
        });

        JToolBar toolBar = new JToolBar("Debug");//create toolbar
        ImageIcon set = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\A.gif");
        ImageIcon clear = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\B.gif");
        ImageIcon resume = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\C.PNG");

        JButton buttonSet = new JButton(set);
        buttonSet.setActionCommand("Set");
        buttonSet.setToolTipText("Set");
        JButton buttonClear = new JButton(clear);
        buttonClear.setActionCommand("Clear");
        buttonClear.setToolTipText("Clear");
        JButton buttonResume = new JButton(resume);
        buttonResume.setActionCommand("Command");
        buttonResume.setToolTipText("Command");

        toolBar.add(buttonSet);
        toolBar.add(buttonClear);
        toolBar.add(buttonResume);

        jframe.add(toolBar, BorderLayout.NORTH);

        buttonSet.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonResume.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("dd MMMM yyyy");
        String comStr = ae.getActionCommand();
        if (comStr.equals("Exit")) System.exit(0);
        //if (comStr.equals("Time"))jlabel.setText(format1.format(d));
        //if (comStr.equals("Date"))jlabel.setText(format2.format(d));
        else jlabel.setText(comStr + " Selected");
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(Swing_Application::new);

    }
}