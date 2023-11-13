package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	IAlmacenDAO almacenDAO;
	
	public List<Almacen> findAll() {
		return almacenDAO.findAll();
	}
	
	public Almacen findById(Long id) {
		return almacenDAO.findById(id).get();
	}
	
	public Almacen save(Almacen almacen) {
		return almacenDAO.save(almacen);
	}
	
	public Almacen update(Almacen almacen) {
		return almacenDAO.save(almacen);
	}
	
	public void delete(Long id) {
		almacenDAO.deleteById(id);
	}
	
}
