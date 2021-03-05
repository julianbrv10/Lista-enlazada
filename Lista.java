
/**
 *
 * @author erick
 */
public class Lista {
    // Puntero que indica el inicio de la lista
    private Nodo inicio;
    // Variable para registrar el tamaño de la lista
    private int tamanio;
    
    //Constructor
    
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la lista esta vacia.
     * true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    //checa si la lista esta llena
    public boolean isFull(){
	return tamanio==10;
    }
    
    //Consulta cuantos elementos tiene la lista.
     
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(int valor){
        if(tamanio==10){
            System.out.println("La lista esta llena pariente");
        }
        else{
        // Define un nuevo nodo
        Nodo nuevo = new Nodo();
        
        // Agrega al valor al nodo
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            //agrega el valor a la lista
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    }
    
    public void agregarAlInicio(int valor){
        if(tamanio==10){
            System.out.println("La lista esta llena pariente");
        }
        else{
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            inicio = nuevo; 
        } else{
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        tamanio++;
    }
    }
    public void insertarID(int referencia, int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (!esVacia()) {
            // Consulta si el valor existe en la lista.
            if (buscar(referencia)) {
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getSiguiente();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setSiguiente(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setSiguiente(siguiente);
                tamanio++;
            }
        }
    }
    

    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getValor();
            }else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

    public boolean buscar(int referencia){
        Nodo aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Cambia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente nodo
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    public int getPosicion(int referencia) throws Exception{
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            Nodo aux = inicio;
            // Contador para almacenar la posición del nodo.
            int cont = 0;
            // Recoore la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getValor()){
                // Incrementa el contador.
                cont ++;
                // Avansa al siguiente nodo.
                aux = aux.getSiguiente();
            }
            // Retorna el valor del contador.
            return cont;
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }
    public void quitarId(int referencia){
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getValor() == referencia) {
                // El primer nodo apunta al siguiente.
                inicio = inicio.getSiguiente();
            } else{
                Nodo aux = inicio;
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                // Guarda el nodo siguiente del nodo a eliminar.
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                // Enlaza el nodo anterior al de eliminar con el 
                // sguiente despues de el.
                aux.setSiguiente(siguiente);  
            }
            tamanio--;
        }
    }
    public void eliminar(){
        inicio = null;
        tamanio = 0;
    }
    
    public void eliminarPrimero(){
        if(!esVacia()){
            inicio = inicio.getSiguiente();
            tamanio--;
        }
    }
    
    public void quitarFinal(){
        Nodo ayuda = inicio;
        //recorre toda la lista
        while(ayuda.getSiguiente().getSiguiente() != null){
            ayuda = ayuda.getSiguiente();
        }
        ayuda.setSiguiente(null);
    
        
    }

    public void mostrar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i+1 + ".[ " + aux.getValor() + " ]" + " -->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}