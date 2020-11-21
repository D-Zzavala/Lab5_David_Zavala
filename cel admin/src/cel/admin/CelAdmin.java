package cel.admin;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CelAdmin {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag == true) {
            System.out.println("1   Crear");
            System.out.println("2  Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4.  Listar");
            System.out.println("0.  Salir");
            System.out.print("Opcion:");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    ADministrado ap = new ADministrado("./luis_flores.txt");
                    ap.cargarArchivo();
                    String marca, modelo;
                    int rom;
                    double precio;
                    marca = JOptionPane.showInputDialog("MArca");
                    modelo = JOptionPane.showInputDialog("MOdelo");
                    rom = Integer.parseInt(JOptionPane.showInputDialog("MEmoria"));
                    precio = Double.parseDouble(JOptionPane.showInputDialog("PRecio"));
                    CElular p = new CElular(marca, modelo, rom, precio);
                    ap.getACel().add(p);
                    ap.escribirArchivo();
                    break;
                }
                case 2: {
                    ADministrado ap = new ADministrado("./luis_flores.txt");
                    int p;
                    p = Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
                    double precio;
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Precio"));

                    ap.cargarArchivo();
                    ap.getACel().get(p).setPrecio(precio);
                    ap.escribirArchivo();
                    break;
                }
                case 3: {
                    ADministrado ap = new ADministrado("./luis_flores.txt");
                    int p;
                    p = Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
                    ap.cargarArchivo();
                    ap.getACel().remove(p);
                    ap.escribirArchivo();
                    break;
                }
                case 4: {
                    
                    break;
                }
                case 0: {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("Opcion invalida");
                    break;
                }
            }
        }
    }

}
