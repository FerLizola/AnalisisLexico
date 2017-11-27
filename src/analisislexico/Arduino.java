package analisislexico;

import java.io.IOException;

/**
 *
 * @author Bryan
 */
public class Arduino {
    String arduino_build = "arduino_build_1650";
    String arduino_cache = "arduino_cache_979814";
    String path = " C:\\Users\\Bryan\\ejemplo/ejemplo.ino ";
    String cache = " C:\\Users\\Bryan\\AppData\\Local\\Temp\\"+arduino_cache;
    String build = " C:\\Users\\Bryan\\AppData\\Local\\Temp\\"+arduino_build;
    
    String dump =
        "\"C:\\Program Files (x86)\\Arduino\\arduino-builder\" -dump-prefs -logger=machine -hardware "+ 
        "\"C:\\Program Files (x86)\\Arduino\\hardware\" -hardware "+
        "\"C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\" -tools "+ 
        "\"C:\\Program Files (x86)\\Arduino\\tools-builder\" -tools "+
        "\"C:\\Program Files (x86)\\Arduino\\hardware\\tools\\avr\" -tools "+ 
        "\"C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\" -built-in-libraries "+
        "\"C:\\Program Files (x86)\\Arduino\\libraries\" -libraries "+
        "\"C:\\Users\\Bryan\\Documents\\Arduino\\libraries\" -fqbn=arduino:avr:uno "+ 
        "-vid-pid=0X2341_0X0043 -ide-version=10803 -build-path "+
        cache+ " -warnings=default -build-cache "+
        build+ " -prefs=build.warn_data_percentage=75 -prefs=runtime.tools.avrdude.path="+
        
        "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avrdude\\6.3.0-arduino9 -prefs=runtime.tools.avr-gcc.path="+
        "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avr-gcc\\4.9.2-atmel3.5.4-arduino2 -prefs=runtime.tools.arduinoOTA.path="+
        "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\arduinoOTA\\1.1.1 -verbose "+
        path;
    
    String compile = "\"C:\\Program Files (x86)\\Arduino\\arduino-builder\" -compile -logger=machine -hardware " +
                      "\"C:\\Program Files (x86)\\Arduino\\hardware\" -hardware " +
                       "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages -tools " +
                      "\"C:\\Program Files (x86)\\Arduino\\tools-builder\" -tools " +
                      "\"C:\\Program Files (x86)\\Arduino\\hardware\\tools\\avr\" -tools " +
                       "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages -built-in-libraries " +
                      "\"C:\\Program Files (x86)\\Arduino\\libraries\" -libraries " +
                       "C:\\Users\\Bryan\\Documents\\Arduino\\libraries -fqbn=arduino:avr:uno -vid-pid=0X2341_0X0043 -ide-version=10803 -build-path " +
            
            "C:\\Users\\Bryan\\AppData\\Local\\Temp\\"+arduino_build+ " -warnings=default -build-cache " +
                       
            "C:\\Users\\Bryan\\AppData\\Local\\Temp\\"+arduino_cache + " -prefs=build.warn_data_percentage=75 -prefs=runtime.tools.avrdude.path=" +
                       "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avrdude\\6.3.0-arduino9 -prefs=runtime.tools.arduinoOTA.path=" +             
                       "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\arduinoOTA\\1.1.1 -prefs=runtime.tools.avr-gcc.path=" + 
                       "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avr-gcc\\4.9.2-atmel3.5.4-arduino2 -verbose " +
                       "C:\\Users\\Bryan\\ejemplo\\ejemplo.ino";
    
    public void compilar() throws IOException{
        Process dumpP = null;
        try {
  
            dumpP = Runtime.getRuntime().exec(dump);
            System.out.println(dump);
            System.out.println("Dump finished");
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
        
        Process compileP = null;
        compileP = Runtime.getRuntime().exec(compile);
        System.out.println(compile);
        System.out.println("Compile finished");
    }
    
    public void cargar(String port){
        Process loadP = null;
        try {
            String cmd = "C:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avrdude\\6.3.0-arduino9/bin/avrdude "
                    + "-CC:\\Users\\Bryan\\AppData\\Local\\Arduino15\\packages\\arduino\\tools\\avrdude\\6.3.0-arduino9/etc/avrdude.conf"
                    + " -v -patmega328p -carduino -P "+port+" -b 115200 -D -Uflash:w:C:\\Users\\Bryan\\AppData\\Local\\Temp\\"+arduino_build+"/ejemplo.ino.hex:i";
                    
            loadP = Runtime.getRuntime().exec(cmd); 
            System.out.println(cmd);
            
        } catch (IOException ioe) {
            System.out.println (ioe);
        }
    }
    
    
    
}
