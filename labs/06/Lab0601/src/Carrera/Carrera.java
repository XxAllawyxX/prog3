package Carrera;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Carrera extends Thread 
{
    //Variables
    private JLabel Etiqueta;
    private FrameCarrera Auto;

    //Constructor
    public Carrera(JLabel Etiqueta, FrameCarrera Auto) 
    {
        this.Etiqueta = Etiqueta;
        this.Auto = Auto;
    }
    
    @Override
    public void run()
    {
        int Auto1 = 0;
        int Auto2 = 0;
        int Auto3 = 0;
        int Auto4 = 0;
        
        while (true)
        {
            try
            {
                sleep((int)(Math.random()*1000));
                Auto1 = Auto.getAuto1().getLocation().x;
                Auto2 = Auto.getAuto2().getLocation().x;
                Auto3 = Auto.getAuto3().getLocation().x;
                Auto4 = Auto.getAuto4().getLocation().x;
                
                if (Auto1 < Auto.getMeta().getLocation().x -150 && Auto2 < Auto.getMeta().getLocation().x -150 && Auto3 < Auto.getMeta().getLocation().x -150 && Auto4 < Auto.getMeta().getLocation().x -150)
                {
                    Etiqueta.setLocation(Etiqueta.getLocation().x + 10, Etiqueta.getLocation().y); 
                    Auto.repaint();
                }else
                {
                    break;
                }
                
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
            if(Etiqueta.getLocation().x >= Auto.getMeta().getLocation().x -150)
            {
                    if(Auto1 > Auto2 && Auto1>Auto3 && Auto1> Auto4)
                    {
                       JOptionPane.showMessageDialog(null,"Gano el Auto 1!!!!!");
                    }
                    else if (Auto2 > Auto1 && Auto2>Auto3 && Auto2> Auto4)
                    {
                        JOptionPane.showMessageDialog(null,"Gano el Auto 2!!!!!");
                    }
                    else if(Auto3 > Auto1 && Auto3>Auto2 && Auto3> Auto4)
                    {
                         JOptionPane.showMessageDialog(null,"Gano el Auto 3!!!!!");
                    }
                    else if (Auto4 > Auto1 && Auto4>Auto2 && Auto4> Auto3)
                    {
                         JOptionPane.showMessageDialog(null,"Gano el Auto 4!!!!!");
                    }
                    else 
                    {
                         JOptionPane.showMessageDialog(null,"Hubo un Empate!!!");
                    }
                    
            }
        }
    }
   
}
    