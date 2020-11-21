public class Ingenieria extends Carrera{
 
    private String Facultad;

    public Ingenieria() {
    }

    public Ingenieria(String Nombre, String Facultad, int Costo, String Jefe) {
        super(Nombre, Costo, Jefe);
        this.Facultad = Facultad;
    }

    public String getNombreC() {
        return Facultad;
    }

    public void setNombreC(String NombreC) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
                return this.getFacultad();

    }
    
}
