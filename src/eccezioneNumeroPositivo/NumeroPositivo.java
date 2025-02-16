package eccezioneNumeroPositivo;

class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException, IntervalloException, NumeroEsclusoException {
        try {
            setNumero(numero);
        } catch (NegativeException e) {
            throw new RuntimeException("ERRORE: hai inserito un numero negativo. ---> " + numero);
        } catch (IntervalloException e) {
            throw new RuntimeException("ERRORE: hai inserito un numero fuori range.(0 - 30) ---> " + numero);
        } catch (NumeroEsclusoException e) {
            throw new RuntimeException("ERRORE: hai inserito un numero escluso.( 20 ) ---> " + numero);
        }
    }

    public void setNumero(int numero) throws NegativeException, IntervalloException, NumeroEsclusoException {
        if (numero < 0) {
            throw new NegativeException("ERRORE: hai inserito un numero negativo. ---> " + numero);
        } else if (numero <0 || numero>30) {
            throw new IntervalloException("ERRORE: hai inserito un numero fuori range.(0 - 30) ---> " + numero);
        }else if (numero == 20) {
            throw new NumeroEsclusoException("ERRORE: hai inserito un numero escluso.( 20 ) ---> " + numero);
        }else{
            this.numero = numero;
        }
    }

    public int getNumero() {
        return numero;
    }
}