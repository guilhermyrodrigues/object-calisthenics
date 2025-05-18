class Confirmacao {
    private boolean confirmada;

    public void confirmar() {
        confirmada = true;
    }

    public boolean estaConfirmada() {
        return confirmada;
    }
}