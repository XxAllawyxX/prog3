
package gestionexcel;
import Modelo.ModeloExcel;
import Vista.VistaExcel;
import Controlador.ControladorExcel;


public class GestionExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModeloExcel modeloE = new ModeloExcel();
        VistaExcel vistaE = new VistaExcel();
        ControladorExcel contraControladorExcel = new ControladorExcel(vistaE, modeloE);
        vistaE.setVisible(true);
        vistaE.setLocationRelativeTo(null);
    }
    
}
