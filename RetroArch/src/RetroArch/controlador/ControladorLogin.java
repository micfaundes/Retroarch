
package RetroArch.controlador;

import RetroArch.modelo.TestBD;
import RetroArch.vista.VistaLogin;
import RetroArch.vista.VistaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author natal
 */
public class ControladorLogin {
    
    private TestBD bd;
    private VistaLogin vistaLogin;
    private VistaPrincipal vistaPrincipal;

    public ControladorLogin(TestBD bd, VistaLogin vista) {
        this.bd = bd;
        this.vistaLogin = vista;
    }

    public void handleLogin(String email, String password) {
        if (bd.validarCredenciales(email, password)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión correcto.", "Confirmación Login", 1);
            redirectLogin(email);
        } else {
            JOptionPane.showMessageDialog(null, "Error en el inicio de sesión.", "Confirmación Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void redirectLogin(String email) {
        vistaLogin.dispose(); // Cerramos la ventana de login
        this.vistaPrincipal = new VistaPrincipal(bd.obtenerUsuario(email));
        vistaPrincipal.setVisible(true); // Mostramos la ventana principal
    }
    
}
