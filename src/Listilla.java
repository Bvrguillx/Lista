
public class Listilla<L> {

	// ATRIBUTOS
	private L[] elementos;
	private int index;

	// GETTERS Y SETTERS PARA EL INDICE
	public int getIndex() {
		return index;
	}

	public int setIndex(int i) { // NO CONSIGO REALIZAR LA DECLARACION DE FORMA
									// QUE ME DEVUELVA EL (-1) CUANDO NO ADMITE
									// EL TAMAÑO
		return this.index = i;
		
		// if (index != i){
		// throw new exception = "Error Generico";
		// }
		// while (this.index != i) {
		// return -1;
		// }
	}

	// CONSTRUCTOR VACIO
	@SuppressWarnings("unchecked")
	public Listilla() {
		// Reservara memoria para un arrayde 0 a T elementos.
		// Ademas, pondra a 0 el index
		this.elementos = (L[]) new Object[0];
	}

	// METODOS
	@SuppressWarnings("unchecked")
	public void add(L element) {
		// Añadirá el elemento al array. Evidentemente
		// habrá que hacer una reserva de memoria para
		// añadir un elemento más. Lo añadirá al final de la
		// lista. Posiciona el index a este elemento
		L[] arrayAux = (L[]) new Object[elementos.length + 1];
		for (index = 0; index < elementos.length; index++) {
			arrayAux[index] = elementos[index];
		}
		arrayAux[arrayAux.length - 1] = (L) element;
		elementos = arrayAux;
	}

	@SuppressWarnings("unchecked")
	public void remove(L element) {
		// Eliminará del array el elemento. Evidentemente
		// habrá que redimensionar el array al tamaño real.
		// Posiciona index al elemento anterior borrado
		L[] arrayAux = (L[]) new Object[elementos.length - 1];
		for (index = 0; index < elementos.length; index++) {
			if (elementos[index].equals(elementos)) {
				elementos[index] = (L) arrayAux[index - 1];
			}
		}
	}

	@SuppressWarnings("unchecked")
	public L getNext() {
		// Devolvera el elemento siguiente al que apunte el index.
		// No lo elimina. Por supuesto, modifica el indice
		for (index = 0; index < elementos.length; index++) {
			if (elementos[index].equals(elementos[index + 1])) {
				elementos[index] = elementos[index + 1];
			} else {
				elementos[index] = elementos[0];
			}
		}
		return (L) elementos;
	}

	@SuppressWarnings("unchecked")
	public L getPrev() {
		// Devolvera el elemento anterior al que apunte el index.
		// No lo elimina. Por supuesto, modifica el indice
		for (index = 0; index < elementos.length; index++) {
			if (elementos[index].equals(elementos[index - 1])) {
				elementos[index] = elementos[index - 1];
			} else {
				elementos[index] = elementos[elementos.length - 1];
			}
		}
		return (L) elementos;
	}

	@SuppressWarnings("unchecked")
	public L getCurrent() {
		// Devolvera el elemento actual al que apunte el index.
		// No lo elimina
		for (index = 0; index < elementos.length; index++) {
			if (elementos[index].equals(elementos)) {
				elementos[index] = elementos[index];
			}
		}
		return (L) elementos;
	}

	public boolean isEmpty() {
		// Devuelve true si el array está vacío.
		if (elementos == null) {
			return true;
		}
		if (elementos.length == 0) {
			return true;
		}
		return false;
	}
	
	public boolean contains() {
		// Devuelve true si el elemento está en la
		// colección utilizando el equals de la clase T.
		for (index = 0; index < elementos.length; index++) {
			if (elementos[index].equals(elementos))
				return true;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void clear() {
		// Eliminará del array todos los elementos y
		// dejará el array de tamaño 0.
		elementos = (L[]) new Object[0]; 
	}
}
