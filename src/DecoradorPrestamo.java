public abstract class DecoradorPrestamo extends ComponentePrestamo {
    protected ComponentePrestamo componentePrestamo;

    public DecoradorPrestamo(ComponentePrestamo componentePrestamo) {
        this.componentePrestamo = componentePrestamo;
    }

    public void prestar() {
        componentePrestamo.prestar();
    }
}
