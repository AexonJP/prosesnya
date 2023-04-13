import javax.swing.*;
import java.awt.*;

public class panelAnime extends	JPanel{
	panelAnime(){
		setBounds(0,25,600,675);
		setBackground(Color.black);
		setLayout(null);

		JLabel a = new JLabel("bagus kali di panel anime");
		a.setBounds(0,0,180,25);
		a.setForeground(Color.white);
		add(a);
		a.setVisible(true);

	}
}