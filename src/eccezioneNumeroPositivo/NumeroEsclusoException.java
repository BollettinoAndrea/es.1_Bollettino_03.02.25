package eccezioneNumeroPositivo;

class NumeroEsclusoException extends Exception {
    public NumeroEsclusoException() {
        super("numero escluso!");
    }
    public NumeroEsclusoException(String message) {
        super(message);
    }
}