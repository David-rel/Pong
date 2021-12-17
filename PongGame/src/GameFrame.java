import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	GamePanel panel;

	GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		ImageIcon image = new ImageIcon("football-png-images-images-of-soccer-balls-png-2400_2359.png");
		this.setIconImage(image.getImage()); //changes icon of frame
	}

}
