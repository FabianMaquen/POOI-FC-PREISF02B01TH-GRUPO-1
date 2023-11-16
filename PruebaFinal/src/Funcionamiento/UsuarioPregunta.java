package Funcionamiento;

public class UsuarioPregunta extends Usuario {
    
    private Usuario usuario;

    public UsuarioPregunta() {
    }

    public UsuarioPregunta(String nombreUsuario, String contrasenha) {
        super(nombreUsuario, contrasenha);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void iniciar() {
    }
    
    public void mostrarMensaje() {
    }
    
    public void mensajeUsuario() {
    }
    
    public void mostrarRespuesta() {
    }
}
