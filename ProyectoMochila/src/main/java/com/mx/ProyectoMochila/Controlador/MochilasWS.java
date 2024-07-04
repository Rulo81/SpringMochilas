package com.mx.ProyectoMochila.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ProyectoMochila.Dominio.Mochilas;
import com.mx.ProyectoMochila.Servicio.MochilasImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "MochilasWS")
@CrossOrigin
public class MochilasWS {
	
	@Autowired
	MochilasImp mochilaimp;
	
	//LISTAR MOCHILAS
	// http://localhost:9000/MochilasWS/listar
	@GetMapping(path = "listar")
	public List<Mochilas> listar() {
		return mochilaimp.listar();
	}
	
	//POST GUARDAR
	// http://localhost:9000/MochilasWS/guardar
	@PostMapping(path = "guardar")
	public ResponseEntity<String>guardar(@RequestBody Mochilas mochila){
		mochilaimp.guardar(mochila);
		return new ResponseEntity<String>("SE GUARDO EL REGISTRO", HttpStatus.OK);
	}
	
	//PETICION POST BUSCAR
	// http://localhost:9000/MochilasWS/buscar
	@PostMapping(path = "buscar")
	public Mochilas buscar(@RequestBody Mochilas mochila) {
		return mochilaimp.buscar(mochila.getIdMochila());
	}
	
	//POST EDITAR
	// http://localhost:9000/MochilasWS/editar
	@PostMapping(path = "editar")
	public ResponseEntity<String>editar(@RequestBody Mochilas mochila){
		mochilaimp.editar(mochila);
		return new ResponseEntity<String>("SE EDITO CORRECTAMENTE", HttpStatus.OK);
	}

	//POST ELIMINAR
	// http://localhost:9000/MochilasWS/eliminar
	@PostMapping(path = "eliminar")
	public ResponseEntity<String>eliminar(@RequestBody Mochilas mochila){
		mochilaimp.eliminar(mochila.getIdMochila());
		return new ResponseEntity<String>("SE ELIMINO CORRECTAMENTE", HttpStatus.OK);
	} 

	
	
	
	
	
	

}
