package progra3;

import javax.swing.JFrame;

public class maps extends JFrame {
    public maps(){
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new map());
        setVisible(true);
    }
}
