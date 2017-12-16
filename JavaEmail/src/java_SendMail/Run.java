package java_SendMail;
/*
 * code by Duy
 */

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
public class Run {
	
		  public static void main(String[] args) {
		        // set look and feel to system dependent
		        try {
		            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		         
		        SwingUtilities.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		                new GUISendEmail().setVisible(true);
		            }
		        });
		    }
		}



