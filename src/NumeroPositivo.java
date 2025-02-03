class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException {
        setNumero(numero);
    }

    public void setNumero(int numero) throws NegativeException {
        if (numero < 0) {
            throw new NegativeException("ERRORE: hai inserito un numero negativo");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}