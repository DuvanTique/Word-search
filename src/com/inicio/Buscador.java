package com.inicio;
/**
 *
 * @author Duvan
 */
public class Buscador {
      
    public static String buscarPalabra(String texto,String buscar, String remplazar){
        boolean encontrado = false;
        String mensajeSalida = "";
        String[] palabras = texto.split("\\s+");
        for(String palabra : palabras){
            if(palabra.equals(buscar)){
                mensajeSalida += " " + remplazar;
            }
            else{
                mensajeSalida += " " + palabra;
            }
        }
        return mensajeSalida;
    }
    
}

