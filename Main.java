/**
 *
 * @author erick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         Lista lista = new Lista();
        
        // Agregar al final de la lista
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(5);
        lista.agregarAlFinal(22);
        // Agregar in inicio de la lista
        lista.agregarAlInicio(32);
        lista.agregarAlInicio(23);
        lista.agregarAlInicio(56);

        
        System.out.println("<<-- La lista se compone de los siguientes nodos -->>");
        lista.mostrar();
        
        
        System.out.println("\n\n<<-- Tamañon total -->");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nAgrega un nuevo nodo con valor 18 despues del 22 vato loco");
        lista.insertarID(22, 18);
        lista.mostrar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nElimina el nodo con valor 22");
        lista.quitarId(22);        
        lista.mostrar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nElimina el primer elemento de la lista");
        lista.eliminarPrimero();
        lista.mostrar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nElimina el ultimo elemento de la lista");
        lista.quitarFinal();
        lista.mostrar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nEliminar la lista");
        lista.eliminar();
        
        
        System.out.println("\n¿La lista ya esta vacia?");
        System.out.println(lista.esVacia());
    }
    
}
