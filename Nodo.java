
/**
 *
 * @author erick
 */
public class Nodo {
    // Variable para guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    
    //constructor
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    } 
}
