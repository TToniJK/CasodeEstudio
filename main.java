package CasoEstudio;


public class main {
    public static void main(String[] args) {
        
        Pila pila = new Pila();

        pila.push("Toni");
        pila.push("Gabriel");
        pila.push("Esteban");
        pila.push("Luis");

        pila.mostrar();

        String top = pila.peek();
        System.out.println("Elemento en el tope: " + top);

        String eliminado = pila.pop();
        System.out.println("Elemento en el tope eliminado: " + eliminado);

        String insertado = pila.push("Kevin");
        System.out.println("Insertado: " + insertado);
        pila.mostrar();
    }
    
}
    

