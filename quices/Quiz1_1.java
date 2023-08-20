import java.util.Scanner;
//Quiz 1
//Allawi Esalas Hoyos COD: 7004171

public class Quiz1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a este programa =D");
        System.out.print("Ingresa un número n: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
            scanner.close();
        }
    }
}
