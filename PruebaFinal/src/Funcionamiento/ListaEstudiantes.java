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
    private static ArrayList<Estudiante> usuarios;
    
    public ListaEstudiantes() {
        usuarios = new ArrayList<>();
        cargarArchivo();
    }
    
    public ArrayList<Estudiante> getUsuarios() {
        return usuarios;
    }
    
    public void adicionar(Estudiante usuario) {
        usuarios.add(usuario);
    }
    
    public void eliminar(Estudiante usuario) {
        usuarios.remove(usuario);
    }
    
    public void mostrar() {
        for(Estudiante us: usuarios){
            System.out.println(us.toString());
        }
    }
    
    public void registrarEstudiante(String nombreUsuario, String contrasenha, String correoUsuario, String nombreCompleto, String codigoUsuario, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, String mensualidad, String codigoCuota) {
        Estudiante us = new Estudiante(nombreUsuario,contrasenha,correoUsuario,nombreCompleto,codigoUsuario,fotocheckPequeño,fotocheckGrande,QR_Usuario,mensualidad,codigoCuota);
        adicionar(us);
        mostrar();
    }
    
    // Metodos para leer la lista de usuarios del txt
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createStudent(st);
        } 
        br.close();
    }
    
    // M?todo que a?adir a los usuarios del archivo .txt en el arrayList usuarios.
    private void createStudent(StringTokenizer st){
        String nombreUsuario = st.nextToken().trim();
        String contrasenha = st.nextToken().trim();
        String correoUsuario = st.nextToken().trim();
        String nombreCompleto = st.nextToken().trim();
        String codigoUsuario = st.nextToken().trim();
        String fotocheckPequeño = st.nextToken().trim();       
        String fotocheckGrande = st.nextToken().trim();
        String QR_Usuario = st.nextToken().trim();     
        String mensualidad = st.nextToken().trim();
        String codigoCuota = st.nextToken().trim();
        Estudiante us = new Estudiante(nombreUsuario,contrasenha,correoUsuario,nombreCompleto,codigoUsuario,fotocheckPequeño,fotocheckGrande,QR_Usuario, mensualidad, codigoCuota);
        adicionar(us);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListaUsuarios.txt");
        Class<ListaEstudiantes> clazz = ListaEstudiantes.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListaUsuarios.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }  
}
