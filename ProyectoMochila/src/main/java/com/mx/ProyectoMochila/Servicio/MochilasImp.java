package com.mx.ProyectoMochila.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ProyectoMochila.Dao.MochilasDao;
import com.mx.ProyectoMochila.Dominio.Mochilas;

@Service
public class MochilasImp implements MochilaServ {
	
	@Autowired
	MochilasDao dao;
	

	@Override
	public void guardar(Mochilas mochila) {
		// TODO Auto-generated method stub
		dao.save(mochila);
		
	}

	//EMPEZAMOS CON LISTAR
	@Transactional(readOnly = true)
	@Override
	public List<Mochilas> listar() {
		// TODO Auto-generated method stub
		return (List<Mochilas>) dao.findAll();
	}

	
	@Override
	public Mochilas buscar(Long idMochila) {
		// TODO Auto-generated method stub
		return dao.findById(idMochila).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Mochilas mochila) {
		// TODO Auto-generated method stub
		dao.save(mochila);
		
	}

	@Transactional
	@Override
	public void eliminar(Long idMochila) {
		// TODO Auto-generated method stub
		dao.deleteById(idMochila);
	}

}
