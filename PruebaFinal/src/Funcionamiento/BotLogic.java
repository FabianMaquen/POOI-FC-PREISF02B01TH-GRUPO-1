/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionamiento;

public class BotLogic {
    private TreeNode root;
    public BotLogic() {
        InformacionFinal respuestaFinal = new InformacionFinal();
        //INGRESAR EL VALOR DE LOS NODOS HIJOS CON EL ROOT PRINCIPAL 
        root = new TreeNode("Raíz", 8);
        root.setOpcion(0, new TreeNode("  Becas y Ayuda Académica.\n \n     1 Solicitud de Becas.\n     2 Requisitos de admisión.", 2));
        root.setOpcion(1, new TreeNode("  Actividades extracurriculares y Clubes Estudiantiles.\n   \n     1 ¿Cómo Unirse a Un Club?\n      2 Eventos y Actividades Disponibles", 2));
        root.setOpcion(2, new TreeNode("  Orientación para prácticas.\n \n      1 Oportunidades laborales actuales.\n      2 Cómo elaborar tu curriculum", 2));
        root.setOpcion(3, new TreeNode("  Atención presencial.\n\n      1 Horarios de atención.\n      2 Separar cita", 2));
        root.setOpcion(4, new TreeNode("  Opciones de estudios en el extranjero.\n\n      1 Programas intercambio estudiantil.\n      2 Convenio con universidades internacionales", 2));
        root.setOpcion(5, new TreeNode("  Trámites Estudiantiles.\n\n      1 Obtención de carnet universitario.\n      2 Retiro de periodo y/o curso", 2));
        root.setOpcion(6, new TreeNode("  Pagos estudiantiles.\n \n     1 Métodos de pago.\n      2 Plazos y fechas de pago.", 2));
        root.setOpcion(7, new TreeNode("  Ingresa su palabra clave: ", 1));

        // Anteriores nodos hojas insertados en los nodos hijos correspondientes
        root.getOpcion(0).setOpcion(0, new TreeNode(respuestaFinal.getAu(), 0));
        root.getOpcion(0).setOpcion(1, new TreeNode(respuestaFinal.getAd(), 0));
        root.getOpcion(1).setOpcion(0, new TreeNode(respuestaFinal.getBu(), 0));
        root.getOpcion(1).setOpcion(1, new TreeNode(respuestaFinal.getBd(), 0));
        root.getOpcion(2).setOpcion(0, new TreeNode(respuestaFinal.getCu(), 0));
        root.getOpcion(2).setOpcion(1, new TreeNode(respuestaFinal.getCd(), 0));
        root.getOpcion(3).setOpcion(0, new TreeNode(respuestaFinal.getDu(), 0));
        root.getOpcion(3).setOpcion(1, new TreeNode(respuestaFinal.getDd(), 0));
        root.getOpcion(4).setOpcion(0, new TreeNode(respuestaFinal.getEu(), 0));
        root.getOpcion(4).setOpcion(1, new TreeNode(respuestaFinal.getEd(), 0));
        root.getOpcion(5).setOpcion(0, new TreeNode(respuestaFinal.getFu(), 0));
        root.getOpcion(5).setOpcion(1, new TreeNode(respuestaFinal.getFd(), 0));
        root.getOpcion(6).setOpcion(0, new TreeNode(respuestaFinal.getGu(), 0));
        root.getOpcion(6).setOpcion(1, new TreeNode(respuestaFinal.getGd(), 0));
    }

    

    public TreeNode getRoot() {
        return root;
    }
}

              