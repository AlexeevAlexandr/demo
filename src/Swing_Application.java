import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Application implements ActionListener {
    private JLabel jlabel;
    private Application() {
        JFrame jframe = new JFrame("Menu Demo");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(220, 200);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlabel = new JLabel();
        JMenuBar jmb = new JMenuBar();

        JMenu File = new JMenu("File");
        File.setMnemonic(KeyEvent.VK_F);
        File.setToolTipText("Open, Close, Save, Exit");
        JMenuItem Open = new JMenuItem("Open",KeyEvent.VK_O);
        Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Close = new JMenuItem("Close",KeyEvent.VK_C);
        Close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Save = new JMenuItem("Save",KeyEvent.VK_S);
        Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Exit = new JMenuItem("Exit",KeyEvent.VK_E);
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        File.add(Open);
        File.add(Close);
        File.add(Save);
        File.addSeparator();
        File.add(Exit);
        jmb.add(File);

        JMenu Options = new JMenu("Options");
        Options.setMnemonic(KeyEvent.VK_O);
        Options.setToolTipText("Colors, Priority, Reset");
        JMenu Colors = new JMenu("Colors");
        Colors.setMnemonic(KeyEvent.VK_C);
        JMenuItem Red = new JMenuItem("Red",KeyEvent.VK_R);
        Red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Green = new JMenuItem("Green",KeyEvent.VK_G);
        Green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Blue = new JMenuItem("Blue",KeyEvent.VK_B);
        Blue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        Colors.add(Red);
        Colors.add(Green);
        Colors.add(Blue);
        Options.add(Colors);

        JMenu Priority = new JMenu("Priority");
        Priority.setMnemonic(KeyEvent.VK_P);
        JMenuItem High = new JMenuItem("High",KeyEvent.VK_H);
        High.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Low = new JMenuItem("Low",KeyEvent.VK_L);
        Low.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        Priority.add(High);
        Priority.add(Low);
        Options.add(Priority);
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

        Open.addActionListener(this);
        Close.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);
        Red.addActionListener(this);
        Green.addActionListener(this);
        Blue.addActionListener(this);
        High.addActionListener(this);
        Low.addActionListener(this);
        Reset.addActionListener(this);
        About.addActionListener(this);

        jframe.add(jlabel);
        jframe.setJMenuBar(jmb);
        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        if (comStr.equals("Exit")) System.exit(0);
        jlabel.setText(comStr + "Selected");
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(Application::new);

    }
}