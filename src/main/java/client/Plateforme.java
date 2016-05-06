package client;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Plateforme{


	public static void main(String args[]) {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
		}
        
        
		 java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 HomeSTB accueil = new HomeSTB();
                 accueil.setVisible(true);
                 
             }
         });
                     
}
}



		