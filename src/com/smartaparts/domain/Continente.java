	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Continente extends com.smartaparts.domain.Geo {

		/**
 *
 */
		private Collection<Nazione> nazioni;

		/**
 *
 */
		private Collection<Appartamento> appartamenti;

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

		/**
		 * Getter of the property <tt>nazioni</tt>
		 * 
		 * @return Returns the nazioni.
		 * 
		 */

		public Collection<Nazione> getNazioni() {
			return nazioni;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Nazione> nazioniIterator() {
			return nazioni.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isNazioniEmpty() {
			return nazioni.isEmpty();
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
		public boolean containsNazioni(Nazione nazioni) {
			return this.nazioni.contains(nazioni);
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
		public boolean containsAllNazioni(Collection<Nazione> nazioni) {
			return this.nazioni.containsAll(nazioni);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int nazioniSize() {
			return nazioni.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Nazione[] nazioniToArray() {
			return nazioni.toArray(new Nazione[nazioni.size()]);
		}

		/**
		 * Setter of the property <tt>nazioni</tt>
		 * 
		 * @param nazioni
		 *            the nazioni to set.
		 * 
		 */
		public void setNazioni(Collection<Nazione> nazioni) {
			this.nazioni = nazioni;
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
		public boolean addNazioni(Nazione nazioni) {
			return this.nazioni.add(nazioni);
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
		public boolean removeNazioni(Nazione nazioni) {
			return this.nazioni.remove(nazioni);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearNazioni() {
			this.nazioni.clear();
		}

	}

	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int nazioneSize() {
	// return nazione.size();
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
	// public boolean addNazione(Nazione nazione) {
	// return this.nazione.add(nazione);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearNazione() {
	// this.nazione.clear();
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Nazione[] nazioneToArray() {
	// return nazione.toArray(new Nazione[nazione.size()]);
	// }
	// /**
	// * Setter of the property <tt>nazione</tt>
	// *
	// * @param nazione
	// * the nazione to set.
	// *
	// */
	// public void setNazione(Collection<Nazione> nazione) {
	// this.nazione = nazione;
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
	// public boolean removeNazione(Nazione nazione) {
	// return this.nazione.remove(nazione);
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
	// public boolean containsAllNazione(Collection<Nazione> nazione) {
	// return this.nazione.containsAll(nazione);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isNazioneEmpty() {
	// return nazione.isEmpty();
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Nazione> nazioneIterator() {
	// return nazione.iterator();
	// }
	// /**
	// * Getter of the property <tt>nazione</tt>
	// *
	// * @return Returns the nazione.
	// *
	// */
	//
	// public Collection<Nazione> getNazione() {
	// return nazione;
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
	// public boolean containsNazione(Nazione nazione) {
	// return this.nazione.contains(nazione);
	// }
///**
//		 * Returns all elements of this collection in an array.
//		 * 
//		 * @return an array containing all of the elements in this collection
//		 * @see java.util.Collection#toArray()
//		 * 
//		 */
//		public Appartamento[] appartamentoToArray() {
//			return appartamento.toArray(new Appartamento[appartamento.size()]);
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains no elements.
//		 * 
//		 * @return <tt>true</tt> if this collection contains no elements
//		 * @see java.util.Collection#isEmpty()
//		 * 
//		 */
//		public boolean isAppartamentoEmpty() {
//			return appartamento.isEmpty();
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
//		public boolean removeAppartamento(Appartamento appartamento) {
//			return this.appartamento.remove(appartamento);
//		}
///**
//		 * Removes all of the elements from this collection (optional
//		 * operation).
//		 * 
//		 * @see java.util.Collection#clear()
//		 * 
//		 */
//		public void clearAppartamento() {
//			this.appartamento.clear();
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
//		public boolean containsAllAppartamento(
//				Collection<Appartamento> appartamento) {
//			return this.appartamento.containsAll(appartamento);
//		}
///**
//		 * Setter of the property <tt>appartamento</tt>
//		 * 
//		 * @param appartamento
//		 *            the appartamento to set.
//		 * 
//		 */
//		public void setAppartamento(Collection<Appartamento> appartamento) {
//			this.appartamento = appartamento;
//		}
///**
//		 * Returns the number of elements in this collection.
//		 * 
//		 * @return the number of elements in this collection
//		 * @see java.util.Collection#size()
//		 * 
//		 */
//		public int appartamentoSize() {
//			return appartamento.size();
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
//		public boolean containsAppartamento(Appartamento appartamento) {
//			return this.appartamento.contains(appartamento);
//		}
///**
//		 * Returns an iterator over the elements in this collection.
//		 * 
//		 * @return an <tt>Iterator</tt> over the elements in this collection
//		 * @see java.util.Collection#iterator()
//		 * 
//		 */
//		public Iterator<Appartamento> appartamentoIterator() {
//			return appartamento.iterator();
//		}
///**
//		 * Getter of the property <tt>appartamento</tt>
//		 * 
//		 * @return Returns the appartamento.
//		 * 
//		 */
//
//		public Collection<Appartamento> getAppartamento() {
//			return appartamento;
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
//		public boolean addAppartamento(Appartamento appartamento) {
//			return this.appartamento.add(appartamento);
//		}