package LinearStructures;

public class PokeLinkedList {
    private class Node {
        //atributos
        private Object element;
	private Node next;
		
	//Constructores
        public Node() {
            this.element = null;
            this.next = null;
	}

        public Node(Object element) {
            this.element = element;
            this.next = null;
	}
		
        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
	}
		
        //m�todos
        public Object getElement() {
            return this.element;
	}
		
        public void setElement(Object element) {
            this.element = element;
	}
		
	public Node getNext() {
            return this.next;
	}
		
        public void setNext(Node next) {
            this.next = next;	
	}
    }
	
    //atributos LinkedList
    private Node head;
    private Node current;
    private Node tail;
    private int position;
    private int size;
	
    //constructores LinkedList
    public PokeLinkedList() {
        this.head = new Node();
	this.current = this.head;
        this.tail = this.head;
	this.size = 0;
        this.position = -1;
    }
	
    /**
     * Agrega un nuevo elemento a la lista
     * @param element El elemento a agregar
     */
    public void insert(Object element) {
        //insertar en cualquier posición
        Node newNode = new Node(element, this.current.getNext());
        this.current.setNext(newNode);
        //necesario si se est� insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
	}
        this.size++;
    }
	
    public void append(Object element) {
        //siempre se pega al final de la lista
	Node newNode = new Node(element);
        this.tail.setNext(newNode);
	this.tail = newNode;
        this.size++;
    }
	
    public void remove() {
        //verificar que la lista no est� vac�a
	if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
	} //tambi�n if (this.size == 0) ...
		
        //en temp se va a almacenar el nodo ANTERIOR al que se quiere borrar
        Node temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
	}
        //borrar la referencia al nodo actual
        temp.setNext(this.current.getNext());
        //necesario si se esta borrando el �ltimo nodo
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
	}
        else //necesario si se est� borrando un nodo diferente al �ltimo
            this.current = this.current.getNext();	
        this.size--; //disminuir el tama�o
    }
	
    public void clear() {
        this.head = this.tail = this.current = new Node();
        this.position = -1;
	this.size = 0;
    }
	
    public Object getElement(){
        return this.current.getElement();
    }	
	
    public int getSize() {
        return this.size;
    }
	
    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en �ltimo nodo, no se puede avanzar");
            return false;
	}
        this.current = this.current.getNext();
        this.position++;
        return true;
    }
	
    public boolean previous() {		
        if (this.current == this.head) {
            System.out.println("Actualmente en primer nodo, no se puede retroceder");
            return false;
        }
        Node temp = head;
        this.position = -1;
	while (temp.getNext() != this.current) {
            temp = temp.getNext();
            this.position++;
	}
        this.current = temp;
	return true;
    }
	
    public int getPosition() {
        return this.position;	
    }
	
    public void goToStart(){
        this.current = this.head;
	this.position = -1;
    }
	
    public void goToEnd(){
        this.current = this.tail;
	this.position = this.size - 1;
    }
	
    public void goToPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Posici�n inv�lida");
            return;
	}
        if (pos > this.position) {
            while (pos > this.position) {
                this.next();
            }
	}
        else if (pos < this.position) {
            while (pos < this.position) {
                this.previous();	
            }
	}
    }
	
    public int getPositionOfElement(Object element) {
        Node tempNode = this.head;
        int position = -1;
        while (tempNode != null) {
            if (tempNode.getElement() != null && tempNode.getElement().equals(element)){
                return position;
            }
            tempNode = tempNode.getNext();
            position++;
	}
        return -1;
    }
	
    /*** Devuelve la representaci�n en String de la lista @return un string representado la lista */
    public String toString() {
        Node currentNode = this.head.getNext();	
        StringBuffer result = new StringBuffer();
        for (int i = 0; currentNode != null; i++){
            if (i > 0){
                result.append(",");
            }
            Object element = currentNode.getElement();		
            result.append(element == null ? "" : element);
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }
}