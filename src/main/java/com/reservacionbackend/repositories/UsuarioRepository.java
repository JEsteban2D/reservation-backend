package com.reservacionbackend.repositories;

import com.reservacionbackend.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository  extends CrudRepository<UsuarioModel, Long> {

}
