public class RecordatorioDevolver extends DecoradorPrestamo {
    public RecordatorioDevolver(ComponentePrestamo componentePrestamo) {
        super(componentePrestamo);
    }

    public void prestar() {
        enviarRecordatorio();
        super.prestar();
    }

    private void enviarRecordatorio() {
        // Implementación de la funcionalidad para enviar el recordatorio de devolución
    }
}
