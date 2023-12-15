package Funcionamiento;

public class Curso {
    private String ID;
    private String nombreCurso;
    private String bloqueCurso;
    private String nombreDocente;
    private String correoDocente;
    private String fotoDocente;
    private String numeroCreditos;
    private String cicloCurso;
    private String nVecesCursado;
    private String horarioHora;
    private String horarioDia;
    private String silabo;
    private Aula aula;
    
    public Curso() {
        
    }

    public Curso(String nombreCurso, String bloqueCurso, String nombreDocente, String correoDocente, String fotoDocente, String numeroCreditos, String cicloCurso, String nVecesCursado, String horarioHora,String horarioDia, String silabo, String nCampus, String nPabellon, String nAula) {
        this.nombreCurso = nombreCurso;
        this.bloqueCurso = bloqueCurso;
        this.nombreDocente = nombreDocente;
        this.correoDocente = correoDocente;
        this.fotoDocente = fotoDocente;
        this.numeroCreditos = numeroCreditos;
        this.cicloCurso = cicloCurso;
        this.nVecesCursado = nVecesCursado;
        this.horarioHora = horarioHora;
        this.horarioDia = horarioDia;
        //this.silabo = silabo;
        this.aula = new Aula(nCampus, nPabellon, nAula);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getBloqueCurso() {
        return bloqueCurso;
    }

    public void setBloqueCurso(String bloqueCurso) {
        this.bloqueCurso = bloqueCurso;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getCorreoDocente() {
        return correoDocente;
    }

    public void setCorreoDocente(String correoDocente) {
        this.correoDocente = correoDocente;
    }

    public String getFotoDocente() {
        return fotoDocente;
    }

    public void setFotoDocente(String fotoDocente) {
        this.fotoDocente = fotoDocente;
    }

    public String getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(String numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getCicloCurso() {
        return cicloCurso;
    }

    public void setCicloCurso(String cicloCurso) {
        this.cicloCurso = cicloCurso;
    }

    public String getnVecesCursado() {
        return nVecesCursado;
    }

    public void setnVecesCursado(String nVecesCursado) {
        this.nVecesCursado = nVecesCursado;
    }

    public String getHorarioHora() {
        return horarioHora;
    }

    public void setHorarioHora(String horarioHora) {
        this.horarioHora = horarioHora;
    }

    public String getHorarioDia() {
        return horarioDia;
    }

    public void setHorarioDia(String horarioDia) {
        this.horarioDia = horarioDia;
    }

    public String getSilabo() {
        return silabo;
    }

    public void setSilabo(String silabo) {
        this.silabo = silabo;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curso{" + "ID=" + ID + ", nombreCurso=" + nombreCurso + ", bloqueCurso=" + bloqueCurso + ", nombreDocente=" + nombreDocente + ", correoDocente=" + correoDocente + ", fotoDocente=" + fotoDocente + ", numeroCreditos=" + numeroCreditos + ", cicloCurso=" + cicloCurso + ", nVecesCursado=" + nVecesCursado + ", horarioHora=" + horarioHora + ", horarioDia=" + horarioDia + ", silabo=" + silabo + ", aula=" + aula + '}';
    }
}
