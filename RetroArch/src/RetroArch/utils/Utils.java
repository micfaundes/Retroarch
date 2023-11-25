
package RetroArch.utils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author natal
 */
public class Utils {
    
    private static final String ICON_PATH = "/C:/Users/natal/OneDrive/Escritorio/icon_3000a4.png/";
    
     public static void cambiarIconoFrame(JFrame frame) {
        try {
            ImageIcon icon = new ImageIcon(Utils.class.getResource(ICON_PATH));
            frame.setIconImage(icon.getImage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
}
