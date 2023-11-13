package ClaseRecuadros;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Recuadro2 extends Thread 
{
    private int Tiempo;
    // Variable Controladora
    private volatile boolean Detener = false; 

    
    public Recuadro2(int Milisegundos)
    {
        
        this.Tiempo = Milisegundos;
    }
    
    public void DetenerRecuadro()
    {
        Detener = true;
    }
    
    
    public void run(){
        while(!Detener){
            
            int NumImagen = (int)(Math.random()*(5)+ 1);
            String Arch = "src\\Imagenes\\Icono"+ NumImagen + ".png";
            ImageIcon imageIcon = new ImageIcon(Arch);
            TragaMonedas.DiseñoMaquina.Recuadro2.setIcon(imageIcon);
            
            try
            {
                Thread.sleep(Tiempo);
            }catch(InterruptedException ex)
            {
                Logger.getLogger(Recuadro1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
