package eccezioneNumeroPositivo;

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
            System.err.println(e.getMessage());
        } catch (IntervalloException e) {
            System.err.println(e.getMessage());
        } catch (NumeroEsclusoException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            in.close();
        }
    }
}