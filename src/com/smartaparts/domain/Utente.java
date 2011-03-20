	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Utente {

		/**
 *
 */
		private Collection<Ordine> ordini = null;

		/**
 *
 */
		private Collection<Commento> commenti = null;

		/*
		 * (non-javadoc)
		 */
		private Autorizzazione autorizzazione = null;

		/**
		 * Getter of the property <tt>autorizzazione</tt>
		 * 
		 * @return Returns the autorizzazione.
		 * 
		 */

		public Autorizzazione getAutorizzazione() {
			return autorizzazione;
		}

		/**
		 * Setter of the property <tt>autorizzazione</tt>
		 * 
		 * @param autorizzazione
		 *            The autorizzazione to set.
		 * 
		 */
		public void setAutorizzazione(Autorizzazione autorizzazione) {
			this.autorizzazione = autorizzazione;
		}

		/**
		 * Getter of the property <tt>commenti</tt>
		 * 
		 * @return Returns the commenti.
		 * 
		 */

		public Collection<Commento> getCommenti() {
			return commenti;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Commento> commentiIterator() {
			return commenti.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isCommentiEmpty() {
			return commenti.isEmpty();
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
		public boolean containsCommenti(Commento commenti) {
			return this.commenti.contains(commenti);
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
		public boolean containsAllCommenti(Collection<Commento> commenti) {
			return this.commenti.containsAll(commenti);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int commentiSize() {
			return commenti.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Commento[] commentiToArray() {
			return commenti.toArray(new Commento[commenti.size()]);
		}

		/**
		 * Setter of the property <tt>commenti</tt>
		 * 
		 * @param commenti
		 *            the commenti to set.
		 * 
		 */
		public void setCommenti(Collection<Commento> commenti) {
			this.commenti = commenti;
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
		public boolean addCommenti(Commento commenti) {
			return this.commenti.add(commenti);
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
		public boolean removeCommenti(Commento commenti) {
			return this.commenti.remove(commenti);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearCommenti() {
			this.commenti.clear();
		}

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
	// * Getter of the property <tt>autorizzazione</tt>
	// *
	// * @return Returns the autorizzazione.
	// *
	// */
	//
	// public Autorizzazione getAutorizzazione() {
	// return autorizzazione;
	// }
	// /**
	// * Setter of the property <tt>autorizzazione</tt>
	// *
	// * @param autorizzazione
	// * The autorizzazione to set.
	// *
	// */
	// public void setAutorizzazione(Autorizzazione autorizzazione) {
	// this.autorizzazione = autorizzazione;
	// }
	// /**
	// * Getter of the property <tt>ordine</tt>
	// *
	// * @return Returns the ordine.
	// *
	// */
	//
	// public Collection<Ordine> getOrdine() {
	// return ordine;
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
	// public boolean containsOrdine(Ordine ordine) {
	// return this.ordine.contains(ordine);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearOrdine() {
	// this.ordine.clear();
	// }
	// /**
	// * Setter of the property <tt>ordine</tt>
	// *
	// * @param ordine
	// * the ordine to set.
	// *
	// */
	// public void setOrdine(Collection<Ordine> ordine) {
	// this.ordine = ordine;
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
	// public boolean containsAllOrdine(Collection<Ordine> ordine) {
	// return this.ordine.containsAll(ordine);
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
	// public boolean removeOrdine(Ordine ordine) {
	// return this.ordine.remove(ordine);
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
	// public boolean addOrdine(Ordine ordine) {
	// return this.ordine.add(ordine);
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Ordine> ordineIterator() {
	// return ordine.iterator();
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Ordine[] ordineToArray() {
	// return ordine.toArray(new Ordine[ordine.size()]);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int ordineSize() {
	// return ordine.size();
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isOrdineEmpty() {
	// return ordine.isEmpty();
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isCommentoEmpty() {
	// return commento.isEmpty();
	// }
	// /**
	// * Setter of the property <tt>commento</tt>
	// *
	// * @param commento
	// * the commento to set.
	// *
	// */
	// public void setCommento(Collection<Commento> commento) {
	// this.commento = commento;
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
	// public boolean containsAllCommento(Collection<Commento> commento) {
	// return this.commento.containsAll(commento);
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
	// public boolean removeCommento(Commento commento) {
	// return this.commento.remove(commento);
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
	// public boolean addCommento(Commento commento) {
	// return this.commento.add(commento);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearCommento() {
	// this.commento.clear();
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
	// public boolean containsCommento(Commento commento) {
	// return this.commento.contains(commento);
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Commento[] commentoToArray() {
	// return commento.toArray(new Commento[commento.size()]);
	// }
	// /**
	// * Getter of the property <tt>commento</tt>
	// *
	// * @return Returns the commento.
	// *
	// */
	//
	// public Collection<Commento> getCommento() {
	// return commento;
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int commentoSize() {
	// return commento.size();
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Commento> commentoIterator() {
	// return commento.iterator();
	// }
///**
//		 * Getter of the property <tt>autorizzazione</tt>
//		 * 
//		 * @return Returns the autorizzazione.
//		 * 
//		 */
//
//		public Autorizzazione getAutorizzazione() {
//			return autorizzazione;
//		}
///**
//		 * Setter of the property <tt>autorizzazione</tt>
//		 * 
//		 * @param autorizzazione
//		 *            The autorizzazione to set.
//		 * 
//		 */
//		public void setAutorizzazione(Autorizzazione autorizzazione) {
//			this.autorizzazione = autorizzazione;
//		}