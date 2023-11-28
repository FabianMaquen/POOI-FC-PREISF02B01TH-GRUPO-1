package Funcionamiento;

public class Aula {
    private String nCampus;
    private String nPabellon;
    private String nAula;

    public Aula(String nCampus, String nPabellon, String nAula) {
        this.nCampus = nCampus;
        this.nPabellon = nPabellon;
        this.nAula = nAula;
    }

    public String getnCampus() {
        return nCampus;
    }

    public void setnCampus(String nCampus) {
        this.nCampus = nCampus;
    }

    public String getnPabellon() {
        return nPabellon;
    }

    public void setnPabellon(String nPabellon) {
        this.nPabellon = nPabellon;
    }

    public String getnAula() {
        return nAula;
    }

    public void setnAula(String nAula) {
        this.nAula = nAula;
    }

    @Override
    public String toString() {
        return "Aula{" + "nCampus=" + nCampus + ", nPabellon=" + nPabellon + ", nAula=" + nAula + '}';
    }
}
