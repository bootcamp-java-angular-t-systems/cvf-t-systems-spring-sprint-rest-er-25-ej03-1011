package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

public class CajaServiceImpl {

	@Autowired
	ICajaDAO cajaDAO;

	public List<Caja> findAll() {
		return cajaDAO.findAll();
	}

	public Caja findById(String id) {
		return cajaDAO.findById(id).get();
	}

	public Caja save(Caja caja) {
		return cajaDAO.save(caja);
	}

	public Caja update(Caja caja) {
		return cajaDAO.save(caja);
	}

	public void delete(String id) {
		cajaDAO.deleteById(id);
	}
}
