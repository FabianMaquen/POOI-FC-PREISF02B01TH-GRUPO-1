package Funcionamiento;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ListaUsuarios {
    private static ArrayList<Usuario> usuarios;
    
    public ListaUsuarios() {
    usuarios = new ArrayList<>();
    cargarArchivo();
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public void adicionar(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void eliminar(Usuario usuario) {
        usuarios.remove(usuario);
    }
    
    public void mostrar() {
        for(Usuario us: usuarios){
            System.out.println(us.toString());
        }
    }
    
    public void registrarCliente(String nombreUsuario, String contrasenha, String correoUsuario, String nombreCompleto, String codigoUsuario, String fotocheckPequeño, String fotocheckGrande, String QR_Usuario, String mensualidad, String codigoCuota) {
        Usuario us = new Usuario(nombreUsuario,contrasenha,correoUsuario,nombreCompleto,codigoUsuario,fotocheckPequeño,fotocheckGrande,QR_Usuario,mensualidad,codigoCuota);
        adicionar(us);
        mostrar();
    }
    
    // Metodos para leer la lista de usuarios del txt
    
    private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createUser(st);
        } 
        br.close();
    }
    
    // M?todo que a?adir a los usuarios del archivo .txt en el arrayList usuarios.
    private void createUser(StringTokenizer st){
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
        Usuario us = new Usuario(nombreUsuario,contrasenha,correoUsuario,nombreCompleto,codigoUsuario,fotocheckPequeño,fotocheckGrande,QR_Usuario, mensualidad, codigoCuota);
        adicionar(us);
    }
    
    // M?todos para manipular el archivo de texto
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListaUsuarios.txt");
        Class<ListaUsuarios> clazz = ListaUsuarios.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListaUsuarios.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (HeadlessException | IOException x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
    
}
