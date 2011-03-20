	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Nazione extends com.smartaparts.domain.Geo {

		/*
		 * (non-javadoc)
		 */
		private Continente continente = null;

		/**
 *
 */
		private Collection<Appartamento> appartamenti;

		/**
 *
 */
		private Collection<Citta> cittas;

		/**
		 * Getter of the property <tt>cittas</tt>
		 * 
		 * @return Returns the cittas.
		 * 
		 */

		public Collection<Citta> getCittas() {
			return cittas;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Citta> cittasIterator() {
			return cittas.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isCittasEmpty() {
			return cittas.isEmpty();
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
		public boolean containsCittas(Citta cittas) {
			return this.cittas.contains(cittas);
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
		public boolean containsAllCittas(Collection<Citta> cittas) {
			return this.cittas.containsAll(cittas);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int cittasSize() {
			return cittas.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Citta[] cittasToArray() {
			return cittas.toArray(new Citta[cittas.size()]);
		}

		/**
		 * Setter of the property <tt>cittas</tt>
		 * 
		 * @param cittas
		 *            the cittas to set.
		 * 
		 */
		public void setCittas(Collection<Citta> cittas) {
			this.cittas = cittas;
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
		public boolean addCittas(Citta cittas) {
			return this.cittas.add(cittas);
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
		public boolean removeCittas(Citta cittas) {
			return this.cittas.remove(cittas);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearCittas() {
			this.cittas.clear();
		}

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
		 * Getter of the property <tt>continente</tt>
		 * 
		 * @return Returns the continente.
		 * 
		 */

		public Continente getContinente() {
			return continente;
		}

		/**
		 * Setter of the property <tt>continente</tt>
		 * 
		 * @param continente
		 *            The continente to set.
		 * 
		 */
		public void setContinente(Continente continente) {
			this.continente = continente;
		}

	}

	// /**
	// * Getter of the property <tt>continente</tt>
	// *
	// * @return Returns the continente.
	// *
	// */
	//
	// public Continente getContinente() {
	// return continente;
	// }
	// /**
	// * Setter of the property <tt>continente</tt>
	// *
	// * @param continente
	// * The continente to set.
	// *
	// */
	// public void setContinente(Continente continente) {
	// this.continente = continente;
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
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isAppartamentoEmpty() {
	// return appartamento.isEmpty();
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
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearAppartamento() {
	// this.appartamento.clear();
	// }
///**
//		 * Removes a single instance of the specified element from this
//		 * collection, if it is present (optional operation).
//		 * 
//		 * @param element
//		 *            to be removed from this collection, if present.
//		 * @see java.util.Collection#add(Object)
//		 * 
//		 */
//		public boolean removeCitta(Citta citta) {
//			return this.citta.remove(citta);
//		}
///**
//		 * Returns an iterator over the elements in this collection.
//		 * 
//		 * @return an <tt>Iterator</tt> over the elements in this collection
//		 * @see java.util.Collection#iterator()
//		 * 
//		 */
//		public Iterator<Citta> cittaIterator() {
//			return citta.iterator();
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
//		public boolean containsAllCitta(Collection<Citta> citta) {
//			return this.citta.containsAll(citta);
//		}
///**
//		 * Getter of the property <tt>citta</tt>
//		 * 
//		 * @return Returns the citta.
//		 * 
//		 */
//
//		public Collection<Citta> getCitta() {
//			return citta;
//		}
///**
//		 * Removes all of the elements from this collection (optional
//		 * operation).
//		 * 
//		 * @see java.util.Collection#clear()
//		 * 
//		 */
//		public void clearCitta() {
//			this.citta.clear();
//		}
///**
//		 * Returns the number of elements in this collection.
//		 * 
//		 * @return the number of elements in this collection
//		 * @see java.util.Collection#size()
//		 * 
//		 */
//		public int cittaSize() {
//			return citta.size();
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
//		public boolean containsCitta(Citta citta) {
//			return this.citta.contains(citta);
//		}
///**
//		 * Returns all elements of this collection in an array.
//		 * 
//		 * @return an array containing all of the elements in this collection
//		 * @see java.util.Collection#toArray()
//		 * 
//		 */
//		public Citta[] cittaToArray() {
//			return citta.toArray(new Citta[citta.size()]);
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
//		public boolean addCitta(Citta citta) {
//			return this.citta.add(citta);
//		}
///**
//		 * Setter of the property <tt>citta</tt>
//		 * 
//		 * @param citta
//		 *            the citta to set.
//		 * 
//		 */
//		public void setCitta(Collection<Citta> citta) {
//			this.citta = citta;
//		}
///**
//		 * Returns <tt>true</tt> if this collection contains no elements.
//		 * 
//		 * @return <tt>true</tt> if this collection contains no elements
//		 * @see java.util.Collection#isEmpty()
//		 * 
//		 */
//		public boolean isCittaEmpty() {
//			return citta.isEmpty();
//		}