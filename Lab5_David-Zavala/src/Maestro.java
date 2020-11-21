
import java.util.ArrayList;

public class Maestro {

    private String Nombre;
    private String Apellido;
    private int Salario;
    private int Salon;
    private ArrayList<Clase> Clases;

    public Maestro() {
    }

    public Maestro(String Nombre, String Apellido, int Salario, int Salon, ArrayList<Clase> Clases) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Salario = Salario;
        this.Salon = Salon;
        this.Clases = Clases;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public int getSalon() {
        return Salon;
    }

    public void setSalon(int Salon) {
        this.Salon = Salon;
    }

    public ArrayList<Clase> getClases() {
        return Clases;
    }

    public void setClases(ArrayList<Clase> Clases) {
        this.Clases = Clases;
    }

    @Override
    public String toString() {
        return Nombre + ", " + Apellido;
    }
    
}
