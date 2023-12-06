package Funcionamiento;

public class Curso {
    private String nombreCurso;
    private String bloqueCurso;
    private String nombreDocente;
    private String correoDocente;
    private String fotoDocente;
    private String numeroCreditos;
    private Aula aula;
    
    public Curso() {
        
    }

    public Curso(String nombreCurso, String bloqueCurso, String nombreDocente, String correoDocente,
                 String fotoDocente, String numeroCreditos, String nCampus, String nPabellon, String nAula) {
        this.nombreCurso = nombreCurso;
        this.bloqueCurso = bloqueCurso;
        this.nombreDocente = nombreDocente;
        this.correoDocente = correoDocente;
        this.fotoDocente = fotoDocente;
        this.numeroCreditos = numeroCreditos;
        this.aula = new Aula(nCampus, nPabellon, nAula);
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

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", bloqueCurso=" + bloqueCurso + ", nombreDocente=" + nombreDocente + ", correoDocente=" + correoDocente + ", fotoDocente=" + fotoDocente + ", numeroCreditos=" + numeroCreditos + ", aula=" + aula.toString() + '}';
    }
}
