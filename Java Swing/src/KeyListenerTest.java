import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest implements KeyListener {
    private JFrame window = new JFrame();
    private JLabel keyTypeLabel = new JLabel("Key type: ");
    private JLabel keyPressLabel = new JLabel("Key pressed: ");
    private JLabel keyReleaseLabel = new JLabel("Key released: ");
    private JLabel player;

    public static void main(String[] args) {
        new KeyListenerTest();
    }

    public KeyListenerTest() {
        window = new JFrame();
        window.setSize(800, 800);
        window.setLocation(500, 350);
        window.setFocusable(true);
        window.addKeyListener(this);
        window.setFocusTraversalKeysEnabled(false);

        window.setLayout(new GridLayout(4, 1));
        window.add(keyTypeLabel);
        window.add(keyPressLabel);
        window.add(keyReleaseLabel);


        ImageIcon image = new ImageIcon("logo.png");
        image.setImage(image.getImage().getScaledInstance(20, 20, 0));
        player = new JLabel(image);

        JPanel panel = new JPanel();
        panel.add(player);
        window.add(panel);

        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Typed: " + e.getKeyChar());
        this.keyTypeLabel.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Pressed: " + e.getKeyChar());
        this.keyPressLabel.setText("Key pressed: " + e.getKeyChar());

        switch (e.getKeyChar()) {
            case 'w':
                player.setLocation(player.getX(), player.getY() - 1);
                break;
            case 's':
                player.setLocation(player.getX(), player.getY() + 1);
                break;
            case 'a':
                player.setLocation(player.getX() - 1, player.getY());
                break;
            case 'd':
                player.setLocation(player.getX() + 1, player.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released: " + e.getKeyChar());
        this.keyReleaseLabel.setText("Key released: " + e.getKeyChar());
    }
}
