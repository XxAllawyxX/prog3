
package ClasesRecuadro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Recuadro2 extends Thread
{
    private int Tiempo;
    
    public Recuadro2(int Milisegundos)
    {
        this.Tiempo = Milisegundos;
    }
    
    public void run()
    {
        while (true) 
        {
            int Numero = (int) (Math.random() * (7) + 1);
            String ruta = "src\\Imagenes\\Icono " + Numero + ".PNG";
            ImageIcon imageIcon = new ImageIcon(ruta);
            Vista.FrameTragaMonedas.lblRecuadro2.setIcon(imageIcon);
            try {
                Thread.sleep(this.Tiempo);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Recuadro2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
