package com.backend.P2.services;

import com.backend.P2.entities.Imovel;
import com.backend.P2.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    public Iterable<Imovel> getAllImoveis() {
        return imovelRepository.findAll();
    }

    public Imovel saveImovel(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void deleteImovel(Long id) {
        imovelRepository.deleteById(id);
    }
}
