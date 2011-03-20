	package com.smartaparts.domain;

	import java.util.Collection;
	import java.util.Iterator;

	public class Citta extends com.smartaparts.domain.Geo {

		/**
 *
 */
		private Collection<Appartamento> appartamenti;

		/**
 *
 */
		private Collection<Zona> zone;

		/*
		 * (non-javadoc)
		 */
		private Nazione nazione = null;

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
		 * Getter of the property <tt>zone</tt>
		 * 
		 * @return Returns the zone.
		 * 
		 */

		public Collection<Zona> getZone() {
			return zone;
		}

		/**
		 * Returns an iterator over the elements in this collection.
		 * 
		 * @return an <tt>Iterator</tt> over the elements in this collection
		 * @see java.util.Collection#iterator()
		 * 
		 */
		public Iterator<Zona> zoneIterator() {
			return zone.iterator();
		}

		/**
		 * Returns <tt>true</tt> if this collection contains no elements.
		 * 
		 * @return <tt>true</tt> if this collection contains no elements
		 * @see java.util.Collection#isEmpty()
		 * 
		 */
		public boolean isZoneEmpty() {
			return zone.isEmpty();
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
		public boolean containsZone(Zona zone) {
			return this.zone.contains(zone);
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
		public boolean containsAllZone(Collection<Zona> zone) {
			return this.zone.containsAll(zone);
		}

		/**
		 * Returns the number of elements in this collection.
		 * 
		 * @return the number of elements in this collection
		 * @see java.util.Collection#size()
		 * 
		 */
		public int zoneSize() {
			return zone.size();
		}

		/**
		 * Returns all elements of this collection in an array.
		 * 
		 * @return an array containing all of the elements in this collection
		 * @see java.util.Collection#toArray()
		 * 
		 */
		public Zona[] zoneToArray() {
			return zone.toArray(new Zona[zone.size()]);
		}

		/**
		 * Setter of the property <tt>zone</tt>
		 * 
		 * @param zone
		 *            the zone to set.
		 * 
		 */
		public void setZone(Collection<Zona> zone) {
			this.zone = zone;
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
		public boolean addZone(Zona zone) {
			return this.zone.add(zone);
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
		public boolean removeZone(Zona zone) {
			return this.zone.remove(zone);
		}

		/**
		 * Removes all of the elements from this collection (optional
		 * operation).
		 * 
		 * @see java.util.Collection#clear()
		 * 
		 */
		public void clearZone() {
			this.zone.clear();
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

	}

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
	// * Returns an iterator over the elements in this collection.
	// *
	// * @return an <tt>Iterator</tt> over the elements in this collection
	// * @see java.util.Collection#iterator()
	// *
	// */
	// public Iterator<Zona> zonaIterator() {
	// return zona.iterator();
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
	// public boolean addZona(Zona zona) {
	// return this.zona.add(zona);
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
	// public boolean removeZona(Zona zona) {
	// return this.zona.remove(zona);
	// }
	// /**
	// * Setter of the property <tt>zona</tt>
	// *
	// * @param zona
	// * the zona to set.
	// *
	// */
	// public void setZona(Collection<Zona> zona) {
	// this.zona = zona;
	// }
	// /**
	// * Returns all elements of this collection in an array.
	// *
	// * @return an array containing all of the elements in this collection
	// * @see java.util.Collection#toArray()
	// *
	// */
	// public Zona[] zonaToArray() {
	// return zona.toArray(new Zona[zona.size()]);
	// }
	// /**
	// * Returns the number of elements in this collection.
	// *
	// * @return the number of elements in this collection
	// * @see java.util.Collection#size()
	// *
	// */
	// public int zonaSize() {
	// return zona.size();
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
	// public boolean containsZona(Zona zona) {
	// return this.zona.contains(zona);
	// }
	// /**
	// * Removes all of the elements from this collection (optional
	// * operation).
	// *
	// * @see java.util.Collection#clear()
	// *
	// */
	// public void clearZona() {
	// this.zona.clear();
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
	// public boolean containsAllZona(Collection<Zona> zona) {
	// return this.zona.containsAll(zona);
	// }
	// /**
	// * Returns <tt>true</tt> if this collection contains no elements.
	// *
	// * @return <tt>true</tt> if this collection contains no elements
	// * @see java.util.Collection#isEmpty()
	// *
	// */
	// public boolean isZonaEmpty() {
	// return zona.isEmpty();
	// }
	// /**
	// * Getter of the property <tt>zona</tt>
	// *
	// * @return Returns the zona.
	// *
	// */
	//
	// public Collection<Zona> getZona() {
	// return zona;
	// }
///**
//		 * Getter of the property <tt>nazione</tt>
//		 * 
//		 * @return Returns the nazione.
//		 * 
//		 */
//
//		public Nazione getNazione() {
//			return nazione;
//		}
///**
//		 * Setter of the property <tt>nazione</tt>
//		 * 
//		 * @param nazione
//		 *            The nazione to set.
//		 * 
//		 */
//		public void setNazione(Nazione nazione) {
//			this.nazione = nazione;
//		}