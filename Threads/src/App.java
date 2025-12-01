import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Você tem 5 SEGUNDOS para escrever seu nome.");
        String nome = scanner.nextLine();
        System.out.println("Obrigado, "+nome+"!");

        scanner.close();
    }
}
