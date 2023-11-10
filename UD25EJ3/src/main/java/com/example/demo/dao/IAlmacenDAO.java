package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Almacen;

@Repository
public interface IAlmacenDAO extends JpaRepository<Almacen, Long>{

}
