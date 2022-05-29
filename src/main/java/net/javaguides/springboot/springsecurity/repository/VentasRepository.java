package net.javaguides.springboot.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.springsecurity.model.Venta;


public interface VentasRepository extends CrudRepository<Venta, Integer> {

}
