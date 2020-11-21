
package cel.admin;

public class CElular {
    private String marca;
    private String modelo;
    private int memoria;
    private double precio;

    public CElular() {
    }

    public CElular(String marca, String modelo, int memoria, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CElular{" + "marca=" + marca + ", modelo=" + modelo + ", memoria=" + memoria + ", precio=" + precio + '}';
    }
    
    
}
