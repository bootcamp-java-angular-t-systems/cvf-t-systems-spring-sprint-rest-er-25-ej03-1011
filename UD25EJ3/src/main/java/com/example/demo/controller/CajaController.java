package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaServiceImpl;

@Controller
@RequestMapping(name = "caja")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaService;
	
	@GetMapping("/all")
	public List<Caja> getAll() {
		return cajaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Caja getById(@PathVariable(name="id") String id) {
		return cajaService.findById(id);
	}
	
	
	@PostMapping("")
	public Caja createArticulo(@RequestBody Caja caja) {
		return cajaService.save(caja);
	}
	
	@PutMapping("/{id}")
	public Caja updateArticulo(@PathVariable(name="id")String id,@RequestBody Caja caja) {
		
		Caja articuloSeleccionado= new Caja();
		
		articuloSeleccionado= cajaService.findById(id);
		
		articuloSeleccionado.setContenido(caja.getContenido());
		articuloSeleccionado.setValor(caja.getValor());
		articuloSeleccionado.setAlmacen(caja.getAlmacen());
		
		
		articuloSeleccionado = cajaService.update(articuloSeleccionado);
		
		return articuloSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void deleteArticulo(@PathVariable(name="id") String id) {
		cajaService.delete(id);
	}
}
