import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaPedales 
{

    private JFrame frame;
    private JPanel PanelPedales, panelModoFuncionamiento, PanelIndicadores;
    private JLabel labelPedal1, labelPedal2, labelIndicador1, labelIndicador2, labelSwitch, labelContador1, labelContador2;
    private JButton buttonPedal1, buttonPedal2;
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

       
        PanelPedales = new JPanel(new GridLayout(2, 2));
        labelPedal1 = new JLabel("Pedal Izquierdo:");
        buttonPedal1 = new JButton("Pedalea!!");
        labelContador1 = new JLabel("Contador: 0");
        buttonPedal1.addActionListener(e -> onPedalClick(1));

        labelPedal2 = new JLabel("Pedal Derecho:");
        buttonPedal2 = new JButton("Pedalea!!");
        labelContador2 = new JLabel("Contador: 0");
        buttonPedal2.addActionListener(e -> onPedalClick(2));

        PanelPedales.add(labelPedal1);
        PanelPedales.add(buttonPedal1);
        PanelPedales.add(labelPedal2);
        PanelPedales.add(buttonPedal2);
        PanelPedales.setBorder(BorderFactory.createTitledBorder("Pedales"));

        // Modo Automatico o Manual 
        panelModoFuncionamiento = new JPanel(new FlowLayout());
        labelSwitch = new JLabel("Modo: Manual");
        toggleSwitch = new JToggleButton("Automático");
        toggleSwitch.addActionListener(e -> onSwitchToggle());

        panelModoFuncionamiento.add(labelSwitch);
        panelModoFuncionamiento.add(toggleSwitch);
        panelModoFuncionamiento.setBorder(BorderFactory.createTitledBorder("Modo Funcionamiento"));

        
        PanelIndicadores = new JPanel(new GridLayout(2, 1));
        labelIndicador1 = new JLabel("Velocidad -> 0");
        labelIndicador2 = new JLabel("Calorias -> 0");

        PanelIndicadores.add(labelIndicador1);
        PanelIndicadores.add(labelIndicador2);
        PanelIndicadores.setBorder(BorderFactory.createTitledBorder("Indicadores"));

        frame.add(PanelPedales, BorderLayout.WEST);
        frame.add(panelModoFuncionamiento, BorderLayout.CENTER);
        frame.add(PanelIndicadores, BorderLayout.EAST);

        // Timer para actualizar los indicadores cada 1 segundo
        Timer timer = new Timer(1000, e -> updateIndicators());
        timer.start();

        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void onPedalClick(int pedal) {
        switch (pedal) {
            case 1:
                contadorPedal1++;
                labelContador1.setText("Contador: " + contadorPedal1);
                break;
            case 2:
                contadorPedal2++;
                labelContador2.setText("Contador: " + contadorPedal2);
                break;
        }

        // Verifica si se han hecho 4 clics en total
        if ((contadorPedal1 + contadorPedal2) % 4 == 0) {
            // Se quemar 100 calorías por cada 4 clics
            totalCalorias += 100;
        }
    }

    private void onSwitchToggle() {
        if (toggleSwitch.isSelected()) {
            labelSwitch.setText("Modo: Automático");
        } else {
            labelSwitch.setText("Modo: Manual");
        }
    }

 
