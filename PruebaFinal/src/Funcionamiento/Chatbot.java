package Funcionamiento;
//TreeNode?
public class Chatbot {
    
    private String memoriaConversacion;
    private UsuarioPregunta pregunta;
    public Chatbot() {
        memoriaConversacion = "";
    }

    public void responder(String mensaje) {
        //Logica
    }
    public void iniciarConversacion() {
        memoriaConversacion = "¡Conversación iniciada!";
    }

    public void finalizarConversacion() {
        memoriaConversacion = "¡Conversación finalizada!";
    }

    public String memConversacion() {
        return memoriaConversacion;
    }
}
