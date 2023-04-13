import javax.swing.*;
import java.awt.*;

class panelTambah extends JPanel{
	panelTambah(){
		setBounds(0,25,600,675);
		setBackground(Color.red);
		setLayout(null);

		JLabel a = new JLabel("bagus kali di panel tambah");
		a.setBounds(0,0,180,25);
		a.setForeground(Color.white);
		add(a);
		a.setVisible(true);
	}
}