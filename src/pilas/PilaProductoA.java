package pilas;


public class PilaProductoA {

	NodoProducto top;
	
	public void push(Producto producto) {
		NodoProducto nuevo = new NodoProducto();
		nuevo.producto = producto;
		
		if(top == null) {
			top = nuevo;
		}
		else {
			nuevo.next = top;
			top = nuevo;
		}
	}
	
	public Producto pop() {
		if(top == null) {
			return null;
		}
		
		NodoProducto elemento = top;
		top = top.next;
		
		return elemento.producto;
	}
	
	public boolean estaVacia() {
		if(top == null) {
			return true;
		}
		
		return false;
	}
	
}
