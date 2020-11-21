
public class Licentura extends Carrera {

    private String Facultad;

    public Licentura() {
    }

    public Licentura(String Nombre, String Facultad, int Costo, String Jefe) {
        super(Nombre, Costo, Jefe);
        this.Facultad = Facultad;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String NombreC) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return this.getFacultad();

    }

}
