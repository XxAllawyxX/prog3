
package ClasesRecuadro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class Recuadro1  extends Thread
{
     private int Tiempo;
     
     public Recuadro1(int Milisegundos) {
        this.Tiempo = Milisegundos;
    }
     
     public void run() 
     {
        while (true) 
        {
            int numero = (int) (Math.random() * (7) + 1);
            String ruta = "src\\Imagenes\\Icono " + numero + ".png";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Vista.FrameTragaMonedas.lblRecuadro1.setIcon(imageIcon);
            try {
                Thread.sleep(this.Tiempo);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Recuadro1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
