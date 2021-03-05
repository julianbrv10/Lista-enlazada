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
        lista.agregarAlInicio(2);
        
        System.out.println("<<-- Lista -->>");
        lista.listar();
        
        
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nInsrta un nodo con valor 18 despues del 22");
        lista.insertarPorReferencia(22, 18);
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nElimina el nodo con el valor 5");
        lista.removerPorReferencia(5);        
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        System.out.println("\n\nElimina el primer elemento de la lista");
        lista.eliminarPrimero();
        lista.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(lista.getTamanio());
        
        
        System.out.println("\nEliminar la lista");
        lista.eliminar();
        
        
        System.out.println("\n¿La lista ya esta vacia?");
        System.out.println(lista.esVacia());
    }
    
}
