package Funcionamiento;

public class Usuario {

    private String nombreUsuario;
    private String contrasenha;
    
    public Usuario() {
        this.nombreUsuario = "";
        this.contrasenha = "";
    }
    
    public Usuario(String nombreUsuario, String contrasenha) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
    }
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
    
    public void confirmar(){
    }
    
    public void agregarUsuario(String nombreUsuario, String contrasenha){
        
    }
    
    public void cargarArchivo(){
        
    }
}
