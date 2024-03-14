package com.example.demospringbootapi.repositories;

import com.example.demospringbootapi.model.Equipo;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface EquipoRepository extends CrudRepository<Equipo, BigInteger> {}
