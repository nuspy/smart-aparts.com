	package com.smartaparts.domain;

	public class Foto {

		/*
		 * (non-javadoc)
		 */
		private Appartamento appartamento = null;

		/*
		 * (non-javadoc)
		 */
		private String url;

		/**
		 * Getter of the property <tt>appartamento</tt>
		 * 
		 * @return Returns the appartamento.
		 * 
		 */

		public Appartamento getAppartamento() {
			return appartamento;
		}

		/**
		 * Setter of the property <tt>appartamento</tt>
		 * 
		 * @param appartamento
		 *            The appartamento to set.
		 * 
		 */
		public void setAppartamento(Appartamento appartamento) {
			this.appartamento = appartamento;
		}

		/**
		 * Getter of the property <tt>url</tt>
		 * 
		 * @return Returns the url.
		 * 
		 */

		public String getUrl() {
			return url;
		}

		/**
		 * Setter of the property <tt>url</tt>
		 * 
		 * @param url
		 *            The url to set.
		 * 
		 */
		public void setUrl(String attribute) {
			this.url = attribute;
		}

	}

	// /**
	// * Getter of the property <tt>appartamento</tt>
	// *
	// * @return Returns the appartamento.
	// *
	// */
	//
	// public Appartamento getAppartamento() {
	// return appartamento;
	// }
	// /**
	// * Setter of the property <tt>appartamento</tt>
	// *
	// * @param appartamento
	// * The appartamento to set.
	// *
	// */
	// public void setAppartamento(Appartamento appartamento) {
	// this.appartamento = appartamento;
	// }