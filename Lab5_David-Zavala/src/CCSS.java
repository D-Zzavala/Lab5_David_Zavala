public class CCSS extends Carrera{
 
    private String NombreC;

    public CCSS() {
    }

    public CCSS(String Nombre, String NombreC, String Facultad, int Costo, String Jefe) {
        super(Nombre, Facultad, Costo, Jefe);
        this.NombreC = NombreC;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    @Override
    public String toString() {
        return "Licentura{" + "NombreC=" + NombreC + '}';
    }
    
}
