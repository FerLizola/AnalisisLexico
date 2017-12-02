package analisislexico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    Archivo(){
    }
    
    Archivo(float min_hum,float min_luz,float min_ph,float min_agua,float min_sust,String hum,
            String luz,String ph,String agua,String sust,int out_hum,int out_luz,int out_ph,int out_agua,int out_sust){
        this.min_hum=min_hum;
        this.min_luz=min_luz;
        this.min_ph=min_ph;
        this.min_agua=min_agua;
        this.min_sust=min_sust;
        this.out_hum=out_hum;
        this.out_luz=out_luz;
        this.out_ph=out_ph;
        this.out_agua=out_agua;
        this.out_sust=out_sust;
        this.hum=hum;
        this.luz=luz;
        this.agua=agua;
        this.ph=ph;
        this.sust=sust;
        codigo= "int hum ="+ hum+";\n" +
                    "int luz ="+ luz+";\n" +
                    "int ph ="+ ph+";\n" +
                    "int agua = "+agua+";\n" +
                    "int sustrato = "+sust+";\n" +
                    "\n" +
                    "int out_hum ="+out_hum+";\n" +
                    "int out_luz ="+ out_luz+";\n" +
                    "int out_ph ="+out_ph+";\n" +
                    "int out_agua ="+out_agua+";\n" +
                    "int out_sust ="+ out_sust+";\n" +
                    "\n" +
                    "int min_hum ="+ min_hum+" ;\n" +
                    "int min_luz = "+min_luz+";\n" +
                    "int min_ph = "+min_ph+";\n" +
                    "int min_agua ="+min_agua+";\n" +
                    "int min_sust = "+min_sust+";\n" +
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
    }
    static float min_hum,min_luz,min_ph,min_agua,min_sust;
    static String hum,luz,ph,agua,sust;
    static int out_hum,out_luz,out_ph,out_agua,out_sust;
    static String codigo;
    
    String getCode(){return codigo;}
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
        file.crearArchivo("C:\\Users\\Bryan\\","ejemplo", "void setup(){\n}\nvoid loop(){\n}");
        Arduino a = new Arduino();
        a.compilar();
        a.cargar("COM3");
    }
}
