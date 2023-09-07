import java.util.Scanner;

public class CalculadoraMatrices 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenido a este programa =D");

        System.out.print("Ingresa el numero de filas de las matrices: ");
        int Filas = input.nextInt();

        System.out.print("Ingresa el numero de columnas de las matrices: ");
        int Columnas = input.nextInt();

        // Creacion de matrices
        int[][] MatrizA = new int[Filas][Columnas];
        int[][] MatrizB = new int[Filas][Columnas];

        // Ingresar valores en la matriz A
        System.out.println("Ingresa los elementos de la primera matriz :");
        IngresarMatriz(MatrizA, input);

        // Ingresar elementos en la matriz B
        System.out.println("Ingresa los elementos de la segunda matriz:");
        IngresarMatriz(MatrizB, input);

        // Operaciones
        int[][] Suma = SumarMatrices(MatrizA, MatrizB);
        int[][] Multiplicacion = MultMatrices(MatrizA, MatrizB);

        System.out.println("El resultado de la suma matricial es: ");
        ImprimirMatriz(Suma);

        System.out.println("El resultado de la multiplicacion matricial es: ");
        ImprimirMatriz(Multiplicacion);

        input.close();
    }

    // Función para ingresar elementos en una matriz
    public static void IngresarMatriz(int[][] Matriz, Scanner input) {
        for (int i = 0; i < Matriz.length ; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print("Ingresa el elemento en la posición (" + i + ", " + j + "): ");
                Matriz[i][j] = input.nextInt();
            }
        }
    }

    // Función para sumar dos matrices
    public static int[][] SumarMatrices(int[][] MatrizA, int[][] MatrizB) {
        int Filas = MatrizA.length;
        int Columnas = MatrizA[0].length;
        int[][] Resultado = new int[Filas][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Columnas; j++) {
                Resultado[i][j] = MatrizA[i][j] + MatrizB[i][j];
            }
        }

        return Resultado;
    }

    // Función para multiplicar dos matrices
    public static int[][] MultMatrices(int[][] MatrizA, int[][] MatrizB) {
        int FilasA = MatrizA.length;
        int ColumnasA = MatrizA[0].length;
        int ColumnasB = MatrizB[0].length;
        int[][] Resultado = new int[FilasA][ColumnasB];

        for (int i = 0; i < FilasA; i++) {
            for (int j = 0; j < ColumnasB; j++) {
                int Acumulador = 0;
                for (int k = 0; k < ColumnasA; k++) {
                    Acumulador += MatrizA[i][k] * MatrizB[k][j];
                }
                Resultado[i][j] = Acumulador;
            }
        }

        return Resultado;
    }

    // Función para imprimir una matriz
    public static void ImprimirMatriz(int[][] Matriz) {
        for (int i = 0; i < Matriz.length ;  i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
