/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;

/**
 *
 * @author ALFONSO BARRENECHEA
 */
public class TreeNode {
    private String mensaje;
    private TreeNode[] opciones;

    public TreeNode(String mensaje, int numOpciones) {
        this.mensaje = mensaje;
        this.opciones = new TreeNode[numOpciones];
    }

    public void setOpcion(int index, TreeNode opcion) {
        opciones[index] = opcion;
    }

    public TreeNode getOpcion(int index) {
        return opciones[index];
    }

    public String getMensaje() {
        return mensaje;
    }

    public TreeNode[] getOpciones() {
        return opciones;
    }
}