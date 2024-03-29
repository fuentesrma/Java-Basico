

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapturaTeclado {
	 int CapturaInt(){
	        // para capturar desde el teclado
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader (isr);
	        // variable para capturar string
	        String captura = "";
	        // variable para entero
	        int retorno = 0;
	        // vigilamos la captura desde el teclado
	        try {
	            captura = br.readLine();
	            try {
	                retorno = Integer.parseInt(captura);
	            } catch (Exception e) {
	                System.out.println("Se debe ingresar un valor entero!!!");
	            }
	        } catch (IOException e){
	            // mostramos el error, si lo hubiera
	            System.out.println("Error de entrada!!!");
	        }
	        return retorno;
	    }
	 double CapturaDouble(){
	        // para capturar desde el teclado
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader (isr);
	        // variable para capturar string
	        String captura = "";
	        // variable para entero
	        double retorno = 0;
	        // vigilamos la captura desde el teclado
	        try {
	            captura = br.readLine();
	            try {
	                retorno = Double.parseDouble(captura);
	            } catch (Exception e) {
	                System.out.println("Se debe ingresar un valor numerico!!!");
	            }
	        } catch (IOException e){
	            // mostramos el error, si lo hubiera
	            System.out.println("Error de entrada!!!");
	        }
	        return retorno;
	    }
}
