package Funcionamiento;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios{
    
    public static List<Usuario> usuarios;
    
    static {
        usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario("franco.almerco","franco", "franco.almerco@usil.pe", "Almerco Alaya, Franco Raúl", 2312782, "/images/Foto_Franco60x60.png","",""));
        usuarios.add(new Usuario("alondra.gonzales","alondra",  "alondra.gonzales@usil.pe","Gonzales Cuaresma, Alondra Yamileth", 2312461,"/images/Foto_Alondra60x60.png","",""));
        usuarios.add(new Usuario("fabian.maquen","fabian",  "fabian.maquen@usil.pe","Maquen Caisan, Fabian",2311685,"/images/Foto_Fabian60x60.png","",""));
        usuarios.add(new Usuario("omar.morales","omar",  "omar.morales@usil.pe","Morales Silva, Omar Jean Piere", 2313215, "/images/Foto_Omar60x60.png","",""));
        usuarios.add(new Usuario("nefi.valderrama","nefi", "nefi.valderrama@usil.pe", "Valderrama Vilca, Nefi Bitner", 2311081, "/images/Foto_Nefi60x60.png","",""));
    }
    
}
