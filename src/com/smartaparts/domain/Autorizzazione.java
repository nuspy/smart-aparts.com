	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Autorizzazione {

		/**
 *
 */
		private Collection<Utente> utenti;

		/**
		 * Getter of the property <tt>utenti</tt>
		 * 
		 * @return Returns the utenti.
		 * 
		 */

		public Collection<Utente> getUtenti() {
			return utenti;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Utente> utentiIterator() {
			return utenti.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isUtentiEmpty() {
			return utenti.isEmpty();
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
		public boolean containsUtenti(Utente utenti) {
			return this.utenti.contains(utenti);
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
		public boolean containsAllUtenti(Collection<Utente> utenti) {
			return this.utenti.containsAll(utenti);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int utentiSize() {
			return utenti.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Utente[] utentiToArray() {
			return utenti.toArray(new Utente[utenti.size()]);
		}

		/**
		 * Setter of the property <tt>utenti</tt>
		 * 
		 * @param utenti
		 *            the utenti to set.
		 * 
		 */
		public void setUtenti(Collection<Utente> utenti) {
			this.utenti = utenti;
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
		public boolean addUtenti(Utente utenti) {
			return this.utenti.add(utenti);
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
		public boolean removeUtenti(Utente utenti) {
			return this.utenti.remove(utenti);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearUtenti() {
			this.utenti.clear();
		}

	}

	// /**
	// * Setter of the property <tt>utente</tt>
	// *
	// * @param utente
	// * The utente to set.
	// *
	// */
	// public void setUtente(Utente utente) {
	// this.utente = utente;
	// }
	// /**
	// * Getter of the property <tt>utente</tt>
	// *
	// * @return Returns the utente.
	// *
	// */
	//
	// public Utente getUtente() {
	// return utente;
	// }
///**
//		 * Setter of the property <tt>utente</tt>
//		 * 
//		 * @param utente
//		 *            the utente to set.
//		 * 
//		 */
//		public void setUtente(Collection<Utente> utente) {
//			this.utente = utente;
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
//		public boolean containsUtente(Utente utente) {
//			return this.utente.contains(utente);
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
//		public boolean containsAllUtente(Collection<Utente> utente) {
//			return this.utente.containsAll(utente);
//		}
///**
//		 * Returns all elements of this collection in an array.
//		 * 
//		 * @return an array containing all of the elements in this collection
//		 * @see java.util.Collection#toArray()
//		 * 
//		 */
//		public Utente[] utenteToArray() {
//			return utente.toArray(new Utente[utente.size()]);
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
//		public boolean removeUtente(Utente utente) {
//			return this.utente.remove(utente);
//		}
///**
//		 * Ensures that this collection contains the specified element (optional
//		 * operation).
//		 * 
//		 * @param element
//		 *            whose presence in this collection is to be ensured.
//		 * @see java.util.Collection#add(Object)
//		 * 
//		 */
//		public boolean addUtente(Utente utente) {
//			return this.utente.add(utente);
//		}
///**
//		 * Removes all of the elements from this collection (optional
//		 * operation).
//		 * 
//		 * @see java.util.Collection#clear()
//		 * 
//		 */
//		public void clearUtente() {
//			this.utente.clear();
//		}
///**
//		 * Returns an iterator over the elements in this collection.
//		 * 
//		 * @return an <tt>Iterator</tt> over the elements in this collection
//		 * @see java.util.Collection#iterator()
//		 * 
//		 */
//		public Iterator<Utente> utenteIterator() {
//			return utente.iterator();
//		}
///**
//		 * Getter of the property <tt>utente</tt>
//		 * 
//		 * @return Returns the utente.
//		 * 
//		 */
//
//		public Collection<Utente> getUtente() {
//			return utente;
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains no elements.
//		 * 
//		 * @return <tt>true</tt> if this collection contains no elements
//		 * @see java.util.Collection#isEmpty()
//		 * 
//		 */
//		public boolean isUtenteEmpty() {
//			return utente.isEmpty();
//		}
///**
//		 * Returns the number of elements in this collection.
//		 * 
//		 * @return the number of elements in this collection
//		 * @see java.util.Collection#size()
//		 * 
//		 */
//		public int utenteSize() {
//			return utente.size();
//		}