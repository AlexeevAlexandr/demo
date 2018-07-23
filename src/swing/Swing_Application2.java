package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Swing_Application2 implements ActionListener {
    private JLabel jLabel;
    private JMenuBar jMenuBar;
    private JToolBar jToolBar;
    private JPopupMenu jPopupMenu;
    private DebugAction debugAction;
    private DebugAction debugAction1;
    private DebugAction debugAction2;

    private Swing_Application2() {
        JFrame jframe = new JFrame("Complete Menu Demo");
        jframe.setSize(360, 200);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jLabel = new JLabel();
        jMenuBar = new JMenuBar();
        makeFileMenu();
        makeActions();
        makeToolBar();
        makeOptionsMenu();
        makeHelpMenu();
        makeEditPUMenu();
        jframe.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                if (me.isPopupTrigger())
                    jPopupMenu.show(me.getComponent(), me.getX(), me.getY());
            }

            public void mouseReleased(MouseEvent me) {
                if (me.isPopupTrigger())
                    jPopupMenu.show(me.getComponent(), me.getX(), me.getY());
            }
        });
        jframe.add(jLabel, SwingConstants.CENTER);
        jframe.add(jToolBar, BorderLayout.NORTH);
        jframe.setJMenuBar(jMenuBar);
        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();
        if (comStr.equals("Exit")) System.exit(0);
        jLabel.setText(comStr + "Selected");
    }

    class DebugAction extends AbstractAction {
        DebugAction(String name, Icon image, int a, int b, String tTip) {
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(b, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, a);
            putValue(SHORT_DESCRIPTION, tTip);
        }

        public void actionPerformed(ActionEvent ae) {
            String comStr = ae.getActionCommand();
            jLabel.setText(comStr + "Selected");
            if (comStr.equals("Set")) {
                debugAction1.setEnabled(true);
                debugAction.setEnabled(false);
            } else if (comStr.equals("Clear")) {
                debugAction1.setEnabled(false);
                debugAction.setEnabled(true);
            }
        }
    }

    private void makeFileMenu() {
        JMenu File = new JMenu("File");
        File.setMnemonic(KeyEvent.VK_F);
        JMenuItem Open = new JMenuItem("Open", KeyEvent.VK_O);
        Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Close = new JMenuItem("Close", KeyEvent.VK_C);
        Close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Save = new JMenuItem("Save", KeyEvent.VK_S);
        Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem Exit = new JMenuItem("Exit", KeyEvent.VK_E);
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        File.add(Open);
        File.add(Close);
        File.add(Save);
        File.addSeparator();
        File.add(Exit);
        jMenuBar.add(File);
        Open.addActionListener(this);
        Close.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);
    }

    private void makeOptionsMenu() {
        JMenu jmOptions = new JMenu("Options");
        JMenu jmColors = new JMenu("Colors");
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");
        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);
        JMenu jmPriority = new JMenu("Priority");
        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");
        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);
        JMenu jmDebug = new JMenu("Debug");
        JMenuItem jmiSetBP = new JMenuItem(debugAction);
        JMenuItem jmiClearBP = new JMenuItem(debugAction1);
        JMenuItem jmiResume = new JMenuItem(debugAction2);
        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResume);
        jmOptions.add(jmDebug);
        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);
        jMenuBar.add(jmOptions);
        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
    }

    private void makeHelpMenu() {
        JMenu jmHelp = new JMenu("Help");
        ImageIcon icon = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\B.gif");
        JMenuItem jmiAbout = new JMenuItem("About", icon);
        jmiAbout.setToolTipText("Info about the MenuDemo program");
        jmHelp.add(jmiAbout);
        jMenuBar.add(jmHelp);
        jmiAbout.addActionListener(this);
    }

    private void makeActions() {
        ImageIcon setIcon = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\A.gif");
        ImageIcon clearIcon = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\B.gif");
        ImageIcon resumeIcon = new ImageIcon("C:\\Documents and Settings\\Fart\\Рабочий стол\\C.png");
        debugAction = new DebugAction("Set", setIcon, KeyEvent.VK_S, KeyEvent.VK_B, "Set");
        debugAction1 = new DebugAction("Clear", clearIcon, KeyEvent.VK_C, KeyEvent.VK_L, "Clear");
        debugAction2 = new DebugAction("Resume", resumeIcon, KeyEvent.VK_R, KeyEvent.VK_R, "Resume");
        debugAction1.setEnabled(false);
    }

    private void makeToolBar() {
        JButton Set = new JButton(debugAction);
        JButton Clear = new JButton(debugAction1);
        JButton Resume = new JButton(debugAction2);
        jToolBar = new JToolBar("Breakpoints");
        jToolBar.add(Set);
        jToolBar.add(Clear);
        jToolBar.add(Resume);
    }

    private void makeEditPUMenu() {
        jPopupMenu = new JPopupMenu();
        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");
        jPopupMenu.add(jmiCut);
        jPopupMenu.add(jmiCopy);
        jPopupMenu.add(jmiPaste);
        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(Swing_Application2::new);
    }
}

