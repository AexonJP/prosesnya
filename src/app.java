import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;


public class app{
     void sleep(Integer lama){
          try {
               Thread.currentThread().sleep(lama);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
     }

     public void infoBox(String infoMessage, String titleBar)
     {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
     }

     public static void main(String[] args) {
          (new loginUser()).loginUser(150,200);
          // sleep(3000);
          // (new admin()).admins();
          // (new menuAdmin()).menuAdmin();
     }
}
