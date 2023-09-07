import java.util.Scanner;

class Operacion
{
    public static double[][] SumarMatrices(double[][] MatrizA, double[][] MatrizB) 
    {
        int Filas = MatrizA.length;
        int Columnas = MatrizA[0].length;
        double[][] Resultado = new double[Filas][Columnas];

        for (int i = 0; i < Filas; i++) 
        {
            for (int j = 0; j < Columnas; j++) 
            {
                Resultado[i][j] = MatrizA[i][j] + MatrizB[i][j];
            }
        }
        return Resultado;
    }
    

    public static double[][] MultiplicarMatrices(double[][] MatrizA, double[][] MatrizB) {
        int FilasA = MatrizA.length;
        int ColumnasA = MatrizA[0].length;
        int ColumnasB = MatrizB[0].length;
        double[][] Resultado = new double[FilasA][ColumnasB];

        for (int i = 0; i < FilasA; i++) {
            for (int j = 0; j < ColumnasB; j++) {
                double Acumulador = 0;
                for (int k = 0; k < ColumnasA; k++) {
                    Acumulador += MatrizA[i][k] * MatrizB[k][j];
                }
                Resultado[i][j] = Acumulador;
            }
        }
        return Resultado;
    }

    public static double[][] MultEscalar(double[][] Matriz, double Escalar) {
        int Filas = Matriz.length;
        int Columnas = Matriz[0].length;
        double[][] Resultado = new double[Filas][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                Resultado[i][j] = Matriz[i][j] * Escalar;
            }
        }
        return Resultado;
    }

    public static double[][] MatrizTraspuesta(double[][] Matriz) {
        int Filas = Matriz.length;
        int Columnas = Matriz[0].length;
        double[][] Traspuesta = new double[Columnas][Filas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                Traspuesta[j][i] = Matriz[i][j];
            }
        }
        return Traspuesta;
    }
}

// Lectura de usuario
class Captura {
    private static Scanner leer = new Scanner(System.in);

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return leer.nextDouble();
    }

    public static double[][] LeerMatriz(int Filas, int Columnas) {
        double[][] Matriz = new double[Filas][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                Matriz[i][j] = leerDouble("Ingresa el elemento en la posición [" + i + "][" + j + "]: ");
            }
        }
        return Matriz;
    }
}

public class CalculadoraMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenid@ a este programa =D");
            System.out.println("Menú de Operaciones Matriciales:");
            System.out.println("1. Suma de Matrices");
            System.out.println("2. Producto de Matrices");
            System.out.println("3. Producto de Matriz por Escalar");
            System.out.println("4. Traspuesta de Matriz");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int Opcion = input.nextInt();

            if (Opcion == 5) {
                System.out.println("Cerrando la apliacacion...");
                break;
            }

            int Filas, Columnas;
            double[][] MatrizA, MatrizB, Resultado;

            switch (Opcion) {
                case 1:
                    System.out.println("Ingresa las dimensiones de las matrices:");
                    Filas = input.nextInt();
                    Columnas = input.nextInt();

                    MatrizA = Captura.LeerMatriz(Filas, Columnas);
                    MatrizB = Captura.LeerMatriz(Filas, Columnas);

                    Resultado = Operacion.SumarMatrices(MatrizA, MatrizB);
                    break;

                case 2:
                    System.out.println("Ingresa las dimensiones de la primera matriz:");
                    int FilasA = input.nextInt();
                    int ColumnasA = input.nextInt();
                    System.out.println("Ingresa las dimensiones de la segunda matriz:");
                    int FilasB = input.nextInt();
                    int ColumnasB = input.nextInt();

                    if (ColumnasA != FilasB) {
                        System.out.println("No se puede realizar la multiplicacion debido a que las dimensiones no son válidas.");
                        continue;
                    }

                    MatrizA = Captura.LeerMatriz(FilasA, ColumnasA);
                    MatrizB = Captura.LeerMatriz(FilasB, ColumnasB);

                    Resultado = Operacion.MultiplicarMatrices(MatrizA, MatrizB);
                    break;

                case 3:
                    System.out.println("Ingresa las dimensiones de la matriz:");
                    Filas = input.nextInt();
                    Columnas = input.nextInt();
                    double Escalar = Captura.leerDouble("Ingresa el escalar: ");

                    MatrizA = Captura.LeerMatriz(Filas, Columnas);

                    Resultado = Operacion.MultEscalar(MatrizA, Escalar);
                    break;

                case 4:
                    System.out.println("Ingrese las dimensiones de la matriz:");
                    Filas = input.nextInt();
                    Columnas = input.nextInt();

                    MatrizA = Captura.LeerMatriz(Filas, Columnas);

                    Resultado = Operacion.MatrizTraspuesta(MatrizA);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.println("Resultado:");
            for (int i = 0; i < Resultado.length; i++) {
                for (int j = 0; j < Resultado[i].length; j++) {
                    System.out.print(Resultado[i][j] + " ");
                }
                System.out.println();
            }
        }

        input.close();
    }
}
