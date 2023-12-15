package Funcionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ListaCursos {

    private static Map<String, List<Curso>> cursos;  // Cambiando a HashMap con String como clave

    public ListaCursos() {
        cursos = new HashMap<>();  // Inicializando como HashMap
        cargarArchivo();
    }

    public List<Curso> getCursos(String ID) {
        return cursos.get(ID);
    }

    public void adicionar(Curso curso) {
        String ID = curso.getID();
        cursos.computeIfAbsent(ID, k -> new ArrayList<>()).add(curso);
    }
    
    public void eliminar(String ID) {
        cursos.remove(ID);
    }

    public void mostrar() {
        for (List<Curso> listaCursos : cursos.values()) {
            for (Curso curso : listaCursos) {
                System.out.println(curso.toString());
            }
        }
    }
    
    public void registrarCurso(String nombreCurso, String bloqueCurso, String nombreDocente, String correoDocente, String fotoDocente, String numeroCreditos, String cicloCurso, String nVecesCursado, String horarioHora, String horarioDia, String silabo, String nCampus, String nPabellon, String nAula) {
        Curso cs = new Curso(nombreCurso, bloqueCurso, nombreDocente, correoDocente, fotoDocente, numeroCreditos, cicloCurso, nVecesCursado, horarioHora, horarioDia, silabo, nCampus, nPabellon, nAula);
        adicionar(cs);
        mostrar();
    }
    
    // Metodos para leer la lista de cursos del txt
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createCourse(st);
        } 
        br.close();
    }
    
    // Método que añadir a los usuarios del archivo .txt en el arrayList cursos.
    private void createCourse(StringTokenizer st){
        String ID = st.nextToken().trim();
        String nombreCurso = st.nextToken().trim();
        String bloqueCurso = st.nextToken().trim();
        String nombreDocente = st.nextToken().trim();
        String correoDocente = st.nextToken().trim();
        String fotoDocente = st.nextToken().trim();
        String numeroCreditos = st.nextToken().trim();
        String cicloCurso = st.nextToken().trim();
        String nVecesCursado = st.nextToken().trim();
        String horarioHora = st.nextToken().trim();
        String horarioDia = st.nextToken().trim();
        String silabo = st.nextToken().trim();
        String nCampus = st.nextToken().trim();
        String nPabellon = st.nextToken().trim();   
        String nAula = st.nextToken().trim(); 
        Curso cs = new Curso(nombreCurso, bloqueCurso, nombreDocente, correoDocente, fotoDocente, numeroCreditos, cicloCurso, nVecesCursado, horarioHora, horarioDia, silabo, nCampus, nPabellon, nAula);
        cs.setID(ID); // Establecer el ID en el curso
        adicionar(cs);
    }
    
    // M?todos para manipular el archivo de texto
    void cargarArchivo() {
    try {
        File file = new File("./src/ListaCursos.txt");
        Class<ListaEstudiantes> clazz = ListaEstudiantes.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListaCursos.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
}
