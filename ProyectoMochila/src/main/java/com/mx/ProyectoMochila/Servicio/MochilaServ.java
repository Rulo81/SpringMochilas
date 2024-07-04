package com.mx.ProyectoMochila.Servicio;

import java.util.List;

import com.mx.ProyectoMochila.Dominio.Mochilas;

public interface MochilaServ {

	public void guardar(Mochilas mochila);
	
	public List<Mochilas>listar();
	
	public Mochilas buscar(Long idMochila);
	
	public void editar (Mochilas mochila);
	
	public void eliminar (Long idMochila);
	
}
