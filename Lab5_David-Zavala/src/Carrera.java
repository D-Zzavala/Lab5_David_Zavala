
class Carrera {

    private String Nombre;
    private int Costo;
    private String Jefe;

    public Carrera() {
    }

    public Carrera(String Nombre, int Costo, String Jefe) {
        this.Nombre = Nombre;
        this.Costo = Costo;
        this.Jefe = Jefe;
    }

    public String getFacultad() {
        return Nombre;
    }

    public void setFacultad(String Facultad) {
        this.Nombre = Facultad;
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

}
