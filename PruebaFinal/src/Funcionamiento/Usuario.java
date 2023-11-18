package Funcionamiento;

public class Usuario {

    private String nombreUsuario;
    private String contrasenha;
    private String correoUsuario;
    private String nombreCompleto;
    private double codigoUsuario;
    private String fotocheckPequeño;
    private String fotocheckGrande;
    private String QR_Usuario;
    
    public Usuario(){
        
    }

    public Usuario(String nombreUsuario, String contrasenha, String correoUsuario, String nombreCompleto, double codigoUsuario, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.correoUsuario = correoUsuario;
        this.nombreCompleto = nombreCompleto;
        this.codigoUsuario = codigoUsuario;
        this.fotocheckPequeño = fotocheckPequeño;
        this.fotocheckGrande = fotocheckGrande;
        this.QR_Usuario = QR_Usuario;
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

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
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

    public String getFotocheckPequeño() {
        return fotocheckPequeño;
    }

    public void setFotocheckPequeño(String fotocheckPequeño) {
        this.fotocheckPequeño = fotocheckPequeño;
    }

    public String getFotocheckGrande() {
        return fotocheckGrande;
    }

    public void setFotocheckGrande(String fotocheckGrande) {
        this.fotocheckGrande = fotocheckGrande;
    }
    
    public String getQR_Usuario() {
        return QR_Usuario;
    }

    public void setQR_Usuario(String QR_Usuario) {
        this.QR_Usuario = QR_Usuario;
    }
    
    public void confirmar(){
    }
    
    public void agregarUsuario(String nombreUsuario, String contrasenha, String nombreCompleto, double codigoUsuario){
        
    }
    
    public void cargarArchivo(){
        
    }
}
