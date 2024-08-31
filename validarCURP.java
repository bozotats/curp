import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class validarCURP {
    public static void main(String[] args) throws Exception{

        File entradaCSV = new File(args[0]);
        BufferedReader lector = new BufferedReader(new FileReader(entradaCSV));
        String currentline;
        int renglon = 0;

        while ((currentline = lector.readLine()) != null) {
            
            renglon++;

                if (currentline.matches("[A-Z]{4}[0-9]{2}[0-1][1-9][0-3][1-9][HM][A-Z]{5,6}[0-9]{1,2}")) {
                } else {
                    System.out.println(currentline + " no es una CURP valida, renglon: " + renglon);
                }
        }
    }
}