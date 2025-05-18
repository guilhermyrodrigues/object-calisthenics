class NotificacaoEmail implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}