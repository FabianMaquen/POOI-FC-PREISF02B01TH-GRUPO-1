package Funcionamiento;

public class Usuario {

    private String nombreUsuario;
    private String contrasenha;
    private String nombreCompleto;
    private double codigoUsuario;

    public Usuario(String nombreUsuario, String contrasenha, String nombreCompleto, double codigoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.nombreCompleto = nombreCompleto;
        this.codigoUsuario = codigoUsuario;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(double codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    public void confirmar(){
    }
    
    public void agregarUsuario(String nombreUsuario, String contrasenha){
        
    }
    
    public void cargarArchivo(){
        
    }
}
