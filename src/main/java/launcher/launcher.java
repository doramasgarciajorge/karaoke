package launcher;

import com.formdev.flatlaf.FlatIntelliJLaf;
import gui.Aplicacion;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
------------------------------------------------------------
> KARAOKE

- AUTHOR:     Doramas García Jorge
- EMAIL:      dev.doramas@gmail.com
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/karaoke
------------------------------------------------------------
*/

public class launcher {
    
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatIntelliJLaf()); //CAMBIA EL TEMA
        new Aplicacion();   //INICIA LA APLICACION, NO LA HACEMOS VISIBLE PORQUE NOS 
                            //INTERESA QUE SE INICIE PRIMERO UN DIALOGO
    }
    
}