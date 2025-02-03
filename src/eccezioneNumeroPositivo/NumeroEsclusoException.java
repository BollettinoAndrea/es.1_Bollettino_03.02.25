package eccezioneNumeroPositivo;

class NumeroEsclusoException extends Exception {
    public NumeroEsclusoException() {
        super("numero escluso! ( 20 )");
    }
    public NumeroEsclusoException(String message) {
        super(message);
    }
}