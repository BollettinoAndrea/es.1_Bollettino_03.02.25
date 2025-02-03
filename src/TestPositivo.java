import java.util.Scanner;

public class TestPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("inserisci numero positivo: ");
            int input = in.nextInt();

            NumeroPositivo numero = new NumeroPositivo(input);
            System.out.println("Numero: " + numero.getNumero());

        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("ERRORE: numero inserito non valido.");
        } finally {
            in.close();
        }
    }
}
