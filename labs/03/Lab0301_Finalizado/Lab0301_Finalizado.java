import java.io.*;// Permite  leer y escribir archivos
import java.util.*; // Permite usar el Array list y el Linked List.

class Estudiante 
{
    private String Codigo;
    private String Nombre;
    private String Correo;
    private int Semestre;
    private List<Asignatura> AsignaturasRegistradas;
    private int TotalCreditosRegistrados;


    // Clase Estidiante
    public Estudiante(String Codigo, String Nombre, String Correo, int Semestre)
     {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Semestre = Semestre;
        this.AsignaturasRegistradas = new ArrayList<>();
        this.TotalCreditosRegistrados = 0;
    }

    // Metodo para registrar asignaturas siempre y cuando no supere los 16 creditos y no haya cruce de horario

    public void registrarAsignatura(Asignatura asignatura) 
    {
        if (TotalCreditosRegistrados + asignatura.getCreditos() <= 16) 
        {
            if (!VerificarCruceHorario(asignatura)) 
            {
                AsignaturasRegistradas.add(asignatura);
                TotalCreditosRegistrados += asignatura.getCreditos();
                System.out.println("Asignatura registrada con exito.");
            } else 
            {
                System.out.println("La asignatura seleccionada tiene un cruce de horario.");
            }
        } else 
        {
            System.out.println("No puedes registrar mas asignaturas debido al limite de creditos.");
        }
    }

    // Metodo para verificar una nueva asignatura se cruza con una ya previamente registrada 

    private boolean VerificarCruceHorario(Asignatura nuevaAsignatura) 
    {
        for (Asignatura asignatura : AsignaturasRegistradas) 
        {
            if (asignatura.CruceHorario(nuevaAsignatura)) 
            {
                return true; // Hay un cruce de horario
            }
        }
        return false; // No hay cruces de horario
    }

    // Metodo para mostrar un reporte con la informacion de las asignaturas registradas por el usuario

    public void MostrarReporte() 
    {
        System.out.println("-------- Reporte de Asignaturas Registradas --------");
        System.out.println("Codigo: " + Codigo);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Correo: " + Correo);
        System.out.println("Semestre: " + Semestre);
        System.out.println("Total de creditos registrados: " + TotalCreditosRegistrados);
        System.out.println("Asignaturas registradas:");

        for (Asignatura asignatura : AsignaturasRegistradas) 
        {
            System.out.println(asignatura);
        }
    }

    // Metodo para generar un reporte en un archivo

    public void GenerarReporteArchivo(String NombreArchivo) 
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(NombreArchivo))) 
        {
            writer.println("=== Reporte de Asignaturas Registradas ===");
            writer.println("Codigo: " + Codigo);
            writer.println("Nombre: " + Nombre);
            writer.println("Correo: " + Correo);
            writer.println("Semestre: " + Semestre);
            writer.println("Total de creditos registrados: " + TotalCreditosRegistrados);
            writer.println("Asignaturas registradas:");

            for (Asignatura asignatura : AsignaturasRegistradas) 
            {
                writer.println(asignatura);
            }
            System.out.println("Reporte generado con exito en el archivo " + NombreArchivo);
        } catch (IOException e) 
        {
            System.err.println("Error al generar el archivo de reporte.");
        }
    }
}

class Asignatura 
{
    private String Codigo;
    private String Nombre;
    private int Semestre;
    private int Creditos;
    private List<String> Horario;

    public Asignatura(String Codigo, String Nombre, int Semestre, int Creditos, List<String> Horario) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.Creditos = Creditos;
        this.Horario = Horario;
    }

    public int getCreditos() 
    {
        return Creditos;
    }

    public boolean CruceHorario(Asignatura otraAsignatura) 
    {
        for (String diaHora : Horario) 
        {
            if (otraAsignatura.Horario.contains(diaHora)) 
            {
                return true; // Hay un cruce de horario
            }
        }
        return false; // No hay cruces de horario
    }

    // Un override permite detectar en tiempo de compilacion si no se esta cumpliendo con los requisitos
    // para sobreescribir un metodo.
    @Override
    public String toString() {
        return "Codigo: " + Codigo + ", Nombre: " + Nombre + ", Semestre: " + Semestre + ", Creditos: " + Creditos;
    }
}

public class Lab0301_Finalizado 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenid@ a este programa =D");
        System.out.println("----- Bienvenid@ al Sistema de Registro de Asignaturas ----");

        System.out.print("Ingresa tu codigo de estudiante: ");
        String Codigo = scanner.nextLine();

        System.out.print("Ingresa tu nombre: ");
        String Nombre = scanner.nextLine();

        System.out.print("Ingresa tu correo electronico: ");
        String Correo = scanner.nextLine();

        System.out.print("Ingresa el semestre que deseas cursar: ");
        int Semestre = scanner.nextInt();

        Estudiante estudiante = new Estudiante(Codigo, Nombre, Correo, Semestre);

        // Cargar las asignaturas desde el archivo de texto
        List<Asignatura> asignaturasDisponibles = CargarAsignaturasDesdeArchivo("Asignaturas.txt");

        // Menu de opciones
        while (true) 
        {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Registrar asignatura");
            System.out.println("2. Mostrar reporte de asignaturas");
            System.out.println("3. Generar reporte en archivo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");

            int Opcion = scanner.nextInt();

            switch (Opcion) 
            {
                case 1:
                    System.out.println("Asignaturas disponibles:");
                    for (int i = 0; i < asignaturasDisponibles.size(); i++) 
                    {
                        System.out.println(i + 1 + ". " + asignaturasDisponibles.get(i));
                    }
                    System.out.print("Selecciona el numero de asignatura que deseas registrar: ");
                    int NumeroAsignatura = scanner.nextInt();

                    if (NumeroAsignatura >= 1 && NumeroAsignatura <= asignaturasDisponibles.size()) 
                    {
                        Asignatura asignaturaSeleccionada = asignaturasDisponibles.get(NumeroAsignatura - 1);
                        estudiante.registrarAsignatura(asignaturaSeleccionada);
                    } else 
                    {
                        System.out.println("Numero de asignatura no válido.");
                    }
                    break;
                case 2:
                    estudiante.MostrarReporte();
                    break;
                case 3:
                    estudiante.GenerarReporteArchivo("reporte_asignaturas.txt");
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el Sistema de Registro de Asignaturas!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta nuevamente.");
            }
        }
    }

    private static List<Asignatura> CargarAsignaturasDesdeArchivo(String nombreArchivo) 
    {
        List<Asignatura> asignaturas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) 
        {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 5) {
                    String Codigo = parts[0].trim();
                    String Nombre = parts[1].trim();
                    int Semestre = Integer.parseInt(parts[2].trim());
                    int Creditos = Integer.parseInt(parts[3].trim());
                    List<String> horario = Arrays.asList(parts[4].trim().split(";"));
                    Asignatura asignatura = new Asignatura(Codigo, Nombre, Semestre, Creditos, horario);
                    asignaturas.add(asignatura);
                }
            }
        } catch (IOException e) 
        {
            System.err.println("Error al cargar las asignaturas desde el archivo.");
        }
        return asignaturas;
    }
}
