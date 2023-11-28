/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ListaTarjetas {
    private static ArrayList<Tarjeta> tarjetas;


public ListaTarjetas(){
    tarjetas = new ArrayList<>();
    cargarArchivo();
    }
    
    public ArrayList<Tarjeta> getTarjeta() {
        return this.tarjetas;
    }
    public void adicionar (Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }
    
       public void eliminar(Tarjeta tarjeta) {
        tarjetas.remove(tarjeta);
    }
    
    public void mostrar() {
        for(Tarjeta tar: tarjetas){
            System.out.println(tar.toString());
        }
    }
    
        
    public void registraTarjeta(String nombre,String nroCuenta,String mes , String anho,  String CVV){
        Tarjeta tar = new Tarjeta(nombre,nroCuenta,mes,anho,CVV);
        adicionar(tar);
        mostrar();
    }
    
        private void readFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String linea;
        
        while ((linea = br.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(linea, ",");
            createUser(st);
        } 
        br.close();
    }
        private void createUser(StringTokenizer st){
            String nombre = st.nextToken().trim();
            String nroCuenta = st.nextToken().trim();
            String mes = st.nextToken().trim();
            String anho = st.nextToken().trim();
            String CVV = st.nextToken().trim();
            Tarjeta tar = new Tarjeta(nombre,nroCuenta,mes,anho,CVV);
            adicionar(tar);
        }

    
    private void cargarArchivo() {
    try {
        File file = new File("./src/ListaTarjetas.txt");
        Class<ListaTarjetas> clazz = ListaTarjetas.class;
        InputStream inputStream = clazz.getResourceAsStream("/ListaTarjetas.txt");
        if (file.exists()) {
            readFromInputStream(inputStream);
        } else
            JOptionPane.showMessageDialog(null,"El archivo txt no existe");
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un error= " + x);
        }
    }
}