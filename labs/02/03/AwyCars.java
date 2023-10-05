import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AwyCars extends JFrame 
{
    private JTextField CampoMarca , CampoModelo , CampoColor , CampoKilometraje ;
    private JButton BotonAgregar, BotonArreglarPorModelo , BotonOrdenarPorKilometraje;
    private JTextArea resultadoArea;
    private Carro[] Carros;
    private int CantidadCarros = 0;

    public AwyCars() {
        setTitle("Concecionario AwyCars");
        setSize(1000, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel PanelDatos = new JPanel(new GridLayout(5, 2));
        CampoMarca = new JTextField();
        CampoModelo = new JTextField();
        CampoColor = new JTextField();
        CampoKilometraje = new JTextField();
        BotonAgregar = new JButton("Agregar Carro");

        BotonAgregar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                AgregarCarro();
            }
        });

        PanelDatos.add(new JLabel("Marca:"));
        PanelDatos.add(CampoMarca);
        PanelDatos.add(new JLabel("Modelo:"));
        PanelDatos.add(CampoModelo);
        PanelDatos.add(new JLabel("Color:"));
        PanelDatos.add(CampoColor);
        PanelDatos.add(new JLabel("Kilometraje:"));
        PanelDatos.add(CampoKilometraje);
        PanelDatos.add(new JLabel(""));
        PanelDatos.add(BotonAgregar);

        JPanel BotonesPanel = new JPanel(new FlowLayout());
        BotonArreglarPorModelo = new JButton("Ordenar por Modelo");
        BotonOrdenarPorKilometraje = new JButton("Ordenar por Kilometraje");

        BotonArreglarPorModelo.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                OrdenarPorModelo();
            }
        });

        BotonOrdenarPorKilometraje.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                OrdenarPorKilometraje();
            }
        });

        BotonesPanel.add(BotonArreglarPorModelo);
        BotonesPanel.add(BotonOrdenarPorKilometraje);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        add(PanelDatos, BorderLayout.NORTH);
        add(BotonesPanel, BorderLayout.CENTER);
        add(new JScrollPane(resultadoArea), BorderLayout.SOUTH);
    }

    private void AgregarCarro() 
    {
        String Marca = CampoMarca.getText();
        String Modelo = CampoModelo.getText();
        String Color = CampoColor.getText();
        double Kilometraje = Double.parseDouble(CampoKilometraje.getText());

        if (CantidadCarros == 0) 
        {
            Carros = new Carro[1];
        } else 
        {
            Carros = Arrays.copyOf(Carros, Carros.length + 1);
        }

        Carros[CantidadCarros] = new Carro(Marca, Modelo, Color, Kilometraje);
        CantidadCarros++;
        resultadoArea.append("Carro agregado: " + Marca + " " + Modelo + "\n");

        CampoMarca.setText("");
        CampoModelo.setText("");
        CampoColor.setText("");
        CampoKilometraje.setText("");
    }

    private void OrdenarPorModelo() 
    {
        if (Carros != null && CantidadCarros > 0) 
        {
            Arrays.sort(Carros, (c1, c2) -> c1.getModelo().compareTo(c2.getModelo()));
            MostrarCarrosOrdenados();
        }
    }

    private void OrdenarPorKilometraje() 
    {
        if (Carros != null && CantidadCarros > 0) {
            Arrays.sort(Carros, (c1, c2) -> Double.compare(c1.getKilometraje(), c2.getKilometraje()));
            MostrarCarrosOrdenados();
        }
    }

    private void MostrarCarrosOrdenados() 
    {
        resultadoArea.setText("Carros ordenados:\n");
        for (Carro carro : Carros) 
        {
            resultadoArea.append(carro.toString() + "\n");
        }
    }

    public static void main(String[] args)
     {
        SwingUtilities.invokeLater(new Runnable()
         {
            public void run()
             {
                AwyCars app = new AwyCars();
                app.setVisible(true);
            }
        });
    }
}

class Carro 
{
    private String Marca;
    private String Modelo;
    private String Color;
    private double Kilometraje;

    public Carro(String Marca, String Modelo, String Color, double Kilometraje) 
    {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Kilometraje = Kilometraje;
    }

    public String getMarca() 
    {
        return Marca;
    }

    public String getModelo()
    {
        return Modelo;
    }

    public String getColor() 
    {
        return Color;
    }

    public double getKilometraje() 
    {
        return Kilometraje;
    }

    @Override
    public String toString() {
        return "Marca: " + Marca + ", Modelo: " + Modelo + ", Color: " + Color + ", Kilometraje: " + Kilometraje;
    }
}
