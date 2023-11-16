import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaPedales {

    private JFrame frame;
    private JPanel PanelPedales, panelModoFuncionamiento, PanelIndicadores;
    private JLabel labelPedalIzquierdo, labelPedalDerecho, labelVelocidad, labelCalorias, labelSwitch, labelContador1, labelContador2;
    private JButton buttonPedalear1, buttonPedal2;
    private JToggleButton toggleSwitch;
    private int contadorPedal1 = 0, contadorPedal2 = 0, totalCalorias = 0;

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            try 
            {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new ProgramaPedales().createAndShowGUI();
        });
    }

    private void createAndShowGUI() 
    {
        frame = new JFrame("Aplicativo de Velocidad y Calorias");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel de Pedales
        PanelPedales = new JPanel(new GridLayout(2, 2));
        labelPedalIzquierdo = new JLabel("Pedal Izquierdo:");
        buttonPedalear = new JButton("Pedalear");
        labelContador1 = new JLabel("Contador: 0");
        buttonPedalear.addActionListener(e -> onPedalClick(1));

        labelPedalDerecho = new JLabel("Pedal Derecho:");
        buttonPedal2 = new JButton("Pedalear");
        labelContador2 = new JLabel("Contador: 0");
        buttonPedal2.addActionListener(e -> onPedalClick(2));

        PanelPedales.add(labelPedalIzquierdo);
        PanelPedales.add(buttonPedalear);
        PanelPedales.add(labelPedalDerecho);
        PanelPedales.add(buttonPedal2);
        PanelPedales.setBorder(BorderFactory.createTitledBorder("Pedales"));

        // Cambiar de Manual a Automatico 
        panelModoFuncionamiento = new JPanel(new FlowLayout());
        labelSwitch = new JLabel("Modo: Manual");
        toggleSwitch = new JToggleButton("Automático");
        toggleSwitch.addActionListener(e -> onSwitchToggle());

        panelModoFuncionamiento.add(labelSwitch);
        panelModoFuncionamiento.add(toggleSwitch);
        panelModoFuncionamiento.setBorder(BorderFactory.createTitledBorder("Modo De Funcionamiento"));

        // Panel de Indicadores
        PanelIndicadores = new JPanel(new GridLayout(2, 1));
        labelVelocidad = new JLabel("Velocidad: 0");
        labelCalorias = new JLabel("Calorías: 0");

        PanelIndicadores.add(labelVelocidad);
        PanelIndicadores.add(labelCalorias);
        PanelIndicadores.setBorder(BorderFactory.createTitledBorder("Indicadores de Velocidad y Calorias"));

        // Añadir paneles al marco
        frame.add(PanelPedales, BorderLayout.WEST);
        frame.add(panelModoFuncionamiento, BorderLayout.CENTER);
        frame.add(PanelIndicadores, BorderLayout.EAST);

        //  Timer para actualizar los indicadores cada 1 segundo
        Timer timer = new Timer(1000, e -> updateIndicators());
        timer.start();

        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
