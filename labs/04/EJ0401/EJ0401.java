import java.util.Timer;
import java.util.TimerTask;

public class EJ0401 
{
    Timer timer;

    public EJ0401(int segundos) 
    {
        timer = new Timer();
        timer.schedule(new EJ0401Recordatorio(), segundos * 1000); // Programa la tarea
    }

    class EJ0401Recordatorio extends TimerTask 
    {
        public void run() 
        {
            System.out.println("Tiene un recordatorio!");
            timer.cancel(); // Termina el hilo del timer
        }
    }

    public static void main(String args[]) 
    {
        System.out.println("Bienvenido a este programa =D")
        System.out.println("Inicio del programa");
        EJ0401 temporizador = new EJ0401(5);
    }
}
