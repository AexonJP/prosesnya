import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class menuAdmin{
	menuAdmin(){
		JFrame formAdmin = new JFrame("menu admin");
		formAdmin.setSize(600,700);
		formAdmin.setLocation(150,150);
		formAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formAdmin.setLocationRelativeTo(null);
		formAdmin.setLayout(null);

		JButton anime = new JButton("Anime");
		anime.setMargin( new Insets(5, 5, 5, 5) );
        anime.setBounds(0,0,70,25);
        anime.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(anime);
        anime.setVisible(false);

        JLabel labelAnime = new JLabel("Anime");
        // labelAnime.setMargin( new Insets(5, 5, 5, 5) );
        labelAnime.setBounds(0,0,70,25);
        labelAnime.setHorizontalAlignment(JLabel.CENTER);
        labelAnime.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(labelAnime);
        labelAnime.setVisible(true);

        JButton tambah = new JButton("Tambah");
        tambah.setMargin( new Insets(5, 5, 5, 5) );
        tambah.setBounds(70,0,70,25);
        tambah.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(tambah);
        tambah.setVisible(true);

        JLabel labelTambah = new JLabel("Tambah");
        // labelTambah.setMargin( new Insets(5, 5, 5, 5) );
        labelTambah.setBounds(70,0,70,25);
        labelTambah.setHorizontalAlignment(JLabel.CENTER);
        labelTambah.setFont(new Font("Dialog", Font.PLAIN, 10));
        //add button to the frame
        formAdmin.add(labelTambah);
        labelTambah.setVisible(false);
    	
    	formAdmin.setVisible(true);

    	JPanel g = new panelAnime();
    	formAdmin.add(g);
    	g.setVisible(true);

    	JPanel t = new panelTambah();
    	formAdmin.add(t);
        t.setVisible(false);

    	tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	t.setVisible(true);
            	g.setVisible(false);
                anime.setVisible(true);
                labelAnime.setVisible(false);
                labelTambah.setVisible(true);
                tambah.setVisible(false);
            }

        });

        anime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	g.setVisible(true);
            	t.setVisible(false);
                anime.setVisible(false);
                labelAnime.setVisible(true);
                labelTambah.setVisible(false);
                tambah.setVisible(true);
            }

        });

	}
}