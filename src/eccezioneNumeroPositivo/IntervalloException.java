package eccezioneNumeroPositivo;

class IntervalloException extends Exception {
    public IntervalloException() {
        super("numero fuori range!");
    }
    public IntervalloException(String message) {
        super(message);
    }
}
