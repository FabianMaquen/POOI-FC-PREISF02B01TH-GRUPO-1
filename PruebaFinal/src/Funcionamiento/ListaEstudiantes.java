package Funcionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ListaEstudiantes {
    private static ArrayList<Estudiante> estudiantes;
    
    public ListaEstudiantes() {
        estudiantes = new ArrayList<>();
        cargarArchivo();
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void adicionar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public void eliminar(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    
    public void mostrar() {
        for(Estudiante es: estudiantes){
            System.out.println(es.toString());
        }
    }
    
    public void registrarEstudiante(String nombreEstudiante, String contrasenha, String correoEstudiante, String nombreCompleto, String codigoEstudiante, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, String mensualidad, String codigoCuota) {
        Estudiante es = new Estudiante(nombreEstudiante,contrasenha,correoEstudiante,nombreCompleto,codigoEstudiante,fotocheckPequeño,fotocheckGrande,QR_Usuario,mensualidad,codigoCuota);
        adicionar(es);
        mostrar();
    }
    
    // Metodos para leer la lista de estudiantes del txt
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createStudent(st);
        } 
        br.close();
    }
    
    // Método que añadir a los estudiantes del archivo .txt en el arrayList estudiantes.
    private void createStudent(StringTokenizer st){
        String nombreEstudiante = st.nextToken().trim();
        String contrasenha = st.nextToken().trim();
        String correoEstudiante = st.nextToken().trim();
        String nombreCompleto = st.nextToken().trim();
        String codigoEstudiante = st.nextToken().trim();
        String fotocheckPequeño = st.nextToken().trim();       
        String fotocheckGrande = st.nextToken().trim();
        String QR_Usuario = st.nextToken().trim();     
        String mensualidad = st.nextToken().trim();
        String codigoCuota = st.nextToken().trim();
        Estudiante es = new Estudiante(nombreEstudiante,contrasenha,correoEstudiante,nombreCompleto,codigoEstudiante,fotocheckPequeño,fotocheckGrande,QR_Usuario, mensualidad, codigoCuota);
        adicionar(es);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListaEstudiantes.txt");
        Class<ListaEstudiantes> clazz = ListaEstudiantes.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListaEstudiantes.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }  
}
