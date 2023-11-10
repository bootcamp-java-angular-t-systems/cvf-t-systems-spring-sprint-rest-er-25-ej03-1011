package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaService {

	public List<Caja> findAll();

	public Caja findById(int id);

	public Caja update(Caja caja);

	public Caja save(Caja caja);

	public void delete(int id);
}
