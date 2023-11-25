
package RetroArch.modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author natal
 */
public class TestBD {

    private ArrayList<Consola> consola;
    private ArrayList<Editora> editora;
    private ArrayList<Juego> juego;
    private ArrayList<Usuario> usuarios;
    private ArrayList<String> colecciones;

    public TestBD() {

        this.consola = new ArrayList<>();
        this.editora = new ArrayList<>();
        this.juego = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.colecciones = new ArrayList<>();

        agregarDatosMockUp();
    }

    public ArrayList<Juego> getJuegos() {
        return this.juego;
    }

    public ArrayList<String> obtenerColecciones() {
        return this.colecciones;
    }

    public ArrayList<Juego> obtenerJuegosPorTitulo(String titulo) {
        ArrayList<Juego> juegosEncontrados = new ArrayList<>();

        for (Juego juego : juego) {
            if (juego.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                juegosEncontrados.add(juego);
            }
        }
        return juegosEncontrados;

    }
    
    public ArrayList<Juego> obtenerJuegoPortitulo(String titulo) {
        ArrayList<Juego> juegosEncontrados = new ArrayList<>();

        for (Juego juego : juego) {
            if (juego.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                juegosEncontrados.add(juego);
            }
        }
        return juegosEncontrados;
    }
    
      public ArrayList<Juego> obtenerJuegoPorgenero(String genero) {
        ArrayList<Juego> juegosEncontrados = new ArrayList<>();

        for (Juego juego: juego) {
            if (juego.getGenero().equals(genero)) {
                juegosEncontrados.add(juego);
            }
        }
        return juegosEncontrados;
    }

    public Juego obtenerLibroPorId(int id) {
        for (Juego juego : juego) {
            if (juego.getId() == id) {
                return juego;
            }
        }
        return null;
    }

    public void actualizarJuego(Juego juegosActualizado) {
        // Reemplaza el libro antiguo con el nuevo libro editado
        for (int i = 0; i < juego.size(); i++) {
            if (juego.get(i).getId() == juegosActualizado.getId()) {
                juego.set(i, juegosActualizado);
                break;
            }
        }
    }
    
    public void eliminarLibro(int id) {
       juego.removeIf(juego -> juego.getId() == id);
    }

    /**
     * Método que llena la BD simulada con datos.
     *
     * Método que permite llenar la BD simulada por arreglos con información
     * dummy. Este método se inicializa en el constructor de modo que la BD
     * simulada tenga datos desde el inicio de la ejecución del programa
     */
    private void agregarDatosMockUp() {

        //Datos de libros
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        this.juego.add(new Juego());
        
        //Datos de Bibliotecarios
        this.usuarios.add(new Usuario(1, "11.111.111-1", "Admin", "Admin", "admin", "admin123"));
        this.usuarios.add(new Usuario(1, "19.345.678-9", "Juan", "Pérez", "juan.perez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(2, "15.234.567-8", "María", "Rodríguez", "maria.rodriguez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(3, "12.123.456-7", "Carlos", "Soto", "carlos.soto@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(4, "17.456.789-0", "Ana", "González", "ana.gonzalez@biblioteca.com", "admin123"));
        this.usuarios.add(new Usuario(5, "20.567.890-k", "Pedro", "Morales", "pedro.morales@biblioteca.com", "admin123"));

        //Colecciones
        this.colecciones.add("Accion");
        this.colecciones.add("Plataforma");
        this.colecciones.add("Rpg");
        this.colecciones.add("Pussle");
        this.colecciones.add("beep it up");

    }

    public boolean validarCredenciales(String email, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email) && usuario.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public Usuario obtenerUsuario(String email) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null;
    }

    public int getMaxId() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Juego juego : this.juego) {
            ids.add(juego.getId());
        }
        int maxId = Collections.max(ids);
        return maxId;
    }
}

    

    

