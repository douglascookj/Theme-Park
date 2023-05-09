import javax.swing.*;

import java.awt.*;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

public class Main implements ActionListener {
    int count = 0;

    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JLabel dunkTank = new JLabel();
    JLabel character = new JLabel();
    
    

public static void main(String [] args) {
    new Main();
}
public static void word(){
    System.out.println("button");
}
@Override
public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("" + count);

    System.out.println("Button is clicked");

    // Move character down by 10 pixels
    int newY = character.getY() + 10;
    character.setLocation(character.getX(), newY);

    dunkTank.repaint();
}
public Main(){
    ImageIcon tank = new ImageIcon("dunktank.png");
    ImageIcon target = new ImageIcon("dunktarget.png");
    Image baseball = Toolkit.getDefaultToolkit().getImage("baseball.png");
    ImageIcon Ye = new ImageIcon("yeface.png");

    Border border = BorderFactory.createLineBorder(Color.green, 3);

    label.setText("" + count);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(0x00FF00));
    label.setFont(new Font("MV Boli",Font.PLAIN,20));
    label.setIconTextGap(50);
    label.setBackground(Color.white);
    label.setOpaque(true);
    label.setBorder(border);

    dunkTank.setIcon(tank);
    dunkTank.setLayout(new OverlayLayout(dunkTank));

    
    character.setIcon(Ye);
    character.setPreferredSize(new Dimension(80,80));
    character.setAlignmentX(.5f);
    character.setAlignmentY(.05f);
 
    Cursor c1 = new Cursor(Cursor.CROSSHAIR_CURSOR);

    Point p11 = new Point(0, 0);

    Cursor ball = Toolkit.getDefaultToolkit().createCustomCursor(baseball, p11, "ballCursor");

    panel.setPreferredSize(new Dimension(100, 100));
    panel.setBackground(Color.black);
    

    JButton button = new JButton();
    button.setIcon(target);
    button.addActionListener(this);
   
    button.setPreferredSize(new Dimension(100, 100));
    button.setCursor(ball);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    panel.add(label);
    frame.add(panel);
    panel.add(button);
    panel.add(dunkTank);
    dunkTank.add(character);
    
    frame.setResizable((false));
    frame.setVisible(true);

}
public void Frame(){

}
public void Panel(){

}
}
