package CasoEstudio;

import java.util.ArrayList;

public class Pila {

    private ArrayList<String> cadenaCaracteres = new ArrayList<>();
    
    public Pila() {
        cadenaCaracteres = new ArrayList<>();
    }

    public void push(String nuevoNombre) {
    cadenaCaracteres.add(nuevoNombre);
}

    public String pop() { //Remueve el dato de la cima de la pila
        if(cadenaCaracteres.isEmpty()) {
            return "Eliminado"; 
        }
        return cadenaCaracteres.removeLast();
    }

    public String peek() {
        if(cadenaCaracteres.isEmpty()) {
            return ""; 
        }
        return cadenaCaracteres.getLast();
    }

    public void mostrar() {
        if(cadenaCaracteres.isEmpty()) {
            System.out.println("La pila está vacía");
            return;
        }
        
        System.out.print("Pila: ");
        for(String c : cadenaCaracteres) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

}

