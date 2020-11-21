public class CCSS extends Carrera{
 
    private String Facultad;

    public CCSS() {
    }

    public CCSS(String Facultad, String Nombre, int Costo, String Jefe) {
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
