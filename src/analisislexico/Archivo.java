package analisislexico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    static String codigo = "int hum = A0;\n" +
                    "int luz = A1;\n" +
                    "int ph = A2;\n" +
                    "int agua = A3;\n" +
                    "int sustrato = A4;\n" +
                    "\n" +
                    "int out_hum = 2;\n" +
                    "int out_luz = 3;\n" +
                    "int out_ph = 4;\n" +
                    "int out_agua = 5;\n" +
                    "int out_sust = 6;\n" +
                    "\n" +
                    "int min_hum = 0;\n" +
                    "int min_luz = 0;\n" +
                    "int min_ph = 0;\n" +
                    "int min_agua = 0;\n" +
                    "int min_sust = 0;\n" +
                    "\n" +
                    "void setup() {\n" +
                    "  pinMode(out_hum, OUTPUT);\n" +
                    "  pinMode(out_luz, OUTPUT);\n" +
                    "  pinMode(out_ph, OUTPUT);\n" +
                    "  pinMode(out_agua, OUTPUT);\n" +
                    "  pinMode(out_sust, OUTPUT);\n" +
                    "}\n" +
                    "\n" +
                    "void loop() {\n" +
                    "  if(analogRead(hum)<min_hum){\n" +
                    "    digitalWrite(out_hum, HIGH);    \n" +
                    "  }else{\n" +
                    "    digitalWrite(out_hum, LOW);    \n" +
                    "  }\n" +
                    "  \n" +
                    "  if(analogRead(luz)<min_luz){\n" +
                    "    digitalWrite(out_luz, HIGH);\n" +
                    "  }else{\n" +
                    "    digitalWrite(out_luz, LOW);  \n" +
                    "  }\n" +
                    "  \n" +
                    "  if(analogRead(ph)<min_ph){\n" +
                    "    digitalWrite(out_ph, HIGH);\n" +
                    "  }else{\n" +
                    "    digitalWrite(out_ph, LOW);\n" +
                    "  }\n" +
                    "  \n" +
                    "  if(analogRead(agua)<min_agua){\n" +
                    "    digitalWrite(out_agua, HIGH);\n" +
                    "  }else{\n" +
                    "    digitalWrite(out_agua, LOW);\n" +
                    "  }\n" +
                    "  \n" +
                    "  if(analogRead(sustrato)<min_sust){\n" +
                    "    digitalWrite(out_sust, HIGH);\n" +
                    "  }else{\n" +
                    "    digitalWrite(out_sust, LOW);\n" +
                    "  }\n" +
                    "  \n" +
                    "}";
    
    
    public void crearArchivo(String ruta, String nombre, String codigo) throws IOException{
        crearCarpeta(ruta, nombre);
        System.out.println("Carpeta Creada");
        File archivo = new File(ruta+nombre+"\\"+nombre+".ino");
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(codigo);
            System.out.println("Archivo reescrito");
        }else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(codigo);
            System.out.println("Archivo creado");
        }
        bw.close();
    }
    
    public void crearCarpeta(String ruta, String nombre){
    
    File theDir = new File(ruta+nombre);
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                System.out.println(se);
            }        
            if(result) {    
                System.out.println("DIR created");  
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        Archivo file = new Archivo();
        file.crearArchivo("C:\\Users\\Bryan\\","arduino", codigo);
    }
}
