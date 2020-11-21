
package cel.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ADministrado {
    
    private ArrayList<CElular> ACel = new ArrayList<>();
    private File archivo = null;

    public ADministrado(String path) {
    archivo = new File(path);
    }

    public ArrayList<CElular> getACel() {
        return ACel;
    }

    public void setACel(ArrayList<CElular> ACel) {
        this.ACel = ACel;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
 
    //extra mutador
    public void setPersona(CElular cel) {
        this.ACel.add(cel);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (CElular t : ACel) {
                bw.write(t.getMarca() + ";");
                bw.write(t.getModelo() + ";");
                bw.write(t.getMemoria() + ";");
                bw.write(t.getPrecio() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ACel = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ACel.add(new CElular(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
    public void imprimirArchivo(){
        
    }
    
}
