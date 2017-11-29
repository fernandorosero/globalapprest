package com.onetec.globalapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetec.globalapp.entity.Empleado;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable> {

}
