	package com.smartaparts.domain;

	public abstract class Geo {

		/**
		 * Foto of the place
		 */
		private String urlFoto;

		/**
		 * Nome geografico
		 */
		private String nome;

		/**
		 * Getter of the property <tt>nome</tt>
		 * 
		 * @return Returns the nome.
		 * 
		 */

		public String getNome() {
			return nome;
		}

		/**
		 * Setter of the property <tt>nome</tt>
		 * 
		 * @param nome
		 *            The nome to set.
		 * 
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * Getter of the property <tt>urlFoto</tt>
		 * 
		 * @return Returns the urlFoto.
		 * 
		 */

		public String getUrlFoto() {
			return urlFoto;
		}

		/**
		 * Setter of the property <tt>urlFoto</tt>
		 * 
		 * @param urlFoto
		 *            The urlFoto to set.
		 * 
		 */
		public void setUrlFoto(String urlFoto) {
			this.urlFoto = urlFoto;
		}

	}

	