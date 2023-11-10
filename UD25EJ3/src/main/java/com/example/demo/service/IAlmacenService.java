package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {

public List<Almacen> findAll();

	public Almacen findById(Long id);

	public Almacen update(Almacen almacen);

	public Almacen save(Almacen almacen);

	public void delete(Long id);
}
