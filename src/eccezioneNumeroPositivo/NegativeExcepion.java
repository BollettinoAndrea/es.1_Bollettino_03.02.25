package eccezioneNumeroPositivo;

class NegativeException extends Exception {
    public NegativeException() {
        super("numero negativo!");
    }
    public NegativeException(String message) {
        super(message);
    }
}