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

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@Controller
@RequestMapping("/almacen")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenService;
	
	@GetMapping("/all")
	public List<Almacen> getAll() {
		return almacenService.findAll();
	}
	
	@GetMapping("/{id}")
	public Almacen getById(@PathVariable(name="id") Long id) {
		return almacenService.findById(id);
	}
	
	
	@PostMapping("")
	public Almacen createArticulo(@RequestBody Almacen articulo) {
		return almacenService.save(articulo);
	}
	
	@PutMapping("/{id}")
	public Almacen updateArticulo(@PathVariable(name="id")Long id,@RequestBody Almacen almacen) {
		
		Almacen almacenSeleccionado= new Almacen();
		
		almacenSeleccionado= almacenService.findById(id);
		
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		
		almacenSeleccionado = almacenService.update(almacenSeleccionado);
		
		return almacenSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void deleteArticulo(@PathVariable(name="id") Long id) {
		almacenService.delete(id);
	}
	
}
