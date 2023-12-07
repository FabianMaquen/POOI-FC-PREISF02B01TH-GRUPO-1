package Funcionamiento;

import java.util.Objects;

public class Tarjeta {
    private String nombre;
    private String nroCuenta;
    private String mes;
    private String anho;
    private String CVV;
    
    public Tarjeta(){
        
    }
    
    public Tarjeta(String nombre, String nroCuenta, String mes, String anho, String CVV){
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.mes = mes;
        this.anho = anho;
        this.CVV = CVV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
    
    @Override
    public String toString(){
        return "Tarjeta{" + "nombreUsuario=" + nombre + "numeroCuenta=" + nroCuenta + "mes=" + mes + "anho=" + anho + "CVV" + CVV + '}';
    }
    
    public void confirmar(){
        
    }
    
    public void agregarUsuario(String nombre, String nroCuenta, String mes, String anho, String CVV){
        
    }
    
    public void cargarArchivo(){
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tarjeta tarjeta = (Tarjeta) obj;
        return Objects.equals(nombre, tarjeta.nombre) &&
               Objects.equals(nroCuenta, tarjeta.nroCuenta) &&
               Objects.equals(mes, tarjeta.mes) &&
               Objects.equals(anho, tarjeta.anho) &&
               Objects.equals(CVV, tarjeta.CVV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nroCuenta, mes, anho, CVV);
    }
    
}
