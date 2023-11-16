import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaPedales 
{

    private JFrame frame;
    private JPanel PanelPedales, panelModoFuncionamiento, PanelIndicadores;
    private JLabel labelPedalIzquierdo, labelPedalDerecho, labelVelocidad, labelCalorias, labelModo, labelContadorIZQ, labelContadorDER,labelRecordatorio;
    private JButton buttonPedalearIZQ, buttonPedalearDER;
    private JToggleButton toggleSwitch;
    private int contadorPedal1 = 0, contadorPedal2 = 0, totalCalorias = 0;

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> 
        {
            try 
            {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) 
            {
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
        labelPedalIzquierdo = new JLabel("Pedal Izquierdo:");
        buttonPedalearIZQ = new JButton("Pedalea!!");
        labelContadorIZQ = new JLabel("Contador: 0");
        buttonPedalearIZQ.addActionListener(e -> onPedalClick(1));

        labelPedalDerecho = new JLabel("Pedal Derecho:");
        buttonPedalearDER = new JButton("Pedalea!!");
        labelContadorDER = new JLabel("Contador: 0");
        buttonPedalearDER.addActionListener(e -> onPedalClick(2));

        PanelPedales.add(labelPedalIzquierdo);
        PanelPedales.add(buttonPedalearIZQ);
        PanelPedales.add(labelPedalDerecho);
        PanelPedales.add(buttonPedalearDER);
        PanelPedales.setBorder(BorderFactory.createTitledBorder("Pedales"));

        // Modo Automatico o Manual 
        panelModoFuncionamiento = new JPanel(new FlowLayout());
        labelModo = new JLabel("Modo: Manual");
        toggleSwitch = new JToggleButton("Automático");
        toggleSwitch.addActionListener(e -> onSwitchToggle());

        panelModoFuncionamiento.add(labelModo);
        panelModoFuncionamiento.add(toggleSwitch);
        panelModoFuncionamiento.setBorder(BorderFactory.createTitledBorder("Modo Funcionamiento"));

        
        PanelIndicadores = new JPanel(new GridLayout(3, 1));
        labelVelocidad = new JLabel("Velocidad -> 0");
        labelCalorias = new JLabel("Calorias -> 0");
        labelRecordatorio = new JLabel("Recuerda que tienes que dar 4 clicks para que se mueva");

        PanelIndicadores.add(labelVelocidad);
        PanelIndicadores.add(labelCalorias);
        PanelIndicadores.add(labelRecordatorio);
        PanelIndicadores.setBorder(BorderFactory.createTitledBorder("Indicadores de Velocidad y Calorias"));

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

    private void onPedalClick(int Pedal) 
    {
        switch (Pedal) 
        {
            case 1 -> 
            {
                contadorPedal1++;
                labelContadorIZQ.setText("Contador: " + contadorPedal1);
            }
            case 2 ->
            {
                contadorPedal2++;
                labelContadorDER.setText("Contador: " + contadorPedal2);
            }
        }

        // Verifica si se han hecho 4 clics en total
        if ((contadorPedal1 + contadorPedal2) % 4 == 0) 
        {
            // Se quema 100 calorías por cada 4 clics
            totalCalorias += 100;
        }
    }

    private void onSwitchToggle() 
    {
        if (toggleSwitch.isSelected()) 
        {
            labelModo.setText("Modo: Automático");
        } else 
        {
            labelModo.setText("Modo: Manual");
        }
    }

    private void updateIndicators()
    {
        if (toggleSwitch.isSelected()) 
        {
            // Modo Auto
            contadorPedal1++;
            contadorPedal2++;

            // Verifica si se han hecho 4 clics en total
            if ((contadorPedal1 + contadorPedal2) % 4 == 0) 
            {
                // Se quema 100 calorías por cada 4 clics
                totalCalorias += 100;
            }
        }

   
        labelVelocidad.setText("Velocidad: " + Math.random() * 100);
        labelCalorias.setText("Calorías: " + totalCalorias);
        labelRecordatorio.setText("Recuerda que tienes que dar 4 clicks para que se mueva");

        
    }
}

