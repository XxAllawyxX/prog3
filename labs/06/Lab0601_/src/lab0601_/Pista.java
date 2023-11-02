
package lab0601_;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Pista extends JFrame  
{
    JLabel lbAuto1,lbAuto2,lbAuto3,lbPistaFondo;
    JButton BotonInicio;
    
    
    
    // Constructor 
    public Pista()
    {
        super("Carrera de Autos");
        
        getContentPane().setLayout(null); // Permite colocar los componentes en la posicion que se desee. 
        
        lbPistaFondo = new JLabel();
        getContentPane().add(lbPistaFondo); // Agrega el frame
        lbPistaFondo.setIcon(new ImageIcon(getClass().getResource("Autopista.png"))); // Imagen de Autopista
        lbPistaFondo.setBounds(100,0,20000 ,500); // Posicion de la Autopista
        
        
        //Auto 1
        lbAuto1 = new JLabel("Auto 1");
        getContentPane().add(lbAuto1);
        lbAuto1.setBounds(0,0,100,50);
        //Auto 2
        lbAuto2 = new JLabel("Auto 2");
        getContentPane().add(lbAuto2);
        lbAuto2.setBounds(0,100 ,100,50);
        //Auto 3 
        lbAuto3 = new JLabel("Auto 3");
        getContentPane().add(lbAuto3);
        lbAuto3.setBounds(0,200,100,50);


        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Operacion de salida
        setBounds(0,0,500,500); // Posicion inicial de la ventana
        setVisible(true); // Visibilidad de la ventana
        
        
    }
}
