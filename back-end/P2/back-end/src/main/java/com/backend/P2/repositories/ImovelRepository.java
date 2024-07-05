package com.backend.P2.repositories;

import com.backend.P2.entities.Imovel;
import org.springframework.data.repository.CrudRepository;

public interface ImovelRepository extends CrudRepository<Imovel, Long> {
}
