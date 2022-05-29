package net.javaguides.springboot.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.model.poducto;

@Repository
public interface ProductoRepository extends JpaRepository<poducto, Long>{
	poducto findFirstByNombre(String nombre);
}