import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ordenamiento 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) 
        {
            System.out.println("Bienvenido a este programa =D");
            System.out.println("Este programa ordena un arreglo de números tipo double utilizando los métodos de ordenamiento burbuja, inserción, selección y mergesort, y luego genera una tabla comparativa de los tiempos empleados para diferentes tamaños de arreglos");
            System.out.println(" -----Menu de Opciones------ ");
            System.out.println("1- Ordenar con Burbuja.");
            System.out.println("2- Ordenar con Insercion.");
            System.out.println("3- Ordenar con Seleccion.");
            System.out.println("4- Ordenar con Mergesort.");
            System.out.println("5- Salir");


            System.out.println("Selecciona una opcion: ");
            int Opcion = input.nextInt();

            if (Opcion == 5) 
            {
                System.out.println("Saliendo del programa... ¡Gracias por usar el programa!");
                break;
            }

            System.out.print("Ingresa la cantidad de números a ordenar (100, 500, 1000, 5000 o 10000): ");
            int Cantidad = input.nextInt();

            double[] Arreglo = new double[Cantidad];
            for (int i = 0; i < Cantidad; i++) 
            {
                Arreglo[i] = random.nextDouble(); // Generar números aleatorios
            }

            long TiempoInicio;
            long TiempoFinal;
            long TiempoConcurrido;

            switch (Opcion) 
            {
                case 1:
                    TiempoInicio = System.nanoTime();
                    OrdenarBurbuja(Arreglo);
                    TiempoFinal = System.nanoTime();
                    TiempoConcurrido = TiempoFinal - TiempoInicio;
                    MostrarTabla("Burbuja", Cantidad, TiempoConcurrido);
                    break;
                case 2:
                    TiempoInicio = System.nanoTime();
                    OrdenarInsercion(Arreglo);
                    TiempoFinal = System.nanoTime();
                    TiempoConcurrido = TiempoFinal - TiempoInicio;
                    MostrarTabla("Insercion", Cantidad, TiempoConcurrido);
                    break;
                case 3:
                    TiempoInicio = System.nanoTime();
                    OrdenarSeleccion(Arreglo);
                    TiempoFinal = System.nanoTime();
                    TiempoConcurrido = TiempoFinal - TiempoInicio;
                    MostrarTabla("Seleccion", Cantidad, TiempoConcurrido);
                    break;
                case 4:
                    TiempoInicio = System.nanoTime();
                    Mergesort(Arreglo, 0, Arreglo.length - 1);
                    TiempoFinal = System.nanoTime();
                    TiempoConcurrido = TiempoFinal - TiempoInicio;
                    MostrarTabla("Mergesort", Cantidad, TiempoConcurrido);
                    break;
                default:
                    System.out.println("Opcion no valida, inteta de nuevo.");
                    continue;
            }
        }

        input.close();
    }

    // Metodos de ordenamiento 

    // Ordenamiento Burbuja
    public static void OrdenarBurbuja(double[] Arreglo) 
    {
        int n = Arreglo.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (Arreglo[j] > Arreglo[j + 1]) 
                {
                    double ValorTemporal = Arreglo[j];
                    Arreglo[j] = Arreglo[j + 1];
                    Arreglo[j + 1] = ValorTemporal;
                }
            }
        }
        System.out.println("Arreglo ordenado con Burbuja: " + Arrays.toString(Arreglo));
    }

    // Ordenamiento por Insercion
    public static void OrdenarInsercion(double[] Arreglo) 
    {
        int n = Arreglo.length;
        for (int i = 1; i < n; i++) 
        {
            double Clave = Arreglo[i];
            int j = i - 1;
            while (j >= 0 && Arreglo[j] > Clave) 
            {
                Arreglo[j + 1] = Arreglo[j];
                j = j - 1;
            }
            Arreglo[j + 1] = Clave;
        }
        System.out.println("Arreglo ordenado con Inserción: " + Arrays.toString(Arreglo));
    }

    // Ordenamiento por Seleccion
    public static void OrdenarSeleccion(double[] Arreglo) 
    {
        int n = Arreglo.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int IndiceMinimo = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (Arreglo[j] < Arreglo[IndiceMinimo]) 
                {
                    IndiceMinimo = j;
                }
            }
            double ValorTemporal = Arreglo[IndiceMinimo];
            Arreglo[IndiceMinimo] = Arreglo[i];
            Arreglo[i] = ValorTemporal;
        }
        System.out.println("Arreglo ordenado con Selección: " + Arrays.toString(Arreglo));
    }

    // Ordenamiento Mergesort
    public static void Mergesort(double[] Arreglo, int Inicio, int Fin) 
    {
        if (Inicio < Fin) 
        {
            int Medio = (Inicio + Fin) / 2;
            Mergesort(Arreglo, Inicio, Medio);
            Mergesort(Arreglo, Medio + 1, Fin);
            merge(Arreglo, Inicio, Medio, Fin);
        }
        System.out.println("Arreglo ordenado con Mergesort: " + Arrays.toString(Arreglo));
    }

    // Metodo para combinar dos subarreglos ordenados
    public static void merge(double[] Arreglo, int Inicio, int Medio, int Fin) 
    {
        int n1 = Medio - Inicio + 1;
        int n2 = Fin - Medio;

        double[] Izquierda = new double[n1];
        double[] Derecha = new double[n2];

        for (int i = 0; i < n1; i++) 
        {
            Izquierda[i] = Arreglo[Inicio + i];
        }
        for (int j = 0; j < n2; j++) 
        {
            Derecha[j] = Arreglo[Medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = Inicio;
        while (i < n1 && j < n2) 
        {
            if (Izquierda[i] <= Derecha[j]) {
                Arreglo[k] = Izquierda[i];
                i++;
            } else {
                Arreglo[k] = Derecha[j];
                j++;
            }
            k++;
        }

        while (i < n1) 
        {
            Arreglo[k] = Izquierda[i];
            i++;
            k++;
        }

        while (j < n2) 
        {
            Arreglo[k] = Derecha[j];
            j++;
            k++;
        }
    }

    // Mostrar los resultados en una tabla
    public static void MostrarTabla(String Algoritmo, int Cantidad, long Tiempo) 
    {
        System.out.format("+--------------+------------+----------------------+%n");
        System.out.format("| Algoritmo    | Cantidad   | Tiempo de Ejecución  |%n");
        System.out.format("+--------------+------------+----------------------+%n");
        System.out.format("| %-12s | %-10d | %-20d |%n", Algoritmo, Cantidad, Tiempo);
        System.out.format("+--------------+------------+----------------------+%n");
    }
}
