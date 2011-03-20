	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Proprietario extends Utente {

		/**
 *
 */
		private Collection<Appartamento> appartamenti = null;

		/**
		 * Getter of the property <tt>appartamenti</tt>
		 * 
		 * @return Returns the appartamenti.
		 * 
		 */

		public Collection<Appartamento> getAppartamenti() {
			return appartamenti;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Appartamento> appartamentiIterator() {
			return appartamenti.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isAppartamentiEmpty() {
			return appartamenti.isEmpty();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains the specified
		 * element.
		 * 
		 * @param element
		 *            whose presence in this collection is to be tested.
		 * @see java.util.Collection#contains(Object)
		 * 
		 */
		public boolean containsAppartamenti(Appartamento appartamenti) {
			return this.appartamenti.contains(appartamenti);
		}

		/**
		 * Returns <tt>true</tt> if this collection contains all of the elements
		 * in the specified collection.
		 * 
		 * @param elements
		 *            collection to be checked for containment in this
		 *            collection.
		 * @see java.util.Collection#containsAll(Collection)
		 * 
		 */
		public boolean containsAllAppartamenti(
				Collection<Appartamento> appartamenti) {
			return this.appartamenti.containsAll(appartamenti);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int appartamentiSize() {
			return appartamenti.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Appartamento[] appartamentiToArray() {
			return appartamenti.toArray(new Appartamento[appartamenti.size()]);
		}

		/**
		 * Setter of the property <tt>appartamenti</tt>
		 * 
		 * @param appartamenti
		 *            the appartamenti to set.
		 * 
		 */
		public void setAppartamenti(Collection<Appartamento> appartamenti) {
			this.appartamenti = appartamenti;
		}

		/**
		 * Ensures that this collection contains the specified element (optional
		 * operation).
		 * 
		 * @param element
		 *            whose presence in this collection is to be ensured.
		 * @see java.util.Collection#add(Object)
		 * 
		 */
		public boolean addAppartamenti(Appartamento appartamenti) {
			return this.appartamenti.add(appartamenti);
		}

		/**
		 * Removes a single instance of the specified element from this
		 * collection, if it is present (optional operation).
		 * 
		 * @param element
		 *            to be removed from this collection, if present.
		 * @see java.util.Collection#add(Object)
		 * 
		 */
		public boolean removeAppartamenti(Appartamento appartamenti) {
			return this.appartamenti.remove(appartamenti);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearAppartamenti() {
			this.appartamenti.clear();
		}

	}

	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Appartamento> appartamentoIterator() {
	// return appartamento.iterator();
	// }
	// /**
	// * Getter of the property <tt>appartamento</tt>
	// *
	// * @return Returns the appartamento.
	// *
	// */
	//
	// public Collection<Appartamento> getAppartamento() {
	// return appartamento;
	// }
	// /**
	// * Ensures that this collection contains the specified element (optional
	// * operation).
	// *
	// * @param element
	// * whose presence in this collection is to be ensured.
	// * @see java.util.Collection#add(Object)
	// *
	// */
	// public boolean addAppartamento(Appartamento appartamento) {
	// return this.appartamento.add(appartamento);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearAppartamento() {
	// this.appartamento.clear();
	// }
	// /**
	// * Setter of the property <tt>appartamento</tt>
	// *
	// * @param appartamento
	// * the appartamento to set.
	// *
	// */
	// public void setAppartamento(Collection<Appartamento> appartamento) {
	// this.appartamento = appartamento;
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains the specified
	// * element.
	// *
	// * @param element
	// * whose presence in this collection is to be tested.
	// * @see java.util.Collection#contains(Object)
	// *
	// */
	// public boolean containsAppartamento(Appartamento appartamento) {
	// return this.appartamento.contains(appartamento);
	// }
	// /**
	// * Removes a single instance of the specified element from this
	// * collection, if it is present (optional operation).
	// *
	// * @param element
	// * to be removed from this collection, if present.
	// * @see java.util.Collection#add(Object)
	// *
	// */
	// public boolean removeAppartamento(Appartamento appartamento) {
	// return this.appartamento.remove(appartamento);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int appartamentoSize() {
	// return appartamento.size();
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Appartamento[] appartamentoToArray() {
	// return appartamento.toArray(new Appartamento[appartamento.size()]);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains all of the elements
	// * in the specified collection.
	// *
	// * @param elements
	// * collection to be checked for containment in this
	// * collection.
	// * @see java.util.Collection#containsAll(Collection)
	// *
	// */
	// public boolean containsAllAppartamento(
	// Collection<Appartamento> appartamento) {
	// return this.appartamento.containsAll(appartamento);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isAppartamentoEmpty() {
	// return appartamento.isEmpty();
	// }
///**
//		 * Ensures that this collection contains the specified element (optional
//		 * operation).
//		 * 
//		 * @param element
//		 *            whose presence in this collection is to be ensured.
//		 * @see java.util.Collection#add(Object)
//		 * 
//		 */
//		public boolean addAppartamentos(Appartamento appartamentos) {
//			return this.appartamentos.add(appartamentos);
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains no elements.
//		 * 
//		 * @return <tt>true</tt> if this collection contains no elements
//		 * @see java.util.Collection#isEmpty()
//		 * 
//		 */
//		public boolean isAppartamentosEmpty() {
//			return appartamentos.isEmpty();
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains the specified
//		 * element.
//		 * 
//		 * @param element
//		 *            whose presence in this collection is to be tested.
//		 * @see java.util.Collection#contains(Object)
//		 * 
//		 */
//		public boolean containsAppartamentos(Appartamento appartamentos) {
//			return this.appartamentos.contains(appartamentos);
//		}
///**
//		 * Setter of the property <tt>appartamentos</tt>
//		 * 
//		 * @param appartamentos
//		 *            the appartamentos to set.
//		 * 
//		 */
//		public void setAppartamentos(Collection<Appartamento> appartamentos) {
//			this.appartamentos = appartamentos;
//		}
///**
//		 * Removes all of the elements from this collection (optional
//		 * operation).
//		 * 
//		 * @see java.util.Collection#clear()
//		 * 
//		 */
//		public void clearAppartamentos() {
//			this.appartamentos.clear();
//		}
///**
//		 * Returns the number of elements in this collection.
//		 * 
//		 * @return the number of elements in this collection
//		 * @see java.util.Collection#size()
//		 * 
//		 */
//		public int appartamentosSize() {
//			return appartamentos.size();
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains all of the elements
//		 * in the specified collection.
//		 * 
//		 * @param elements
//		 *            collection to be checked for containment in this
//		 *            collection.
//		 * @see java.util.Collection#containsAll(Collection)
//		 * 
//		 */
//		public boolean containsAllAppartamentos(
//				Collection<Appartamento> appartamentos) {
//			return this.appartamentos.containsAll(appartamentos);
//		}
///**
//		 * Removes a single instance of the specified element from this
//		 * collection, if it is present (optional operation).
//		 * 
//		 * @param element
//		 *            to be removed from this collection, if present.
//		 * @see java.util.Collection#add(Object)
//		 * 
//		 */
//		public boolean removeAppartamentos(Appartamento appartamentos) {
//			return this.appartamentos.remove(appartamentos);
//		}
///**
//		 * Returns all elements of this collection in an array.
//		 * 
//		 * @return an array containing all of the elements in this collection
//		 * @see java.util.Collection#toArray()
//		 * 
//		 */
//		public Appartamento[] appartamentosToArray() {
//			return appartamentos
//					.toArray(new Appartamento[appartamentos.size()]);
//		}
///**
//		 * Getter of the property <tt>appartamentos</tt>
//		 * 
//		 * @return Returns the appartamentos.
//		 * 
//		 */
//
//		public Collection<Appartamento> getAppartamentos() {
//			return appartamentos;
//		}
///**
//		 * Returns an iterator over the elements in this collection.
//		 * 
//		 * @return an <tt>Iterator</tt> over the elements in this collection
//		 * @see java.util.Collection#iterator()
//		 * 
//		 */
//		public Iterator<Appartamento> appartamentosIterator() {
//			return appartamentos.iterator();
//		}