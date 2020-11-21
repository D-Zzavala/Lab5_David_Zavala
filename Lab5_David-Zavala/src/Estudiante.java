
public class Estudiante {

    private String Nombre;
    private String Apellido;
    private int Cuenta;
    private int Edad;
    private String Genero;
    private Carrera Carera;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Apellido, int Cuenta, int Edad, String Genero, Carrera Carera) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cuenta = Cuenta;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Carera = Carera;
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

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Carrera getCarera() {
        return Carera;
    }

    public void setCarera(Carrera Carera) {
        this.Carera = Carera;
    }

    @Override
    public String toString() {
        return Nombre + ", " + Apellido + ", Cuenta:" + Cuenta;
    }

}
