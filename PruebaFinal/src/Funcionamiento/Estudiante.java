package Funcionamiento;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombreUsuario;
    private String contrasenha;
    private String correoUsuario;
    private String nombreCompleto;
    private String codigoUsuario;
    private String fotocheckPequeño;
    private String fotocheckGrande;
    private String QR_Usuario;
    private List<Curso> cursos;
    private String mensualidad;
    private String codigoCuota;
    
     
    public Estudiante(String nombreUsuario, String contrasenha, String correoUsuario, String nombreCompleto, String codigoUsuario, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, String mensualidad, String codigoCuota) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.correoUsuario = correoUsuario;
        this.nombreCompleto = nombreCompleto;
        this.codigoUsuario = codigoUsuario;
        this.fotocheckPequeño = fotocheckPequeño;
        this.fotocheckGrande = fotocheckGrande;
        this.QR_Usuario = QR_Usuario;
        this.mensualidad = mensualidad;
        this.codigoCuota = codigoCuota;
    }
    
    public Estudiante(String nombreUsuario, String contrasenha, String correoUsuario, String nombreCompleto, String codigoUsuario, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, List<Curso> cursos, String mensualidad, String codigoCuota) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenha = contrasenha;
        this.correoUsuario = correoUsuario;
        this.nombreCompleto = nombreCompleto;
        this.codigoUsuario = codigoUsuario;
        this.fotocheckPequeño = fotocheckPequeño;
        this.fotocheckGrande = fotocheckGrande;
        this.QR_Usuario = QR_Usuario;
        this.cursos = cursos;
        this.mensualidad = mensualidad;
        this.codigoCuota = codigoCuota;
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

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public String getCodigoCuota() {
        return codigoCuota;
    }

    public void setCodigoCuota(String codigoCuota) {
        this.codigoCuota = codigoCuota;
    }

    public String getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(String mensualidad) {
        this.mensualidad = mensualidad;
    }
    

    @Override
    public String toString() {
        return "Estudiante{" + "nombreUsuario=" + nombreUsuario + ", contrasenha=" + contrasenha + ", correoUsuario=" + correoUsuario + ", nombreCompleto=" + nombreCompleto + ", codigoUsuario=" + codigoUsuario + ", fotocheckPeque\u00f1o=" + fotocheckPequeño + ", fotocheckGrande=" + fotocheckGrande + ", QR_Usuario=" + QR_Usuario + ", cursos=" + cursos + ", codigoCuota=" + codigoCuota + '}';
    }   
}
