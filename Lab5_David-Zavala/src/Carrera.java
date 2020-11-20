
class Carrera {

    private String Nombre;
    private String Facultad;
    private int Costo;
    private String Jefe;

    public Carrera() {
    }

    public Carrera(String Nombre, String Facultad, int Costo, String Jefe) {
        this.Nombre = Nombre;
        this.Facultad = Facultad;
        this.Costo = Costo;
        this.Jefe = Jefe;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public String getJefe() {
        return Jefe;
    }

    public void setJefe(String Jefe) {
        this.Jefe = Jefe;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Facultad=" + Facultad + ", Jefe=" + Jefe;
    }

    
}
