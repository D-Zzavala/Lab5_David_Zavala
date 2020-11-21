class Clase {

    private String Nombre;
    private int Seccion;
    private int Edificio;
    private boolean AACC;

    public Clase() {
    }

    public Clase(String Nombre, int Seccion, int Edificio, boolean AACC) {
        this.Nombre = Nombre;
        this.Seccion = Seccion;
        this.Edificio = Edificio;
        this.AACC = AACC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSeccion() {
        return Seccion;
    }

    public void setSeccion(int Seccion) {
        this.Seccion = Seccion;
    }

    public int getEdificio() {
        return Edificio;
    }

    public void setEdificio(int Edificio) {
        this.Edificio = Edificio;
    }

    public boolean isAACC() {
        return AACC;
    }

    public void setAACC(boolean AACC) {
        this.AACC = AACC;
    }

    @Override
    public String toString() {
        return Nombre + ", Seccion:" + Seccion;
    }
    
    
    
}
