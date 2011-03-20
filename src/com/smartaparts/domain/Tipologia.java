	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Tipologia {

		/**
 *
 */
		private Collection<Ordine> ordini;

		/**
		 * Getter of the property <tt>ordini</tt>
		 * 
		 * @return Returns the ordini.
		 * 
		 */

		public Collection<Ordine> getOrdini() {
			return ordini;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Ordine> ordiniIterator() {
			return ordini.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isOrdiniEmpty() {
			return ordini.isEmpty();
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
		public boolean containsOrdini(Ordine ordini) {
			return this.ordini.contains(ordini);
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
		public boolean containsAllOrdini(Collection<Ordine> ordini) {
			return this.ordini.containsAll(ordini);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int ordiniSize() {
			return ordini.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Ordine[] ordiniToArray() {
			return ordini.toArray(new Ordine[ordini.size()]);
		}

		/**
		 * Setter of the property <tt>ordini</tt>
		 * 
		 * @param ordini
		 *            the ordini to set.
		 * 
		 */
		public void setOrdini(Collection<Ordine> ordini) {
			this.ordini = ordini;
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
		public boolean addOrdini(Ordine ordini) {
			return this.ordini.add(ordini);
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
		public boolean removeOrdini(Ordine ordini) {
			return this.ordini.remove(ordini);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearOrdini() {
			this.ordini.clear();
		}

	}

	// /**
	// * Setter of the property <tt>ordine</tt>
	// *
	// * @param ordine
	// * The ordine to set.
	// *
	// */
	// public void setOrdine(Ordine ordine) {
	// this.ordine = ordine;
	// }
	// /**
	// * Getter of the property <tt>ordine</tt>
	// *
	// * @return Returns the ordine.
	// *
	// */
	//
	// public Ordine getOrdine() {
	// return ordine;
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
//		public boolean addOrdine(Ordine ordine) {
//			return this.ordine.add(ordine);
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
//		public boolean containsOrdine(Ordine ordine) {
//			return this.ordine.contains(ordine);
//		}
///**
//		 * Returns an iterator over the elements in this collection.
//		 * 
//		 * @return an <tt>Iterator</tt> over the elements in this collection
//		 * @see java.util.Collection#iterator()
//		 * 
//		 */
//		public Iterator<Ordine> ordineIterator() {
//			return ordine.iterator();
//		}
///**
//		 * Removes all of the elements from this collection (optional
//		 * operation).
//		 * 
//		 * @see java.util.Collection#clear()
//		 * 
//		 */
//		public void clearOrdine() {
//			this.ordine.clear();
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
//		public boolean removeOrdine(Ordine ordine) {
//			return this.ordine.remove(ordine);
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
//		public boolean containsAllOrdine(Collection<Ordine> ordine) {
//			return this.ordine.containsAll(ordine);
//		}
///**
//		 * Returns all elements of this collection in an array.
//		 * 
//		 * @return an array containing all of the elements in this collection
//		 * @see java.util.Collection#toArray()
//		 * 
//		 */
//		public Ordine[] ordineToArray() {
//			return ordine.toArray(new Ordine[ordine.size()]);
//		}
///**
//		 * Setter of the property <tt>ordine</tt>
//		 * 
//		 * @param ordine
//		 *            the ordine to set.
//		 * 
//		 */
//		public void setOrdine(Collection<Ordine> ordine) {
//			this.ordine = ordine;
//		}
///**
//		 * Returns the number of elements in this collection.
//		 * 
//		 * @return the number of elements in this collection
//		 * @see java.util.Collection#size()
//		 * 
//		 */
//		public int ordineSize() {
//			return ordine.size();
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains no elements.
//		 * 
//		 * @return <tt>true</tt> if this collection contains no elements
//		 * @see java.util.Collection#isEmpty()
//		 * 
//		 */
//		public boolean isOrdineEmpty() {
//			return ordine.isEmpty();
//		}
///**
//		 * Getter of the property <tt>ordine</tt>
//		 * 
//		 * @return Returns the ordine.
//		 * 
//		 */
//
//		public Collection<Ordine> getOrdine() {
//			return ordine;
//		}