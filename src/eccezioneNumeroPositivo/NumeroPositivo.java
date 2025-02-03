package eccezioneNumeroPositivo;

class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException, IntervalloException {
        setNumero(numero);
    }

    public void setNumero(int numero) throws NegativeException, IntervalloException {
        if (numero < 0) {
            throw new NegativeException("ERRORE: hai inserito un numero negativo");
        } else if (numero <0 || numero>30) {
            throw new IntervalloException("ERRORE: hai inserito un numero fuori range (0 - 30)");
        }else{
            this.numero = numero;
        }
    }

    public int getNumero() {
        return numero;
    }
}