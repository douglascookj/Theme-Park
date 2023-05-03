import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class App {
    public static void main(String[] args) throws Exception {

        ImageIcon e = new ImageIcon("info_icon_002.svg.png");

        JButton b = new JButton();

        JFrame f = new JFrame();

        JPanel p = new JPanel();

        Button b1 = new Button("BLACK", 100, 100);

        b.setBackground(Color.WHITE);

        f.setLayout(new BorderLayout());
        f.setBackground(Color.WHITE);
        f.setSize(400, 400);
        f.setResizable(false);
        f.setTitle("Theme Park");
        f.setIconImage(e.getImage());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p.setBackground(Color.BLACK);


        p.setBounds(100, 100, b1.getWidth(), b1.getHeight());

        
        
        f.add(p, BorderLayout.EAST);
        p.add(b);
        

        

        f.setVisible(true);
    }
}
