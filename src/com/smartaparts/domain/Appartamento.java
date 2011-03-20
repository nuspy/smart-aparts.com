	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Appartamento {

		/*
		 * (non-javadoc)
		 */
		private Proprietario proprietario = null;

		/*
		 * (non-javadoc)
		 */
		private Zona zona;

		/*
		 * (non-javadoc)
		 */
		private Nazione nazione = null;

		/*
		 * (non-javadoc)
		 */
		private Citta citta = null;

		/**
 *
 */
		private Collection<Commento> commenti = null;

		/**
 *
 */
		private Collection<Prezzo> prezzi;

		/**
 *
 */
		private Collection<Foto> fotos;

		/**
 *
 */
		private Collection<Sconto> sconti;

		/**
 *
 */
		private Collection<LastMinute> lastMinutes;

		/**
 *
 */
		private Collection<Ordine> ordini;

		/*
		 * (non-javadoc)
		 */
		private Continente continente = null;

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

		/**
		 * Getter of the property <tt>lastMinutes</tt>
		 * 
		 * @return Returns the lastMinutes.
		 * 
		 */

		public Collection<LastMinute> getLastMinutes() {
			return lastMinutes;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<LastMinute> lastMinutesIterator() {
			return lastMinutes.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isLastMinutesEmpty() {
			return lastMinutes.isEmpty();
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
		public boolean containsLastMinutes(LastMinute lastMinutes) {
			return this.lastMinutes.contains(lastMinutes);
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
		public boolean containsAllLastMinutes(Collection<LastMinute> lastMinutes) {
			return this.lastMinutes.containsAll(lastMinutes);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int lastMinutesSize() {
			return lastMinutes.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public LastMinute[] lastMinutesToArray() {
			return lastMinutes.toArray(new LastMinute[lastMinutes.size()]);
		}

		/**
		 * Setter of the property <tt>lastMinutes</tt>
		 * 
		 * @param lastMinutes
		 *            the lastMinutes to set.
		 * 
		 */
		public void setLastMinutes(Collection<LastMinute> lastMinutes) {
			this.lastMinutes = lastMinutes;
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
		public boolean addLastMinutes(LastMinute lastMinutes) {
			return this.lastMinutes.add(lastMinutes);
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
		public boolean removeLastMinutes(LastMinute lastMinutes) {
			return this.lastMinutes.remove(lastMinutes);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearLastMinutes() {
			this.lastMinutes.clear();
		}

		/**
		 * Getter of the property <tt>sconti</tt>
		 * 
		 * @return Returns the sconti.
		 * 
		 */

		public Collection<Sconto> getSconti() {
			return sconti;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Sconto> scontiIterator() {
			return sconti.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isScontiEmpty() {
			return sconti.isEmpty();
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
		public boolean containsSconti(Sconto sconti) {
			return this.sconti.contains(sconti);
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
		public boolean containsAllSconti(Collection<Sconto> sconti) {
			return this.sconti.containsAll(sconti);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int scontiSize() {
			return sconti.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Sconto[] scontiToArray() {
			return sconti.toArray(new Sconto[sconti.size()]);
		}

		/**
		 * Setter of the property <tt>sconti</tt>
		 * 
		 * @param sconti
		 *            the sconti to set.
		 * 
		 */
		public void setSconti(Collection<Sconto> sconti) {
			this.sconti = sconti;
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
		public boolean addSconti(Sconto sconti) {
			return this.sconti.add(sconti);
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
		public boolean removeSconti(Sconto sconti) {
			return this.sconti.remove(sconti);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearSconti() {
			this.sconti.clear();
		}

		/**
		 * Getter of the property <tt>fotos</tt>
		 * 
		 * @return Returns the fotos.
		 * 
		 */

		public Collection<Foto> getFotos() {
			return fotos;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Foto> fotosIterator() {
			return fotos.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isFotosEmpty() {
			return fotos.isEmpty();
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
		public boolean containsFotos(Foto fotos) {
			return this.fotos.contains(fotos);
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
		public boolean containsAllFotos(Collection<Foto> fotos) {
			return this.fotos.containsAll(fotos);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int fotosSize() {
			return fotos.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Foto[] fotosToArray() {
			return fotos.toArray(new Foto[fotos.size()]);
		}

		/**
		 * Setter of the property <tt>fotos</tt>
		 * 
		 * @param fotos
		 *            the fotos to set.
		 * 
		 */
		public void setFotos(Collection<Foto> fotos) {
			this.fotos = fotos;
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
		public boolean addFotos(Foto fotos) {
			return this.fotos.add(fotos);
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
		public boolean removeFotos(Foto fotos) {
			return this.fotos.remove(fotos);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearFotos() {
			this.fotos.clear();
		}

		/**
		 * Getter of the property <tt>prezzi</tt>
		 * 
		 * @return Returns the prezzi.
		 * 
		 */

		public Collection<Prezzo> getPrezzi() {
			return prezzi;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Prezzo> prezziIterator() {
			return prezzi.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isPrezziEmpty() {
			return prezzi.isEmpty();
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
		public boolean containsPrezzi(Prezzo prezzi) {
			return this.prezzi.contains(prezzi);
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
		public boolean containsAllPrezzi(Collection<Prezzo> prezzi) {
			return this.prezzi.containsAll(prezzi);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int prezziSize() {
			return prezzi.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Prezzo[] prezziToArray() {
			return prezzi.toArray(new Prezzo[prezzi.size()]);
		}

		/**
		 * Setter of the property <tt>prezzi</tt>
		 * 
		 * @param prezzi
		 *            the prezzi to set.
		 * 
		 */
		public void setPrezzi(Collection<Prezzo> prezzi) {
			this.prezzi = prezzi;
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
		public boolean addPrezzi(Prezzo prezzi) {
			return this.prezzi.add(prezzi);
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
		public boolean removePrezzi(Prezzo prezzi) {
			return this.prezzi.remove(prezzi);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearPrezzi() {
			this.prezzi.clear();
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
		 * Getter of the property <tt>citta</tt>
		 * 
		 * @return Returns the citta.
		 * 
		 */

		public Citta getCitta() {
			return citta;
		}

		/**
		 * Setter of the property <tt>citta</tt>
		 * 
		 * @param citta
		 *            The citta to set.
		 * 
		 */
		public void setCitta(Citta citta) {
			this.citta = citta;
		}

		/**
		 * Getter of the property <tt>nazione</tt>
		 * 
		 * @return Returns the nazione.
		 * 
		 */

		public Nazione getNazione() {
			return nazione;
		}

		/**
		 * Setter of the property <tt>nazione</tt>
		 * 
		 * @param nazione
		 *            The nazione to set.
		 * 
		 */
		public void setNazione(Nazione nazione) {
			this.nazione = nazione;
		}

		/**
		 * Getter of the property <tt>zona</tt>
		 * 
		 * @return Returns the zona.
		 * 
		 */

		public Zona getZona() {
			return zona;
		}

		/**
		 * Setter of the property <tt>zona</tt>
		 * 
		 * @param zona
		 *            The zona to set.
		 * 
		 */
		public void setZona(Zona zona) {
			this.zona = zona;
		}

		/**
		 * Getter of the property <tt>proprietario</tt>
		 * 
		 * @return Returns the proprietario.
		 * 
		 */

		public Proprietario getProprietario() {
			return proprietario;
		}

		/**
		 * Setter of the property <tt>proprietario</tt>
		 * 
		 * @param proprietario
		 *            The proprietario to set.
		 * 
		 */
		public void setProprietario(Proprietario proprietario) {
			this.proprietario = proprietario;
		}

	}

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
	// * Setter of the property <tt>proprietario</tt>
	// *
	// * @param proprietario
	// * The proprietario to set.
	// *
	// */
	// public void setProprietario(Proprietario proprietario) {
	// this.proprietario = proprietario;
	// }
	// /**
	// * Getter of the property <tt>proprietario</tt>
	// *
	// * @return Returns the proprietario.
	// *
	// */
	//
	// public Proprietario getProprietario() {
	// return proprietario;
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
	// * Setter of the property <tt>proprietario</tt>
	// *
	// * @param proprietario
	// * The proprietario to set.
	// *
	// */
	// public void setProprietario(Proprietario proprietario) {
	// this.proprietario = proprietario;
	// }
	// /**
	// * Getter of the property <tt>proprietario</tt>
	// *
	// * @return Returns the proprietario.
	// *
	// */
	//
	// public Proprietario getProprietario() {
	// return proprietario;
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
	// * Setter of the property <tt>zona</tt>
	// *
	// * @param zona
	// * The zona to set.
	// *
	// */
	// public void setZona(Zona zona) {
	// this.zona = zona;
	// }
	// /**
	// * Getter of the property <tt>zona</tt>
	// *
	// * @return Returns the zona.
	// *
	// */
	//
	// public Zona getZona() {
	// return zona;
	// }
	// /**
	// * Setter of the property <tt>nazione</tt>
	// *
	// * @param nazione
	// * The nazione to set.
	// *
	// */
	// public void setNazione(Nazione nazione) {
	// this.nazione = nazione;
	// }
	// /**
	// * Getter of the property <tt>nazione</tt>
	// *
	// * @return Returns the nazione.
	// *
	// */
	//
	// public Nazione getNazione() {
	// return nazione;
	// }
	// /**
	// * Setter of the property <tt>citta</tt>
	// *
	// * @param citta
	// * The citta to set.
	// *
	// */
	// public void setCitta(Citta citta) {
	// this.citta = citta;
	// }
	// /**
	// * Getter of the property <tt>citta</tt>
	// *
	// * @return Returns the citta.
	// *
	// */
	//
	// public Citta getCitta() {
	// return citta;
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
	// /**
	// * Removes a single instance of the specified element from this
	// * collection, if it is present (optional operation).
	// *
	// * @param element
	// * to be removed from this collection, if present.
	// * @see java.util.Collection#add(Object)
	// *
	// */
	// public boolean removePrezzo(Prezzo prezzo) {
	// return this.prezzo.remove(prezzo);
	// }
	// /**
	// * Setter of the property <tt>prezzo</tt>
	// *
	// * @param prezzo
	// * the prezzo to set.
	// *
	// */
	// public void setPrezzo(Collection<Prezzo> prezzo) {
	// this.prezzo = prezzo;
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
	// public boolean containsAllPrezzo(Collection<Prezzo> prezzo) {
	// return this.prezzo.containsAll(prezzo);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int prezzoSize() {
	// return prezzo.size();
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
	// public boolean containsPrezzo(Prezzo prezzo) {
	// return this.prezzo.contains(prezzo);
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Prezzo> prezzoIterator() {
	// return prezzo.iterator();
	// }
	// /**
	// * Getter of the property <tt>prezzo</tt>
	// *
	// * @return Returns the prezzo.
	// *
	// */
	//
	// public Collection<Prezzo> getPrezzo() {
	// return prezzo;
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
	// public boolean addPrezzo(Prezzo prezzo) {
	// return this.prezzo.add(prezzo);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isPrezzoEmpty() {
	// return prezzo.isEmpty();
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Prezzo[] prezzoToArray() {
	// return prezzo.toArray(new Prezzo[prezzo.size()]);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearPrezzo() {
	// this.prezzo.clear();
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
	// public boolean containsFoto(Foto foto) {
	// return this.foto.contains(foto);
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Foto> fotoIterator() {
	// return foto.iterator();
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
	// public boolean removeFoto(Foto foto) {
	// return this.foto.remove(foto);
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Foto[] fotoToArray() {
	// return foto.toArray(new Foto[foto.size()]);
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
	// public boolean containsAllFoto(Collection<Foto> foto) {
	// return this.foto.containsAll(foto);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isFotoEmpty() {
	// return foto.isEmpty();
	// }
	// /**
	// * Setter of the property <tt>foto</tt>
	// *
	// * @param foto
	// * the foto to set.
	// *
	// */
	// public void setFoto(Collection<Foto> foto) {
	// this.foto = foto;
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int fotoSize() {
	// return foto.size();
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
	// public boolean addFoto(Foto foto) {
	// return this.foto.add(foto);
	// }
	// /**
	// * Getter of the property <tt>foto</tt>
	// *
	// * @return Returns the foto.
	// *
	// */
	//
	// public Collection<Foto> getFoto() {
	// return foto;
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearFoto() {
	// this.foto.clear();
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
	// public boolean removeSconto(Sconto sconto) {
	// return this.sconto.remove(sconto);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearSconto() {
	// this.sconto.clear();
	// }
	// /**
	// * Getter of the property <tt>sconto</tt>
	// *
	// * @return Returns the sconto.
	// *
	// */
	//
	// public Collection<Sconto> getSconto() {
	// return sconto;
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Sconto[] scontoToArray() {
	// return sconto.toArray(new Sconto[sconto.size()]);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int scontoSize() {
	// return sconto.size();
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Sconto> scontoIterator() {
	// return sconto.iterator();
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
	// public boolean addSconto(Sconto sconto) {
	// return this.sconto.add(sconto);
	// }
	// /**
	// * Setter of the property <tt>sconto</tt>
	// *
	// * @param sconto
	// * the sconto to set.
	// *
	// */
	// public void setSconto(Collection<Sconto> sconto) {
	// this.sconto = sconto;
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
	// public boolean containsSconto(Sconto sconto) {
	// return this.sconto.contains(sconto);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isScontoEmpty() {
	// return sconto.isEmpty();
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
	// public boolean containsAllSconto(Collection<Sconto> sconto) {
	// return this.sconto.containsAll(sconto);
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
	// public boolean containsLastMinute(LastMinute lastMinute) {
	// return this.lastMinute.contains(lastMinute);
	// }
	// /**
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<LastMinute> lastMinuteIterator() {
	// return lastMinute.iterator();
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
	// public boolean addLastMinute(LastMinute lastMinute) {
	// return this.lastMinute.add(lastMinute);
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
	// public boolean containsAllLastMinute(Collection<LastMinute> lastMinute) {
	// return this.lastMinute.containsAll(lastMinute);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isLastMinuteEmpty() {
	// return lastMinute.isEmpty();
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
	// public boolean removeLastMinute(LastMinute lastMinute) {
	// return this.lastMinute.remove(lastMinute);
	// }
	// /**
	// * Getter of the property <tt>lastMinute</tt>
	// *
	// * @return Returns the lastMinute.
	// *
	// */
	//
	// public Collection<LastMinute> getLastMinute() {
	// return lastMinute;
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearLastMinute() {
	// this.lastMinute.clear();
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public LastMinute[] lastMinuteToArray() {
	// return lastMinute.toArray(new LastMinute[lastMinute.size()]);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int lastMinuteSize() {
	// return lastMinute.size();
	// }
	// /**
	// * Setter of the property <tt>lastMinute</tt>
	// *
	// * @param lastMinute
	// * the lastMinute to set.
	// *
	// */
	// public void setLastMinute(Collection<LastMinute> lastMinute) {
	// this.lastMinute = lastMinute;
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
///**
//		 * Getter of the property <tt>continente</tt>
//		 * 
//		 * @return Returns the continente.
//		 * 
//		 */
//
//		public Continente getContinente() {
//			return continente;
//		}
///**
//		 * Setter of the property <tt>continente</tt>
//		 * 
//		 * @param continente
//		 *            The continente to set.
//		 * 
//		 */
//		public void setContinente(Continente continente) {
//			this.continente = continente;
//		}