import javax.swing.*;
// import java.awt.event.*;
// import java.awt.*;
import java.awt.event.*;
import java.awt.*;
// import java.util.concurrent.TimeUnit;
// import javax.swing.JOptionPane;

public class loginUser extends akun{

    void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }


    void loginUser(int x, int y) {
        JFrame FormLogin= new JFrame("di user");
        FormLogin.setSize(300,390);
        // FormLogin.setMinimumSize(500,400);
        FormLogin.setLocation(x,y);
        FormLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // FormLogin.setDefaultLookAndFeelDecorated(true);
        FormLogin.setLayout(null);
        // FormLogin.setVisible(true);

        JLabel label1 = new JLabel("Username");
        label1.setBounds(120,30, 200, 30);
        FormLogin.add(label1);

        JTextField tbUser = new JTextField(20){
      @Override 
      protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
          Graphics2D g2 = (Graphics2D) g.create();
          g2.setPaint(getBackground());
          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
              0, 0, getWidth() - 1, getHeight() - 1));
          g2.dispose();
        }
        super.paintComponent(g);
      }
      
      @Override
    public void updateUI() {
        super.updateUI();
        setOpaque(false);
        setBorder(new RoundedCornerBorder());
      }
    };;
        tbUser.setBounds(50, 65, 200, 20);
        FormLogin.add(tbUser);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(120,110, 200, 30);
        FormLogin.add(label2);

        JTextField tbPass = new JTextField(20){
      @Override 
      protected void paintComponent(Graphics g) {
        if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
          Graphics2D g2 = (Graphics2D) g.create();
          g2.setPaint(getBackground());
          g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(
              0, 0, getWidth() - 1, getHeight() - 1));
          g2.dispose();
        }
        super.paintComponent(g);
      }
      
      @Override
    public void updateUI() {
        super.updateUI();
        setOpaque(false);
        setBorder(new RoundedCornerBorder());
      }
    };;
        tbPass.setBounds(50, 145, 200, 20);
        FormLogin.add(tbPass);

        JButton cek= new JButton("tambah");
        cek.setBounds(95, 220, 100, 30);
        //add button to the frame
        FormLogin.add(cek);

        JButton admin= new JButton("admin");
        admin.setMargin( new Insets(5, 5, 5, 5) );
        admin.setBounds(0,0,50,20);
        admin.setFont(new Font("Dialog", Font.PLAIN, 11));
        //add button to the frame
        FormLogin.add(admin);

        FormLogin.setVisible(true);


        admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                (new loginAdmin()).loginAdmin(FormLogin.getX(),FormLogin.getY());
                FormLogin.dispose();
            }
        });
        cek.addActionListener(new ActionListener() {
              @Override
               public void actionPerformed(ActionEvent e) {
                  //your actions
                    if (tbUser.getText().equals(user) && tbPass.getText().equals(pass)){
                        infoBox("alhamdulillah bener", "Login");


                    }
                    else{
                        infoBox("Username atau Password salah", "Login");

                        // FormLogin.add((new anime()).lihatAnime());
                    }
                    // infoBox("kena password anjay", "anjay");
               }

          });


        
    }
}