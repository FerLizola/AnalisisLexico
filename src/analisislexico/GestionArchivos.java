package analisislexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class GestionArchivos {
    private File directorio, archivo;   //si no usas directorio especificas la ruta, que también se podria recibir como parámetro
    public boolean crearArchivo(String nombre) throws IOException{
        archivo = new File("src/archivos", nombre+".txt");  //cambias el primer parametro por directorio y guarda el archivo en raiz del proyecto
        if(archivo.createNewFile()){
            return true;    
        }//Se creo el archivo
        return false;
    }//Crear archivo
    public String mostrar() throws IOException{
        if(archivo.exists()){
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String cad1, cad2 = "";
            while((cad1 = br.readLine()) != null){
                cad2 += cad1;
            }//while
            return cad2;
        }//El archivo existe?
        return "No existe el archivo";
    }//Mostrar
    public void escritura(String cad) throws IOException{
        FileWriter fw = new FileWriter(archivo, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(cad);
        pw.close();
    }//Escribir en archivos
}//class
