import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Lab0302 extends JFrame 
{
    private JTextField PlacaField, Tipo_CarroField;
    private JTextArea logArea;
    private List<Vehiculo> Vehiculos = new ArrayList<>();
    private SimpleDateFormat FechaFormato = new SimpleDateFormat("HH:mm:ss");
    private int NumeroVehiculo = 1;


    public Lab0302() 
    {
        setTitle("Tu ParqueApp");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Font font = new Font("Tahoma", Font.PLAIN, 20); // Cambiar la fuente y el tamaño de la letra
        UIManager.put("Button.font", font);
        UIManager.put("Label.font", font);
        UIManager.put("TextField.font", font);
        UIManager.put("TextArea.font", font);

        UIManager.put("MenuBar.background", new Color(0,0,0)); // Color de la barra del menu
        UIManager.put("MenuBar.foreground", Color.BLUE); // Color del texto del menu principal
        UIManager.put("Menu.background", new Color(102,255,102)); // Color de fondo de los elementos del menú
        UIManager.put("Menu.foreground", Color.WHITE); // Color de la palabra menu
        UIManager.put("MenuItem.background", new Color(51, 153, 255)); // Color de fondo de los elementos del menú desplegable
        UIManager.put("MenuItem.foreground", Color.BLACK); // Color del texto de los elementos del menú desplegable

        JMenuBar BarraMenu = new JMenuBar();
        JMenu Menu = new JMenu("Menu");
        JMenuItem ItemIngreso = new JMenuItem("Ingreso de Vehiculo");
        JMenuItem ItemSalida = new JMenuItem("Salida del Vehiculo");
        JMenuItem ItemLista2Ruedas = new JMenuItem("Lista de Vehiculos de 2 Ruedas");
        JMenuItem ItemLista4Ruedas = new JMenuItem("Lista de Vehiculos de 4 Ruedas");
        JMenuItem ItemTotalVehiculos = new JMenuItem("Total de Vehiculos");

        ItemIngreso.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                IngresarVehiculo();
            }
        });

        ItemSalida.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                SalidaVehiculo();
            }
        });

        ItemLista2Ruedas.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                MostrarLista2Ruedas();
            }
        });

        ItemLista4Ruedas.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                MostrarLista4Ruedas();
            }
        });

        ItemTotalVehiculos.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                MostrarTotalVehiculos();
            }
        });

        ItemIngreso.setFont(font);
        ItemSalida.setFont(font);
        ItemLista2Ruedas.setFont(font);
        ItemLista4Ruedas.setFont(font);
        ItemTotalVehiculos.setFont(font);

        Menu.add(ItemIngreso);
        Menu.add(ItemSalida);
        Menu.add(ItemLista2Ruedas);
        Menu.add(ItemLista4Ruedas);
        Menu.add(ItemTotalVehiculos);
        BarraMenu.add(Menu);
        setJMenuBar(BarraMenu);

        JPanel Panelngreso = new JPanel();
        Panelngreso.setLayout(new GridLayout(3, 2));
        PlacaField = new JTextField();
        Tipo_CarroField = new JTextField();
        JButton BotonIngresar = new JButton("Ingresar Vehiculo");

        BotonIngresar.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e) 
            {
                IngresarVehiculo();
            }
        });

        Panelngreso.add(new JLabel("Placa del Vehiculo: "));
        Panelngreso.add(PlacaField);
        Panelngreso.add(new JLabel("Tipo de Vehículo: "));
        Panelngreso.add(Tipo_CarroField);
        Panelngreso.add(new JLabel(""));
        Panelngreso.add(BotonIngresar);

        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12)); 
        JScrollPane logScrollPane = new JScrollPane(logArea);
        logScrollPane.setBackground(new Color(255, 255, 255));

        

        add(Panelngreso, BorderLayout.NORTH);
        add(logScrollPane, BorderLayout.CENTER);
    }

    private void IngresarVehiculo() 
    {
        String Placa = PlacaField.getText();
        String Tipo = Tipo_CarroField.getText();
        Date HoraIngreso = new Date(); // Hora actual como hora de ingreso
        int Numero = NumeroVehiculo++;

        Vehiculo vehiculo = new Vehiculo(Placa, Tipo, HoraIngreso, Numero);
        Vehiculos.add(vehiculo);

        log("Ingreso de Vehiculo: " + vehiculo);

        PlacaField.setText("");
        Tipo_CarroField.setText("");
    }

    private void SalidaVehiculo()
     {
        JDialog dialogo = new JDialog(this, "Salida de Vehículo", true);
        dialogo.setLayout(new GridLayout(3, 2));
        JTextField PlacaField = new JTextField();
        JButton BotonSalida = new JButton("Retirar Vehiculo");
    
        BotonSalida.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose(); // Cierra el dialogo
            }
        });
    
        dialogo.add(new JLabel("Placa de vehiculo de salida:"));
        dialogo.add(PlacaField);
        dialogo.add(new JLabel(""));
        dialogo.add(BotonSalida);
    
        dialogo.setSize(300, 100);
        dialogo.setVisible(true);
    
        String placa = PlacaField.getText();
        for (Vehiculo vehiculo : Vehiculos) 
        {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) 
            {
                Date HoraSalida = new Date(); // Hora actual como hora de salida
                double ValorAPagar = vehiculo.CalcularValor(HoraSalida);
                long TiempoTotal = vehiculo.CalcularTiempoTotal(HoraSalida);
    
                log("Salida de Vehículo: " + vehiculo);
                log("Fecha y Hora de Ingreso: " + vehiculo.getHoraIngreso());
                log("Fecha y Hora de Salida: " + HoraSalida);
                log("Tiempo Total de Parqueo: " + TiempoTotal + " minutos");
                log("Valor a Pagar: $" + ValorAPagar);
    
                Vehiculos.remove(vehiculo); // Retira el vehiculo
                return;
            }
        }
        log("No se encontro el vehiculo.");
    }
    

    private void MostrarLista2Ruedas() 
    {
        log("Lista de Vehículos de 2 Ruedas:");
        for (Vehiculo vehiculo : Vehiculos) {
            if (vehiculo.getTipo().equalsIgnoreCase("Bicicleta") || vehiculo.getTipo().equalsIgnoreCase("Moto") || vehiculo.getTipo().equalsIgnoreCase("Scooter")) 
            {
                log(vehiculo.toString());
            }
        }
    }

    private void MostrarLista4Ruedas() 
    {
        log("Lista de Vehículos de 4 Ruedas:");
        double ValorTotal = 0;
        for (Vehiculo vehiculo : Vehiculos) {
            if (!vehiculo.getTipo().equalsIgnoreCase("Bicicleta") && !vehiculo.getTipo().equalsIgnoreCase("Moto") && !vehiculo.getTipo().equalsIgnoreCase("Scooter")) 
            {
                log(vehiculo.toString() + ", Valor a Pagar: $" + vehiculo.CalcularValor(new Date()));
                ValorTotal += vehiculo.CalcularValor(new Date());
            }
        }
        log("Valor Total a Pagar por Vehículos de 4 Ruedas: $" + ValorTotal);
    }

    private void MostrarTotalVehiculos() 
    {
        log("Cantidad de Vehiculos en el Parqueadero: " + Vehiculos.size());
    }

    private void log(String Mensaje) 
    {
        Date Actual = new Date(); //Fecha actual
        String timestamp = FechaFormato.format(Actual);
        logArea.append(timestamp + " - " + Mensaje + "\n");
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Lab0302 app = new Lab0302();
                app.setVisible(true);
            }
        });
    }
}

class Vehiculo
 {
    private String Placa;
    private String Tipo;
    private Date HoraIngreso;
    private int Numero;

    public Vehiculo(String Placa, String Tipo, Date HoraIngreso, int Numero) 
    {
        this.Placa = Placa;
        this.Tipo = Tipo;
        this.HoraIngreso = HoraIngreso;
        this.Numero = Numero;
    }

    public double CalcularValor(Date HoraSalida)
     {
        long Minutos = (HoraSalida.getTime() - HoraIngreso.getTime()) / (1000 * 60);
        if (Minutos >= 720) 
        { // Más de 12 horas
            return 60 * 720; // Tarifa máxima
        } else 
        {
            return Minutos * 1.0;
        }
    }

    public long CalcularTiempoTotal(Date HoraSalida) 
    {
        return (HoraSalida.getTime() - HoraIngreso.getTime()) / (1000 * 60); // Tiempo en minutos
    }

    public String getPlaca() 
    {
        return Placa;
    }

    public String getTipo() 
    {
        return Tipo;
    }

    public Date getHoraIngreso() 
    {
        return HoraIngreso;
    }

    @Override
    public String toString() 
    {
        return "Número: " + Numero + ", Placa: " + Placa + ", Tipo: " + Tipo;
    }
}
