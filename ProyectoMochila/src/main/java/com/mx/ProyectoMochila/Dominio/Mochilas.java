package com.mx.ProyectoMochila.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MOCHILAS") // tabla MOCHILAS
public class Mochilas {
	/*
	 * ID_MOCHILA NUMBER PRIMARY KEY, CLAVE NVARCHAR2(100) NOT NULL, PRECIO NUMBER,
	 * TAMANO NVARCHAR2 (100)NOT NULL, COLOR NVARCHAR2(100) NOT NULL
	 */

	@Id
	@Column(name = "ID_MOCHILA")
	private Long idMochila;

	@Column(name = "CLAVE")
	private String clave;

	@Column(name = "PRECIO")
	private Float precio;

	@Column(name = "TAMANO")
	private String tamano;

	@Column(name = "COLOR")
	private String color;

	public Mochilas() {

	}

	//contructor con argumentos
	public Mochilas(Long idMochila, String clave, Float precio, String tamano, String color) {
		this.idMochila = idMochila;
		this.clave = clave;
		this.precio = precio;
		this.tamano = tamano;
		this.color = color;
	}

	//metodo to string
	@Override
	public String toString() {
		return "Mochilas [idMochila=" + idMochila + ", clave=" + clave + ", precio=" + precio + ", tamano=" + tamano
				+ ", color=" + color + "]\n";
	}

	//encapsulamiento
	public Long getIdMochila() {
		return idMochila;
	}

	public void setIdMochila(Long idMochila) {
		this.idMochila = idMochila;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
