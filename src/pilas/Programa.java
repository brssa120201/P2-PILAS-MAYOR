package pilas;

public class Programa {

	public static void main(String[] args) {
		
		PilaProductoA pilaProducto = fillStack();
		float descuentos = calDescuentoTotal(pilaProducto);
		System.out.println("El descuento total es: " +descuentos);
		
		pilaProducto = fillStack();
		float menor = calProductoMenorPrecio(pilaProducto);
		System.out.println("El producto más barato tiene un precio de: " +menor);
		
		pilaProducto = fillStack();
		float descuentoMayor = calProductoMasDescuesto(pilaProducto);
		System.out.println("El descuento mayor es: " +descuentoMayor);
		
		System.out.println("--------------------------------------------------------");
	
		
	}
	
	public static PilaProductoA fillStack() {
		
		PilaProductoA pilaProducto = new PilaProductoA();
		
		Producto p1 = new Producto();
		p1.identificacion = 1;
		p1.nombre = "Leche";
		p1.precio = 1000;
		p1.porDescuento = 20;
		pilaProducto.push(p1);
		
		Producto p2 = new Producto();
		p2.identificacion = 2;
		p2.nombre = "Arroz";
		p2.precio = 3200;
		p2.porDescuento = 15;
		pilaProducto.push(p2);
		
		Producto p3 = new Producto();
		p3.identificacion = 3;
		p3.nombre = "Panela";
		p3.precio = 2350;
		p3.porDescuento = 40;
		pilaProducto.push(p3);
		
			
		return pilaProducto;
	}
	
	

	public static float calDescuentoTotal(PilaProductoA pilaProducto) {
		float suma = 0;
		int cantProductos = 0;
		
		while (pilaProducto.estaVacia() == false) {
			Producto producto = pilaProducto.pop();
			suma = suma + ((producto.precio * producto.porDescuento)/ 100);
			cantProductos++;
		}
		
		return suma;
	}
	
	public static float calProductoMenorPrecio(PilaProductoA pilaProducto) {
		float menor = pilaProducto.pop().precio;
		
		while(pilaProducto.estaVacia() == false) {
			float precio = pilaProducto.pop().precio;
			if(precio < menor) {
				menor = precio;
			}
		}
		return menor;
	}
	
	
	public static float calProductoMasDescuesto(PilaProductoA pilaProducto) {
		float descuento = pilaProducto.pop().porDescuento;
		
		while(pilaProducto.estaVacia() == false) {
			float porcentaje = pilaProducto.pop().porDescuento;
			if(porcentaje > descuento) {
				descuento = porcentaje;
			}
		}
		return descuento;
	}
	
}

	
	
	

