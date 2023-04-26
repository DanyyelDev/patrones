public class NotificacionEmail extends DecoradorPrestamo {
    public NotificacionEmail(ComponentePrestamo componentePrestamo) {
        super(componentePrestamo);
    }

    public void prestar() {
        enviarNotificacionEmail();
        super.prestar();
    }

    private void enviarNotificacionEmail() {
        // Implementación de la funcionalidad para enviar la notificación por correo electrónico
    }
}
