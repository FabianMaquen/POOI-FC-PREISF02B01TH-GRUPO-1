package Funcionamiento;

import java.util.List;

public class Estudiante {

    private String nombreEstudiante;
    private String contrasenha;
    private String correoEstudiante;
    private String nombreCompleto;
    private String codigoEstudiante;
    private String fotocheckPequeño;
    private String fotocheckGrande;
    private String QR_Usuario;
    private List<Curso> cursos;
    private String mensualidad;
    private String codigoCuota;

    public Estudiante(String nombreEstudiante, String contrasenha, String correoEstudiante, String nombreCompleto, String codigoEstudiante, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, String mensualidad, String codigoCuota) {
        this.nombreEstudiante = nombreEstudiante;
        this.contrasenha = contrasenha;
        this.correoEstudiante = correoEstudiante;
        this.nombreCompleto = nombreCompleto;
        this.codigoEstudiante = codigoEstudiante;
        this.fotocheckPequeño = fotocheckPequeño;
        this.fotocheckGrande = fotocheckGrande;
        this.QR_Usuario = QR_Usuario;
        this.mensualidad = mensualidad;
        this.codigoCuota = codigoCuota;
    }

    public Estudiante(String nombreEstudiante, String contrasenha, String correoEstudiante, String nombreCompleto, String codigoEstudiante, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, List<Curso> cursos, String mensualidad, String codigoCuota) {
        this.nombreEstudiante = nombreEstudiante;
        this.contrasenha = contrasenha;
        this.correoEstudiante = correoEstudiante;
        this.nombreCompleto = nombreCompleto;
        this.codigoEstudiante = codigoEstudiante;
        this.fotocheckPequeño = fotocheckPequeño;
        this.fotocheckGrande = fotocheckGrande;
        this.QR_Usuario = QR_Usuario;
        this.cursos = cursos;
        this.mensualidad = mensualidad;
        this.codigoCuota = codigoCuota;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
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
        return "Estudiante{" + "nombreEstudiante=" + nombreEstudiante + ", contrasenha=" + contrasenha + ", correoEstudiante=" + correoEstudiante + ", nombreCompleto=" + nombreCompleto + ", codigoEstudiante=" + codigoEstudiante + ", fotocheckPeque\u00f1o=" + fotocheckPequeño + ", fotocheckGrande=" + fotocheckGrande + ", QR_Usuario=" + QR_Usuario + ", cursos=" + cursos + ", mensualidad=" + mensualidad + ", codigoCuota=" + codigoCuota + '}';
    }
}
